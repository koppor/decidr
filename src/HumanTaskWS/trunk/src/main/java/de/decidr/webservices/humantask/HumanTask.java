/*
 * The DecidR Development Team licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.decidr.webservices.humantask;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;

import org.apache.log4j.Logger;

import de.decidr.model.commands.workitem.GetWorkItemCommand;
import de.decidr.model.entities.WorkItem;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.facades.WorkItemFacade;
import de.decidr.model.facades.WorkflowInstanceFacade;
import de.decidr.model.logging.DefaultLogger;
import de.decidr.model.permissions.HumanTaskRole;
import de.decidr.model.permissions.Role;
import de.decidr.model.soap.types.IDList;
import de.decidr.model.soap.types.TaskIdentifier;
import de.decidr.model.transactions.HibernateTransactionCoordinator;
import de.decidr.model.webservices.HumanTaskInterface;

/**
 * This is an implementation of the {@link HumanTaskInterface DecidR HumanTask
 * interface}.
 * 
 * @author Reinhold
 */
@WebService(endpointInterface = "HumanTaskInterface")
public class HumanTask implements HumanTaskInterface {
    private static Logger log = DefaultLogger.getLogger(HumanTask.class);
    private static final Role HUMANTASK_ROLE = HumanTaskRole.getInstance();

    @Override
    public TaskIdentifier createTask(long wfmID, String processID, long userID,
            String taskName, boolean userNotification, String description,
            String taskData) throws TransactionException {
        log.trace("Entering method: createTask");

        log.debug("creating work item in database");
        long taskID = new WorkItemFacade(HUMANTASK_ROLE).createWorkItem(userID,
                wfmID, processID + "", taskName, description, taskData
                        .getBytes(), userNotification);

        // id is needed by the ODE Engine to identify this task
        TaskIdentifier id = new TaskIdentifier(taskID, processID, userID);

        log.trace("Leaving method: createTask");
        return id;
    }

    @Override
    public void removeTask(IDList taskIDList) throws TransactionException {
        log.trace("Entering method: removeTask");
        WorkItemFacade facade = new WorkItemFacade(HUMANTASK_ROLE);
        for (long id : taskIDList.getId()) {
            log.debug("removing work item with ID: " + id);
            facade.deleteWorkItem(id);
        }
        log.trace("Leaving method: removeTask");
    }

    @Override
    public void removeTasks(long wfmID, String processID)
            throws TransactionException {
        log.trace("Entering method: removeTasks");
        log.debug("calling WorkflowInstanceFacade to remove the items");
        new WorkflowInstanceFacade(HUMANTASK_ROLE).removeAllWorkItems(
                processID, wfmID);
        log.trace("Leaving method: removeTasks");
    }

    @Override
    public void taskCompleted(long taskID) throws TransactionException {
        log.trace("Entering method: taskCompleted");
        log.debug("getting data associated with task");

        GetWorkItemCommand cmd = new GetWorkItemCommand(HUMANTASK_ROLE, taskID);
        HibernateTransactionCoordinator.getInstance().runTransaction(cmd);
        WorkItem workItem = cmd.getResult();

        byte[] taskData = workItem.getData();

        TaskIdentifier id = new TaskIdentifier(taskID, workItem
                .getWorkflowInstance().getOdePid(), workItem.getUser().getId());

        // RR: get wsdl url from config
        try {
            new BPELCallbackClient(new URL("")).getBPELCallbackInterfacePort()
                    .taskCompleted(id, taskData.toString());
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        log.trace("Leaving method: taskCompleted");
        throw new java.lang.UnsupportedOperationException("Please implement "
                + this.getClass().getName() + "#taskCompleted");
    }
}
