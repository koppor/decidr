package de.decidr.model.entities;

// Generated 29.05.2009 18:32:43 by Hibernate Tools 3.2.2.GA

/**
 * UserAdministratesWorkflowModel generated by hbm2java
 */
public class UserAdministratesWorkflowModel implements java.io.Serializable {

    private UserAdministratesWorkflowModelId id;
    private WorkflowModel workflowModel;
    private User user;

    public UserAdministratesWorkflowModel() {
    }

    public UserAdministratesWorkflowModel(UserAdministratesWorkflowModelId id,
            WorkflowModel workflowModel, User user) {
        this.id = id;
        this.workflowModel = workflowModel;
        this.user = user;
    }

    public UserAdministratesWorkflowModelId getId() {
        return this.id;
    }

    public void setId(UserAdministratesWorkflowModelId id) {
        this.id = id;
    }

    public WorkflowModel getWorkflowModel() {
        return this.workflowModel;
    }

    public void setWorkflowModel(WorkflowModel workflowModel) {
        this.workflowModel = workflowModel;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
