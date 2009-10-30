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
package de.decidr.modelingtool.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>. Only needed for test
 * purposes.
 */
public class ModelingTool implements EntryPoint {

    private String connections_dwdl = "<workflow name=\"Simple Workflow\" id=\"1255353235687\" targetNamespace=\"namespace\" xmlns=\"schema\"><description></description><variables><variable name=\"L123\" label=\"Fault Message\" type=\"string\" configurationVariable=\"no\"><initialValue>Workflow failed</initialValue></variable><variable name=\"L12\" label=\"Success Message\" type=\"string\" configurationVariable=\"no\"><initialValue>Workflow succeded</initialValue></variable><variable name=\"L768768\" label=\"Text\" type=\"string\" configurationVariable=\"yes\"><initialValue>Loram Ipsum</initialValue></variable></variables><roles><role configurationVariable=\"no\" label=\"Recipient\" name=\"L345\"><actor userId=\"decidradmin\" /></role></roles><faultHandler><setProperty name=\"message\" variable=\"L123\" /><recipient><setProperty name=\"name\" variable=\"L345\" /></recipient></faultHandler><nodes><startNode name=\"de.decidr.modelingtool.client.model.StartNodeModel\" id=\"1255353235765\"><description></description><graphics x=\"25\" y=\"25\" width=\"50\" height=\"30\" /><sources><source arcId=\"1255353235812\" /></sources></startNode><flowNode name=\"de.decidr.modelingtool.client.model.FlowContainerModel\" id=\"1255353235813\"><description></description><graphics x=\"105\" y=\"102\" width=\"505\" height=\"326\" /><sources><source arcId=\"1255353235843\" /></sources><targets><target arcId=\"1255353235812\" /></targets><nodes><invokeNode name=\"de.decidr.modelingtool.client.model.humantask.HumanTaskInvokeNodeModel\" id=\"1255353235844\" activity=\"Decidr-HumanTask\"><description></description><graphics x=\"57\" y=\"142\" width=\"100\" height=\"60\" /><sources><source arcId=\"1255353235875\" /></sources><targets><target arcId=\"1255353235876\" /></targets><setProperty name=\"wfmID\" variable=\"L1255353235687\" /><setProperty name=\"user\" /><setProperty name=\"name\" /><setProperty name=\"description\" /><setProperty name=\"userNotification\"><propertyValue>no</propertyValue></setProperty><getProperty name=\"taskResult\" variable=\"Lnull\"><parameters><humanTaskData /></parameters></getProperty></invokeNode><invokeNode name=\"de.decidr.modelingtool.client.model.EmailInvokeNodeModel\" id=\"1255353235890\" activity=\"Decidr-Email\"><description></description><graphics x=\"310\" y=\"145\" width=\"100\" height=\"60\" /><sources><source arcId=\"1255353235921\" /></sources><targets><target arcId=\"1255353235922\" /></targets><setProperty name=\"to\" /><setProperty name=\"cc\" /><setProperty name=\"bcc\" /><setProperty name=\"subject\" /><setProperty name=\"message\" /><setProperty name=\"attachement\" /></invokeNode></nodes><arcs><arc name=\"de.decidr.modelingtool.client.model.ContainerStartConnectionModel\" id=\"1255353235876\" source=\"1255353235813\" target=\"1255353235844\" /><arc name=\"de.decidr.modelingtool.client.model.ContainerExitConnectionModel\" id=\"1255353235921\" source=\"1255353235890\" target=\"1255353235813\" /><arc name=\"de.decidr.modelingtool.client.model.ContainerExitConnectionModel\" id=\"1255353235875\" source=\"1255353235844\" target=\"1255353235813\" /><arc name=\"de.decidr.modelingtool.client.model.ContainerStartConnectionModel\" id=\"1255353235922\" source=\"1255353235813\" target=\"1255353235890\" /></arcs></flowNode><endNode name=\"de.decidr.modelingtool.client.model.EndNodeModel\" id=\"1255353235937\"><description></description><graphics x=\"619\" y=\"480\" width=\"50\" height=\"30\" /><targets><target arcId=\"1255353235843\" /></targets><notificationOfSuccess><setProperty name=\"successMessage\" variable=\"L12\" /><setProperty name=\"recipient\" variable=\"L345\" /></notificationOfSuccess></endNode></nodes><arcs><arc name=\"de.decidr.modelingtool.client.model.ConnectionModel\" id=\"1255353235812\" source=\"1255353235765\" target=\"1255353235813\" /><arc name=\"de.decidr.modelingtool.client.model.ConnectionModel\" id=\"1255353235843\" source=\"1255353235813\" target=\"1255353235937\" /></arcs></workflow> ";

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        RootPanel.get("panel").add(ModelingToolWidget.getInstance());
//        ModelingToolWidget.getInstance().init();
        // TODO, JS: This is test data
        ModelingToolWidget
                .getInstance()
                .setUsers(
                        "<userlist><user id=\"23\" name=\"Clark Kent\"/><user id=\"42\" name=\"Bruce Wayne\"/><user id=\"113\" name=\"Peter Parker\"/></userlist>");

       
        
        ModelingToolWidget.getInstance().setDWDL("<workflow name=\"Simple Workflow\" id=\"3141\" targetNamespace=\"namespace\" xmlns=\"schema\"><description></description><variables /><roles /><faultHandler><setProperty name=\"message\" /><recipient><setProperty name=\"name\" /></recipient></faultHandler><nodes><startNode name=\"de.decidr.modelingtool.client.model.StartNodeModel\" id=\"4815162342\"><description></description><graphics x=\"20\" y=\"20\" width=\"50\" height=\"30\" /></startNode><endNode name=\"de.decidr.modelingtool.client.model.EndNodeModel\" id=\"108\"><description></description><graphics x=\"200\" y=\"200\" width=\"50\" height=\"30\" /><notificationOfSuccess><setProperty name=\"successMessage\" /><setProperty name=\"recipient\" /></notificationOfSuccess></endNode></nodes><arcs /></workflow>");
    }

}
