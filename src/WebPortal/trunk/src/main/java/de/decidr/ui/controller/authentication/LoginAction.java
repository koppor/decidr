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

package de.decidr.ui.controller.authentication;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import de.decidr.model.exceptions.TransactionException;
import de.decidr.ui.controller.UIDirector;
import de.decidr.ui.view.LoginComponent;
import de.decidr.ui.view.Main;
import de.decidr.ui.view.navigationmenus.HorizontalNavigationMenu;
import de.decidr.ui.view.windows.InformationDialogComponent;

/**
 * This action implements the login. It calls the authenticate method and logs
 * the user into the application.
 * 
 * @author AT
 */
public class LoginAction implements ClickListener {

    private Login login = new Login();
    UIDirector uiDirector = Main.getCurrent().getUIDirector();

    /*
     * (non-Javadoc)
     * 
     * @seecom.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.
     * ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        try {
            login
                    .authenticate(((LoginComponent) uiDirector
                            .getTemplateView().getNavigation())
                            .getUsernameTextField().getValue().toString(),
                            ((LoginComponent) uiDirector.getTemplateView()
                                    .getNavigation()).getPasswordTextField()
                                    .getValue().toString());
            ((HorizontalNavigationMenu) uiDirector.getTemplateView()
                    .getHNavigation()).getLogoutButton().setVisible(true);
        } catch (TransactionException exception) {
        	Main.getCurrent().getMainWindow().addWindow(
                    new InformationDialogComponent("Password and/or Username mismatch!", "Login failed"));
        }

    }

}
