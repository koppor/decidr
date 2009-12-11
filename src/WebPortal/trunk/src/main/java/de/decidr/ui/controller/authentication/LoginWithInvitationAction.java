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

import de.decidr.model.annotations.Reviewed;
import de.decidr.model.annotations.Reviewed.State;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.ui.controller.UIDirector;
import de.decidr.ui.view.LoginComponent;
import de.decidr.ui.view.Main;
import de.decidr.ui.view.navigationmenus.HorizontalNavigationMenu;
import de.decidr.ui.view.windows.InvitationDialogComponent;

/**
 * This action implements the login procedure. It calls the authenticate method
 * and logs the user into the application and shows a invitation dialog.
 * 
 * @author Geoffrey-Alexeij Heinze
 */
@Reviewed(reviewers = { "RR" }, lastRevision = "2345", currentReviewState = State.PassedWithComments)
public class LoginWithInvitationAction implements ClickListener {

    private static final long serialVersionUID = 1L;
    private Login login = new Login();
    UIDirector uiDirector = Main.getCurrent().getUIDirector();
    private InvitationDialogComponent invitationDialog = null;

    /**
     * @param invD
     *            {@link InvitationDialogComponent} that is shown after
     *            successful login
     */
    public LoginWithInvitationAction(InvitationDialogComponent invD) {
        invitationDialog = invD;
    }

    /*
     * (non-Javadoc)
     * 
     * @seecom.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.
     * ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        try {
            // GH, Aleks: Please!!! try to avoid these! ~rr
            // RR Run!!! Those are coming! (please be more specific with your
            // description of the problem) ~gh
            login
                    .authenticate(((LoginComponent) uiDirector
                            .getTemplateView().getContent())
                            .getUsernameTextField().getValue().toString(),
                            ((LoginComponent) uiDirector.getTemplateView()
                                    .getContent()).getPasswordTextField()
                                    .getValue().toString());
            ((HorizontalNavigationMenu) uiDirector.getTemplateView()
                    .getHNavigation()).getLogoutButton().setVisible(true);
            Main.getCurrent().getMainWindow().addWindow(invitationDialog);
        } catch (TransactionException exception) {
            Main.getCurrent().getMainWindow().showNotification(
                    "Login failed!");
        }
    }
}
