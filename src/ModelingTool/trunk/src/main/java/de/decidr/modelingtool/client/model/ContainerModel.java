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

package de.decidr.modelingtool.client.model;

import java.util.List;
import java.util.Vector;

/**
 * TODO: add comment
 *
 * @author JE
 */
public class ContainerModel extends NodeModel {

    /**
     * TODO: add comment
     *
     * @param parentModel
     */
    public ContainerModel(HasChildModels parentModel) {
        super(parentModel);
        // TODO Auto-generated constructor stub
    }

    private List<Model> childModels = new Vector<Model>();
    
    private List<ConnectionModel> startConnections = new Vector<ConnectionModel>();
    
    private List<ConnectionModel> endConnections = new Vector<ConnectionModel>();
    
    public void addModel(Model model) {
        childModels.add(model);
    }
    
    public void removeModel(Model model) {
        childModels.remove(model);
    }
    
    public void addStartConnection(ConnectionModel model) {
        startConnections.add(model);
    }
    
    public void removeStartConnection(ConnectionModel model) {
        startConnections.remove(model);
    }
    
    public void addEndConnection(ConnectionModel model) {
        endConnections.add(model);
    }
    
    public void removeEndConnection(ConnectionModel model) {
        endConnections.remove(model);
    }
    
}
