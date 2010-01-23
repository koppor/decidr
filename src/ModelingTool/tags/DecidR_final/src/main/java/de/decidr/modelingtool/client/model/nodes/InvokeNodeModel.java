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

package de.decidr.modelingtool.client.model.nodes;

import de.decidr.modelingtool.client.model.container.HasChildModels;

/**
 * This is the parent model of all invoke node models.
 * 
 * @author Johannes Engelhardt
 */
public class InvokeNodeModel extends NodeModel {

    public InvokeNodeModel() {
        super();
    }

    public InvokeNodeModel(HasChildModels parentModel) {
        super(parentModel);
    }

}
