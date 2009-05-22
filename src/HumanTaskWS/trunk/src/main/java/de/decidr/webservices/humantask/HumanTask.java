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

import javax.jws.WebService;

import org.apache.log4j.Logger;

import de.decidr.model.facades.WorkItemFacade;
import de.decidr.model.logging.DefaultLogger;
import de.decidr.model.permissions.HumanTaskRole;
import de.decidr.model.permissions.Role;
import de.decidr.model.soap.types.IDList;
import de.decidr.model.soap.types.TaskIdentifier;

/**
 * This is an implementation of the {@link HumanTaskInterface DecidR HumanTask
 * interface}.
 * 
 * @author RR
 */
@WebService(endpointInterface = "HumanTaskInterface")
public class HumanTask implements HumanTaskInterface {
    Logger log;
    private static final Role HUMANTASK_ROLE = HumanTaskRole.getInstance();

    /**
     * Default constructor to activate logging.
     */
    public HumanTask() {
        log = DefaultLogger.getLogger(this.getClass());
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.decidr.webservices.humantask.HumanTaskInterface#createTask(long,
     * long, long, java.lang.String, boolean, java.lang.String,
     * de.decidr.model.soap.types.ItemList)
     */
    @Override
    public TaskIdentifier createTask(long wfmID, long processID, long userID,
            String taskName, boolean userNotification, String description,
            String taskData) {
        TaskIdentifier id = new TaskIdentifier();
        id.setProcessID(processID);
        id.setUserID(userID);
        id.setTaskID(new WorkItemFacade(HUMANTASK_ROLE).createWorkItem(userID,
                wfmID, processID + "", taskName, description, taskData
                        .getBytes(), userNotification));

        return id;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.decidr.webservices.humantask.HumanTaskInterface#removeTask(de.decidr
     * .model.soap.types.IDList)
     */
    @Override
    public void removeTask(IDList taskIDList) {
        for (long id : taskIDList.getId()) {
            new WorkItemFacade(HUMANTASK_ROLE).deleteWorkItem(id);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.decidr.webservices.humantask.HumanTaskInterface#removeTasks(long)
     */
    @Override
    public void removeTasks(long processID) {
        // FIXME: find a way to get tasks associated with
        throw new java.lang.UnsupportedOperationException("Please implement "
                + this.getClass().getName() + "#removeTasks");
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.decidr.webservices.humantask.HumanTaskInterface#taskCompleted(long)
     */
    @Override
    public void taskCompleted(long taskID) {
        Object taskData = new WorkItemFacade(HUMANTASK_ROLE)
                .getWorkItem(taskID).getItemProperty("data").getValue();
        // TODO Auto-generated method stub
        throw new java.lang.UnsupportedOperationException("Please implement "
                + this.getClass().getName() + "#taskCompleted");
    }
}
