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

package de.decidr.ui.controller.user;

import java.util.Date;

import javax.servlet.http.HttpSession;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import de.decidr.model.acl.roles.Role;
import de.decidr.model.annotations.Reviewed;
import de.decidr.model.annotations.Reviewed.State;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.facades.UserFacade;
import de.decidr.ui.view.Main;
import de.decidr.ui.view.windows.TransactionErrorDialogComponent;

/**
 * This action cancels the decidr membership of a user.<br>
 * 
 * @author Geoffrey-Alexeij Heinze
 */
@Reviewed(reviewers = { "RR" }, lastRevision = "2351", currentReviewState = State.Rejected)
public class CancelMembershipAction implements ClickListener {

    private static final long serialVersionUID = 1L;

    private HttpSession session = Main.getCurrent().getSession();

    private Role role = (Role) session.getAttribute("role");
    private Long userId = (Long) session.getAttribute("userId");
    private UserFacade userFacade = new UserFacade(role);


    public void buttonClick(ClickEvent event) {
        // Aleks, GH: how to cancel membership?

        try {
            userFacade.setDisabledSince(userId, new Date());
        } catch (TransactionException e) {
            Main.getCurrent().getMainWindow().addWindow(
                    new TransactionErrorDialogComponent(e));
        }

        Main.getCurrent().getMainWindow().showNotification(
        // Aleks, GH: I'm pretty sure we don't implement this functionality. Ask
                // DH ~rr
                "You are no longer a member of DecidR");
        Main.getCurrent().getMainWindow().removeWindow(
                event.getButton().getWindow());
    }
}
