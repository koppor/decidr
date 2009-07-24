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

package de.decidr.modelingtool.client.ui;

import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Label;

import de.decidr.modelingtool.client.ModelingToolWidget;
import de.decidr.modelingtool.client.ui.dialogs.DialogRegistry;
import de.decidr.modelingtool.client.ui.dialogs.email.EmailActivityWindow;
import de.decidr.modelingtool.client.ui.dialogs.email.EmailActivityWindowInvoker;

/**
 * This node represents an email activity.
 * 
 * @author Johannes Engelhardt
 */
public class EmailInvokeNode extends InvokeNode {

    public EmailInvokeNode(HasChildren parentPanel) {
        super(parentPanel);

        FocusPanel graphic = new FocusPanel();
        graphic.addStyleName("node-graphic-std");
        graphic.setWidget(new Label("Email"));

        graphic.setWidget(new Button(ModelingToolWidget.messages
                .changePropertyButton(), new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                EmailActivityWindowInvoker.invoke(EmailInvokeNode.this);
                DialogRegistry.getInstance().showDialog(
                        EmailActivityWindow.class.getName());
            }
        }));
        this.setGraphic(graphic);

        setInputPort(new InputPort());
        setOutputPort(new OutputPort());
    }

}
