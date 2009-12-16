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
package de.decidr.ui.view.navigationmenus;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.decidr.model.annotations.Reviewed;
import de.decidr.model.annotations.Reviewed.State;
import de.decidr.ui.controller.show.ShowChangeTenantAction;
import de.decidr.ui.controller.show.ShowCreateTenantAction;
import de.decidr.ui.controller.show.ShowMyWorkitemsAction;
import de.decidr.ui.controller.show.ShowProfileSettingsAction;

/**
 * The navigation menu for the user. He has less links than the super
 * administrator, the workflow administrator and the tenant administrator.
 * 
 * @author AT
 */
@Reviewed(reviewers = { "RR" }, lastRevision = "2384", currentReviewState = State.PassedWithComments)
public class UserNavigationMenu extends CustomComponent {

    private static final long serialVersionUID = -3304973028559451364L;

    private VerticalLayout verticalLayout;

    private Button myWorkItemLink = null;
    private Button changeTenantLink = null;
    private Button createTenantLink = null;
    private Button profileSettingsLink = null;

    private Label workflowParticipationLabel = null;
    private Label tenantsLabel = null;
    private Label settingsLabel = null;

    /**
     * TODO useful documentation
     */
    public UserNavigationMenu() {
        init();
    }

    /**
     * This method initializes the components of this {@link UserNavigationMenu}
     * component.
     */
    private void init() {
        verticalLayout = new VerticalLayout();
        this.setCompositionRoot(verticalLayout);

        myWorkItemLink = new Button("My Workitems", new ShowMyWorkitemsAction());
        myWorkItemLink.setStyleName(Button.STYLE_LINK);
        changeTenantLink = new Button("Change Tenant",
                new ShowChangeTenantAction());
        changeTenantLink.setStyleName(Button.STYLE_LINK);
        profileSettingsLink = new Button("Profile Settings",
                new ShowProfileSettingsAction());
        createTenantLink = new Button("Create Tenant",
                new ShowCreateTenantAction());
        createTenantLink.setStyleName(Button.STYLE_LINK);
        profileSettingsLink.setStyleName(Button.STYLE_LINK);

        workflowParticipationLabel = new Label(
                "<h5>Workflow Participation</h5>");
        workflowParticipationLabel.setContentMode(Label.CONTENT_XHTML);
        tenantsLabel = new Label("<h5>Tenants</h5>");
        tenantsLabel.setContentMode(Label.CONTENT_XHTML);
        settingsLabel = new Label("<h5>Settings</h5>");
        settingsLabel.setContentMode(Label.CONTENT_XHTML);

        verticalLayout.setSpacing(true);

        verticalLayout.addComponent(workflowParticipationLabel);
        verticalLayout.addComponent(myWorkItemLink);
        verticalLayout.addComponent(changeTenantLink);

        verticalLayout.addComponent(tenantsLabel);
        verticalLayout.addComponent(createTenantLink);

        verticalLayout.addComponent(settingsLabel);
        verticalLayout.addComponent(profileSettingsLink);
    }
}
