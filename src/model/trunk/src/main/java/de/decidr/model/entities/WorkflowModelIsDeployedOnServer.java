package de.decidr.model.entities;

// Generated 14.12.2009 17:42:31 by Hibernate Tools 3.2.4.GA

/**
 * WorkflowModelIsDeployedOnServer generated by hbm2java
 */
public class WorkflowModelIsDeployedOnServer implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private WorkflowModelIsDeployedOnServerId id;
    private DeployedWorkflowModel deployedWorkflowModel;
    private Server server;

    public WorkflowModelIsDeployedOnServer() {
        //default empty JavaBean constructor
    }

    public WorkflowModelIsDeployedOnServer(
            WorkflowModelIsDeployedOnServerId id,
            DeployedWorkflowModel deployedWorkflowModel, Server server) {
        //generated full constructor
        this.id = id;
        this.deployedWorkflowModel = deployedWorkflowModel;
        this.server = server;
    }

    public WorkflowModelIsDeployedOnServerId getId() {
        return this.id;
    }

    public void setId(WorkflowModelIsDeployedOnServerId id) {
        this.id = id;
    }

    public DeployedWorkflowModel getDeployedWorkflowModel() {
        return this.deployedWorkflowModel;
    }

    public void setDeployedWorkflowModel(
            DeployedWorkflowModel deployedWorkflowModel) {
        this.deployedWorkflowModel = deployedWorkflowModel;
    }

    public Server getServer() {
        return this.server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

}
