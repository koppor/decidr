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

package de.decidr.ui.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.XMLParser;
import com.vaadin.data.Item;
import com.vaadin.terminal.PaintException;
import com.vaadin.terminal.PaintTarget;
import com.vaadin.ui.AbstractComponent;

import de.decidr.model.acl.roles.TenantAdminRole;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.facades.TenantFacade;
import de.decidr.model.facades.WorkflowModelFacade;
import de.decidr.model.logging.DefaultLogger;
import de.decidr.ui.view.Main;
import de.decidr.ui.view.windows.TransactionErrorDialogComponent;

/**
 * This class represents the server side component of the modeling tool widget
 * which is integrated in the Vaadin web portal. It is used to communicate with
 * the client side of the modeling toll widget. The modeling tool is an abstract
 * component which is wrapped by a window and displayed to the user.
 * 
 * @author AT
 */
@SuppressWarnings("serial")
public class ModelingTool extends AbstractComponent {

    private Logger logger = DefaultLogger.getLogger(ModelingTool.class);

    private HttpSession session = null;
    private Long userId = null;
    private Long tenantId = null;
    private TenantFacade tenantFacade = null;
    private WorkflowModelFacade workflowModelFacade = null;
    private Long workflowModelId = null;
    private HashMap<Long, String> userList = null;

    /**
     * Default constructor which initializes the server side components which
     * are needed to gain access to the database.
     */
    public ModelingTool(Long workflowModelId) {
        super();
        session = Main.getCurrent().getSession();
        userId = (Long) session.getAttribute("userId");
        tenantId = (Long) Main.getCurrent().getSession().getAttribute(
                "tenantId");
        tenantFacade = new TenantFacade(new TenantAdminRole(userId));
        workflowModelFacade = new WorkflowModelFacade(new TenantAdminRole(
                userId));
        this.workflowModelId = workflowModelId;
        this.setSizeFull();
        this.setImmediate(true);
    }

    @Override
    public String getTag() {
        return "modelingtool";
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.vaadin.ui.AbstractComponent#changeVariables(java.lang.Object,
     * java.util.Map)
     */
    @SuppressWarnings("unchecked")
    @Override
    public void changeVariables(Object source, Map variables) {
        if (variables.containsKey("dwdl")) {
            byte[] dwdl = (byte[]) variables.get("dwdl");
            try {

                workflowModelFacade.saveWorkflowModel(workflowModelId, "", "",
                        dwdl);
            } catch (TransactionException e) {
                Main.getCurrent().addWindow(
                        new TransactionErrorDialogComponent(e));
            }
        }
    }

    private String convertUserHashMapToString(HashMap<Long, String> userList) {
        Document doc = XMLParser.createDocument();

        Element root = doc.createElement("userlist");
        for (Long userId : userList.keySet()) {
            Element user = doc.createElement("user");
            user.setAttribute("id", userId.toString());
            user.setAttribute("name", userList.get(user));
            root.appendChild(user);
        }

        return doc.toString();
    }

    private String getDWDL() {
        try {
            Item workflowModel = workflowModelFacade
                    .getWorkflowModel(workflowModelId);
            return new String((byte[]) workflowModel.getItemProperty("dwdl")
                    .getValue());

        } catch (TransactionException e) {
            Main.getCurrent().addWindow(new TransactionErrorDialogComponent(e));
            return null;
        }
    }

    private String getUsers() {
        userList = new HashMap<Long, String>();
        try {
            logger.debug("Getting user list from server...");
            List<Item> users = tenantFacade.getUsersOfTenant(tenantId, null);
            for (Item item : users) {
                if (item.getItemProperty("username").getValue() == null
                        || item.getItemProperty("username").getValue().equals(
                                "")) {
                    /*
                     * If the user name is empty, we want to display the email
                     * address as user name.
                     */
                    userList.put((Long) item.getItemProperty("id").getValue(),
                            (String) item.getItemProperty("email").getValue());
                } else {
                    /*
                     * user name is not empty, but we want to set the user name
                     * to a more "fancy" string, for example: John Doe (jdoe42)
                     */
                    Long id = (Long) item.getItemProperty("id").getValue();
                    String username = (String) item.getItemProperty("username")
                            .getValue();
                    userList.put(id, username);
                }
            }
            logger.debug("Succeded retrieving user list from server.");
            return convertUserHashMapToString(userList);
        } catch (TransactionException exception) {
            Main.getCurrent().addWindow(
                    new TransactionErrorDialogComponent(exception));
            return null;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.vaadin.ui.AbstractComponent#paintContent(com.vaadin.terminal.PaintTarget
     * )
     */
    @Override
    public void paintContent(PaintTarget target) throws PaintException {
        super.paintContent(target);
        target.addVariable(this, "dwdl", getDWDL());
        target.addVariable(this, "users", getUsers());
    }
}
