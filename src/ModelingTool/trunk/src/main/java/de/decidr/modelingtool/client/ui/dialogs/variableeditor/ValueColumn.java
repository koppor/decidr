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

package main.java.de.decidr.modelingtool.client.ui.dialogs.variableeditor;

import main.java.de.decidr.modelingtool.client.model.VariableType;

import com.extjs.gxt.ui.client.widget.form.SimpleComboBox;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;

/**
 * TODO: add comment
 * 
 * @author JS
 */
public class ValueColumn extends ColumnConfig {

	private SimpleComboBox<String> selection = new SimpleComboBox<String>();
	private CellEditor comboBoxCellEditor;
	
	public ValueColumn(String columnId, String header) {
		this.setId(columnId);
		this.setHeader(header);
		

		for (VariableType type: VariableType.values()){
			selection.add(type.getName());
		}
		this.setEditor(comboBoxCellEditor);
	}
}
