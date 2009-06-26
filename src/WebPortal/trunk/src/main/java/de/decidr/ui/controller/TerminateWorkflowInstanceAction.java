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

package de.decidr.ui.controller;

import javax.servlet.http.HttpSession;

import com.vaadin.service.ApplicationContext;
import com.vaadin.terminal.gwt.server.WebApplicationContext;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import de.decidr.ui.view.Main;

/**
 * This action terminates a workflow instance
 *
 * @author GH
 */
public class TerminateWorkflowInstanceAction  implements ClickListener  {

    private ApplicationContext ctx = Main.getCurrent().getContext();
    private WebApplicationContext webCtx = (WebApplicationContext)ctx;
    private HttpSession session = webCtx.getHttpSession();
    
    private Long userId = (Long)session.getAttribute("userId");
    //FIXME: private WorkflowInstanceFacade wfiFacade = new WorkflowInstanceFacade(new UserRole(userId));

    private Long instanceId = null;
    
    /**
     * Constructor, requires id of the instance to be terminated
     *
     * @param id
     */
    public TerminateWorkflowInstanceAction(Long id){
        instanceId = id;
    }

    /* (non-Javadoc)
     * @see com.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        //TODO: stopWorkflowInstance vs. deleteWorkflowInstance
        //wfiFacade.stopWorkflowInstance(instanceId);
    }
}