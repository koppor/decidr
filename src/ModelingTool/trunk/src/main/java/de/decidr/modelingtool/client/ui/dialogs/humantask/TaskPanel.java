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

package de.decidr.modelingtool.client.ui.dialogs.humantask;

import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.event.ToolBarEvent;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.form.CheckBox;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.toolbar.TextToolItem;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;

import de.decidr.modelingtool.client.ModelingTool;
import de.decidr.modelingtool.client.model.Variable;
import de.decidr.modelingtool.client.model.VariableType;
import de.decidr.modelingtool.client.model.VariablesFilter;

/**
 * TODO: add comment
 * 
 * @author Jonas Schlaak
 */
public class TaskPanel extends ContentPanel {

    /*
     * This contstant holds die number of fields which are not to be removed by
     * the removeEntry method.
     */
    private static final int STATICFIELDS = 3;

    private ScrollPanel taskScrollPanel;
    private FlexTable taskTable;
    private List<TextField<String>> fields = new ArrayList<TextField<String>>();

    public TaskPanel() {
        super();

        this.setHeading(ModelingTool.messages.humanTaskActivity());
        this.setLayout(new FitLayout());

        taskTable = new FlexTable();
        taskTable.setBorderWidth(0);
        taskTable.setWidth("100%");
        taskTable.setCellPadding(2);
        taskTable.setCellSpacing(2);
        taskScrollPanel = new ScrollPanel(taskTable);
        this.add(taskScrollPanel);

        createToolBar();
    }

    public void createFields() {
        ComboBox<Variable> userField = new ComboBox<Variable>();
        userField.setDisplayField(Variable.NAME);
        userField.setStore(VariablesFilter
                .getVariablesOfType(VariableType.ROLE));
        userField.setTypeAhead(true);
        userField.setWidth("200px");
        taskTable.insertRow(taskTable.getRowCount());
        taskTable.setWidget(taskTable.getRowCount() - 1, 0, new Label(
                ModelingTool.messages.userLabel()));
        taskTable.setWidget(taskTable.getRowCount() - 1, 1, userField);

        ComboBox<Variable> formField = new ComboBox<Variable>();
        formField.setDisplayField(Variable.NAME);
        formField.setStore(VariablesFilter
                .getVariablesOfType(VariableType.FORM));
        formField.setTypeAhead(true);
        formField.setWidth("200px");
        taskTable.insertRow(taskTable.getRowCount());
        taskTable.setWidget(taskTable.getRowCount() - 1, 0, new Label(
                ModelingTool.messages.formLabel()));
        taskTable.setWidget(taskTable.getRowCount() - 1, 1, formField);

        CheckBox notifyCheckBox = new CheckBox();
        taskTable.insertRow(taskTable.getRowCount());
        taskTable.setWidget(taskTable.getRowCount() - 1, 0, new Label(
                ModelingTool.messages.notifyLabel()));
        taskTable.setWidget(taskTable.getRowCount() - 1, 1, notifyCheckBox);
    }

    /**
     * TODO: add comment
     * 
     */
    private void createToolBar() {
        ToolBar toolBar = new ToolBar();

        TextToolItem addVar = new TextToolItem(ModelingTool.messages.addValue()); //$NON-NLS-1$
        addVar.addSelectionListener(new SelectionListener<ToolBarEvent>() {
            @Override
            public void componentSelected(ToolBarEvent ce) {
                addEntry(ModelingTool.messages.newStringValue());
            }
        });
        toolBar.add(addVar);

        TextToolItem delVar = new TextToolItem(ModelingTool.messages.delValue()); //$NON-NLS-1$
        delVar.addSelectionListener(new SelectionListener<ToolBarEvent>() {
            @Override
            public void componentSelected(ToolBarEvent ce) {
                removeEntry();
            }
        });
        toolBar.add(delVar);

        this.setBottomComponent(toolBar);
    }

    private void addEntry(String fieldContent) {
        TextField<String> text = new TextField<String>();
        text.setValue(fieldContent);
        text.setAutoWidth(true);
        fields.add(text);
        taskTable.insertRow(taskTable.getRowCount());
        taskTable.setWidget(taskTable.getRowCount() - 1, 0, new Label(
                ModelingTool.messages.workItemLabel()));
        taskTable.setWidget(taskTable.getRowCount() - 1, 1, text);

        ComboBox<Variable> combo = new ComboBox<Variable>();
        combo.setDisplayField(Variable.NAME);
        combo.setStore(VariablesFilter.getAllVariables());
        combo.setTypeAhead(true);
        taskTable.setWidget(taskTable.getRowCount() - 1, 2, new Label(
                ModelingTool.messages.workItemOutputVar()));
        taskTable.setWidget(taskTable.getRowCount() - 1, 3, combo);
    }

    private void removeEntry() {
        if (taskTable.getRowCount() > STATICFIELDS) {
            taskTable.removeRow(taskTable.getRowCount() - 1);
            fields.remove(taskTable.getRowCount() - STATICFIELDS);
        }
    }

    public void clearAllEntries() {
        if (taskTable.getRowCount() > 0) {
            int start = taskTable.getRowCount();
            for (int i = start; i > 0; i--) {
                taskTable.removeRow(i - 1);
            }
        }
        if (fields.size() > 0) {
            fields.clear();
        }
    }
}
