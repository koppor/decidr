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
package de.decidr.model.entities;

// Generated 22.01.2010 14:51:15 by Hibernate Tools 3.2.4.GA

/**
 * StartConfiguration generated by hbm2java.
 */
public class StartConfiguration implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;

    /** The deployed workflow model. */
    private DeployedWorkflowModel deployedWorkflowModel;

    /** The start configuration. */
    private byte[] startConfiguration;

    /**
     * Instantiates a new start configuration.
     */
    public StartConfiguration() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new start configuration.
     * 
     * @param deployedWorkflowModel
     *            the deployed workflow model
     * @param startConfiguration
     *            the start configuration
     */
    public StartConfiguration(DeployedWorkflowModel deployedWorkflowModel,
            byte[] startConfiguration) {
        // generated full constructor
        this.deployedWorkflowModel = deployedWorkflowModel;
        this.startConfiguration = startConfiguration;
    }

    /**
     * Gets the deployed workflow model.
     * 
     * @return the deployed workflow model
     */
    public DeployedWorkflowModel getDeployedWorkflowModel() {
        return this.deployedWorkflowModel;
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Gets the start configuration.
     * 
     * @return the start configuration
     */
    public byte[] getStartConfiguration() {
        return this.startConfiguration;
    }

    /**
     * Sets the deployed workflow model.
     * 
     * @param deployedWorkflowModel
     *            the new deployed workflow model
     */
    public void setDeployedWorkflowModel(
            DeployedWorkflowModel deployedWorkflowModel) {
        this.deployedWorkflowModel = deployedWorkflowModel;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets the start configuration.
     * 
     * @param startConfiguration
     *            the new start configuration
     */
    public void setStartConfiguration(byte[] startConfiguration) {
        this.startConfiguration = startConfiguration;
    }

}
