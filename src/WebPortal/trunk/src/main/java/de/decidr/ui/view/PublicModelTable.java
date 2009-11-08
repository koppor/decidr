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

package de.decidr.ui.view;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.servlet.http.HttpSession;

import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.ui.Table;

import de.decidr.model.acl.roles.UserRole;
import de.decidr.model.exceptions.TransactionException;
import de.decidr.model.facades.WorkflowModelFacade;
import de.decidr.model.filters.Filter;
import de.decidr.model.filters.KeywordFilter;
import de.decidr.model.filters.Paginator;
import de.decidr.ui.data.PublicModelContainer;

/**
 * The tabel contains the public workflow models as items.
 * 
 * @author AT
 */
public class PublicModelTable extends Table implements Observer {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -8901605163680575150L;

	private Observable observable = null;
	private Container publicModelContainer = null;

	private HttpSession session = Main.getCurrent().getSession();

	private Long userId = (Long) session.getAttribute("userId");

	WorkflowModelFacade workflowModelFacade = new WorkflowModelFacade(
			new UserRole(userId));

	List<Item> publishedModelList = null;

	private KeywordFilter filter = new KeywordFilter();

	private List<Filter> filterList = new LinkedList<Filter>();
	
	private Paginator paginator = new Paginator();

	/**
	 * Default constructor. Adds this table as an observer to the container
	 * which notifies the table if there are any changes in the data.
	 * 
	 */
	public PublicModelTable(Observable observable, Container container) {
		this.observable = observable;
		publicModelContainer = container;
		observable.addObserver(this);
		init(container);
	}

	/**
	 * Initializes the table and sets the container and the properties.
	 * 
	 * @param observable
	 * @param container
	 */
	private void init(Container container) {
		setSizeFull();
		setContainerDataSource(container);
		addContainerProperty("Name", String.class, null);
		addContainerProperty("Creation Date", String.class, null);
		addContainerProperty("Tenant Name", String.class, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof PublicModelContainer) {
			filterList.add(filter);
			try {
				publishedModelList = workflowModelFacade
						.getAllPublishedWorkflowModels(filterList, paginator);
				for (Item item : publishedModelList) {
					addItem(item);
				}
				this.requestRepaint();
			} catch (TransactionException exception) {
				Main.getCurrent().getMainWindow().addWindow(
						new TransactionErrorDialogComponent(exception));
			}
		}

	}

}
