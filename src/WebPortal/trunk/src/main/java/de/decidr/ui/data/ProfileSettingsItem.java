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

/**
 * Wraps the item returned by userFacade.getProfileItems
 *
 * @author GH
 */

import java.util.Collection;

import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.util.BeanItem;
import com.vaadin.service.ApplicationContext;
import com.vaadin.terminal.gwt.server.WebApplicationContext;

import javax.servlet.http.HttpSession;

import de.decidr.model.facades.UserFacade;
import de.decidr.model.permissions.UserRole;
import de.decidr.ui.view.Main;

public class ProfileSettingsItem implements Item{

    //TODO: remove // below, code is disabled for testing, since the model causes errors
    
    //private ApplicationContext ctx = Main.getCurrent().getContext();
    //private WebApplicationContext webCtx = (WebApplicationContext)ctx;
    //private HttpSession session = webCtx.getHttpSession();
    
    //private Long userId = (Long)session.getAttribute("userId");
    //private UserFacade userFacade = new UserFacade(new UserRole(userId));

	//private Item items = userFacade.getUserProfile(userId);
	
	//TODO: remove, only for test
	private Item items = new BeanItem(ProfileSettingsContainer.getInstance());
	
	/* (non-Javadoc)
	 * @see com.vaadin.data.Item#addItemProperty(java.lang.Object, com.vaadin.data.Property)
	 */
	@Override
	public boolean addItemProperty(Object id, Property property)
			throws UnsupportedOperationException {
		return items.addItemProperty(id, property);
	}

	/* (non-Javadoc)
	 * @see com.vaadin.data.Item#getItemProperty(java.lang.Object)
	 */
	@Override
	public Property getItemProperty(Object id) {
		return items.getItemProperty(id);
	}

	/* (non-Javadoc)
	 * @see com.vaadin.data.Item#getItemPropertyIds()
	 */
	@Override
	public Collection<?> getItemPropertyIds() {
		return items.getItemPropertyIds();
	}

	/* (non-Javadoc)
	 * @see com.vaadin.data.Item#removeItemProperty(java.lang.Object)
	 */
	@Override
	public boolean removeItemProperty(Object id)
			throws UnsupportedOperationException {
		return items.removeItemProperty(id);
	}

}
