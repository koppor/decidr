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

package de.decidr.ui.controller.show;

import com.vaadin.data.Item;
import com.vaadin.ui.Table;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import de.decidr.model.acl.roles.Role;
import de.decidr.model.acl.roles.TenantAdminRole;
import de.decidr.model.annotations.Reviewed;
import de.decidr.model.annotations.Reviewed.State;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.facades.UserFacade;
import de.decidr.ui.controller.UIDirector;
import de.decidr.ui.view.Main;
import de.decidr.ui.view.ProfileSettingsComponent;
import de.decidr.ui.view.SiteFrame;
import de.decidr.ui.view.UserListComponent;
import de.decidr.ui.view.windows.TransactionErrorDialogComponent;

/**
 * This action gets the user profile which belongs to the user selected in the
 * table and displays the {@link ProfileSettingsComponent} with the values of
 * the selected user.
 * 
 * @author AT
 */
@Reviewed(reviewers = { "RR" }, lastRevision = "2358", currentReviewState = State.Passed)
public class ShowEditUserAction implements ClickListener {

    private static final long serialVersionUID = 1L;
    private UIDirector uiDirector = Main.getCurrent().getUIDirector();
    private SiteFrame siteFrame = uiDirector.getTemplateView();

    private UserFacade userFacade = null;

    private Table table = null;

    Role role = (Role) Main.getCurrent().getSession().getAttribute("role");

    /*
     * (non-Javadoc)
     * 
     * @seecom.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.
     * ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        table = ((UserListComponent) siteFrame.getContent()).getUserListTable();
        Item item = table.getItem(table.getValue());

        userFacade = new UserFacade(role);

        try {
            Item profileItem = userFacade.getUserProfile((Long) item
                    .getItemProperty("id").getValue());
            ProfileSettingsComponent profile = new ProfileSettingsComponent(
                    profileItem);
            siteFrame.setContent(profile);
            if (role instanceof TenantAdminRole) {
                profile.getCancelMembershipLink().setVisible(true);
            }
        } catch (TransactionException e) {
            Main.getCurrent().getMainWindow().addWindow(
                    new TransactionErrorDialogComponent(e));
        }
    }
}
