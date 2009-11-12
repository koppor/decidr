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

import com.vaadin.data.Container;
import com.vaadin.ui.Table;

/**
 * This table holds the tenants as items.
 * 
 * @author AT
 */
public class TenantTable extends Table {

	/**
	 * Serial Version UID
	 */
	private static final long serialVersionUID = -4777680020350752428L;

	private Container tenantContainer = null;

	public static final Object[] NAT_COL_ORDER = new Object[] { "id", "name" };

	public static final String[] COL_HEADERS = new String[] { "ID", "Name" };

	/**
	 * Default constructor.
	 * 
	 */
	public TenantTable(Container container) {
		tenantContainer = container;
		init();

	}

	/**
	 * Initializes the table and sets the container data source.
	 * 
	 * 
	 */
	private void init() {
		setSizeFull();
		setContainerDataSource(tenantContainer);

		addContainerProperty("id", Long.class, null);
		addContainerProperty("name", String.class, null);

		setVisibleColumns(NAT_COL_ORDER);
		setColumnHeaders(COL_HEADERS);
		setSelectable(true);
		setMultiSelect(true);
		setPageLength(10);
	}

}
