package de.decidr.model.entities;

// Generated 24.07.2009 17:05:33 by Hibernate Tools 3.2.4.GA

/**
 * UserAdministratesWorkflowModelId generated by hbm2java
 */
public class UserAdministratesWorkflowModelId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private long workflowModelId;

    public UserAdministratesWorkflowModelId() {
    }

    public UserAdministratesWorkflowModelId(long userId, long workflowModelId) {
        this.userId = userId;
        this.workflowModelId = workflowModelId;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getWorkflowModelId() {
        return this.workflowModelId;
    }

    public void setWorkflowModelId(long workflowModelId) {
        this.workflowModelId = workflowModelId;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof UserAdministratesWorkflowModelId))
            return false;
        UserAdministratesWorkflowModelId castOther = (UserAdministratesWorkflowModelId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getWorkflowModelId() == castOther.getWorkflowModelId());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getUserId();
        result = 37 * result + (int) this.getWorkflowModelId();
        return result;
    }

}
