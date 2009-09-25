package de.decidr.model.entities;

// Generated 25.09.2009 13:27:01 by Hibernate Tools 3.2.4.GA

/**
 * UserAdministratesWorkflowModel generated by hbm2java
 */
public class UserAdministratesWorkflowModel implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
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
