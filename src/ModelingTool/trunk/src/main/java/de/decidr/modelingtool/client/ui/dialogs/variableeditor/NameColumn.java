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

package de.decidr.modelingtool.client.ui.dialogs.variableeditor;

import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;

/**
 * TODO: add comment
 * 
 * @author Jonas Schlaak
 */
public class NameColumn extends ColumnConfig {

    private TextField<String> text = new TextField<String>();

    public NameColumn(String columnId, String header) {
        this.setId(columnId);
        this.setHeader(header);
        this.setWidth(120);

        text.setAllowBlank(false);
        text.setAutoWidth(true);
        text.setAutoValidate(false);
        this.setEditor(new CellEditor(text));
    }

}
