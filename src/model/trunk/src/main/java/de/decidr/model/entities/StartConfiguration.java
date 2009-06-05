package de.decidr.model.entities;

// Generated 05.06.2009 17:08:24 by Hibernate Tools 3.2.2.GA

/**
 * StartConfiguration generated by hbm2java
 */
public class StartConfiguration implements java.io.Serializable {

    private long id;
    private DeployedWorkflowModel deployedWorkflowModel;
    private byte[] startConfiguration;

    public StartConfiguration() {
    }

    public StartConfiguration(long id,
            DeployedWorkflowModel deployedWorkflowModel,
            byte[] startConfiguration) {
        this.id = id;
        this.deployedWorkflowModel = deployedWorkflowModel;
        this.startConfiguration = startConfiguration;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DeployedWorkflowModel getDeployedWorkflowModel() {
        return this.deployedWorkflowModel;
    }

    public void setDeployedWorkflowModel(
            DeployedWorkflowModel deployedWorkflowModel) {
        this.deployedWorkflowModel = deployedWorkflowModel;
    }

    public byte[] getStartConfiguration() {
        return this.startConfiguration;
    }

    public void setStartConfiguration(byte[] startConfiguration) {
        this.startConfiguration = startConfiguration;
    }

    // The following is extra code specified in the hbm.xml files
    private static final long serialVersionUID = 1L;
    // end of extra code specified in the hbm.xml files

}
