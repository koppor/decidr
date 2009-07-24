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

import de.decidr.modelingtool.client.ui.ModelChangeListener;

/**
 * This abstract model provides basic functionality of all models; id, name,
 * description, change listener.
 * 
 * @author Johannes Engelhardt
 */
public abstract class AbstractModel implements Model {

    /** The change listener of this model. Null, if none is registered. */
    protected ModelChangeListener changeListener = null;

    /** The unique id of the model. */
    private long id;

    /** The name of the model. */
    private String name;

    /** The description of the model. */
    private String description;

    /**
     * Notifies the change listener (if present) that any data in the model has
     * changed. Has to be called manually.
     */
    public void fireDataChanged() {
        if (changeListener != null) {
            changeListener.onModelChange();
        }
    }

    @Override
    public ModelChangeListener getChangeListener() {
        return changeListener;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setChangeListener(ModelChangeListener changeListener) {
        this.changeListener = changeListener;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
