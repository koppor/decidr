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

package de.decidr.ui.view.windows;

import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

import de.decidr.ui.controller.HideDialogWindowAction;
import de.decidr.ui.controller.workflowmodel.CreateWorkflowModelAction;

/**
 * This window is called when a user wants to create a new workflow model. He
 * can enter a name and a description for the created worklfow model. Afterwards
 * the modeling tool is called when the users presses the ok button.
 * 
 * @author AT
 */
public class WorkflowDescriptionWindow extends Window {

    private VerticalLayout verticalLayout = null;
    private HorizontalLayout buttonHorizontalLayout = null;

    private Button okButton = null;
    private Button cancelButton = null;

    private TextField nameTextField = null;
    private TextField descriptionTextField = null;
    
    private Table table = null;

    /**
     * Default constructor which calls the init method
     * 
     */
    public WorkflowDescriptionWindow(Table table) {
    	this.table = table;
        init();
    }

    public TextField getNameTextField() {
        return nameTextField;
    }

    /**
     * Initializes the components
     * 
     */
    private void init() {
        verticalLayout = new VerticalLayout();
        verticalLayout.setSpacing(true);
        buttonHorizontalLayout = new HorizontalLayout();
        buttonHorizontalLayout.setSpacing(true);
        
        nameTextField = new TextField("Name");
        descriptionTextField = new TextField("Description");

        okButton = new Button("OK");
        okButton.addListener(new Button.ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				new CreateWorkflowModelAction(
		                nameTextField.getValue().toString(), table);
				
			}
        	
        });
        cancelButton = new Button("Cancel", new HideDialogWindowAction());

        verticalLayout.addComponent(nameTextField);
        nameTextField.setColumns(10);

        verticalLayout.addComponent(descriptionTextField);
        descriptionTextField.setColumns(10);
        descriptionTextField.setRows(5);

        verticalLayout.addComponent(buttonHorizontalLayout);

        buttonHorizontalLayout.addComponent(okButton);
        buttonHorizontalLayout.addComponent(cancelButton);

        this.setContent(verticalLayout);
        this.setResizable(false);
        this.setSizeUndefined();
        this.setCaption("Workflow description");
        this.center();
        this.setModal(true);
        this.setWidth("100px");
    }

}
