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

/**
 * This action saves changes of the system settings
 *
 * @author Geoffrey-Alexeij Heinze
 */

import javax.servlet.http.HttpSession;

import com.vaadin.data.Item;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

import de.decidr.model.acl.roles.UserRole;
import de.decidr.model.facades.SystemFacade;
import de.decidr.ui.view.Main;
import de.decidr.ui.view.SystemSettingComponent;

public class SaveSystemSettingsAction implements ClickListener {

    private HttpSession session = Main.getCurrent().getSession();

    private Long userId = (Long) session.getAttribute("userId");
    private SystemFacade systemFacade = new SystemFacade(new UserRole(userId));

    private SystemSettingComponent content = null;
    private Item item = null;

    /*
     * (non-Javadoc)
     * 
     * @seecom.vaadin.ui.Button.ClickListener#buttonClick(com.vaadin.ui.Button.
     * ClickEvent)
     */
    @Override
    public void buttonClick(ClickEvent event) {
        content = (SystemSettingComponent) UIDirector.getInstance()
                .getTemplateView().getContent();
        content.saveSettingsItem();
        item = content.getSettingsItem();
        // GH: SystemFacade.setSettings has changed
//        try {
//            systemFacade.setSettings((Boolean) item.getItemProperty(
//                    "autoAcceptNewTenants").getValue(), (Level) item
//                    .getItemProperty("logLevel").getValue());
//        } catch (TransactionException e) {
//            Main.getCurrent().getMainWindow().addWindow(
//                    new TransactionErrorDialogComponent());
//        }

        // TODO: remove
        Main.getCurrent().getMainWindow().showNotification(
                "System Settings Saved");
    }

}
