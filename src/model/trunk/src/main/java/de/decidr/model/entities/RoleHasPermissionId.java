package de.decidr.model.entities;

// Generated 05.06.2009 17:08:24 by Hibernate Tools 3.2.2.GA

/**
 * RoleHasPermissionId generated by hbm2java
 */
public class RoleHasPermissionId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long roleId;
    private long resourceId;

    public RoleHasPermissionId() {
    }

    public RoleHasPermissionId(long roleId, long resourceId) {
        this.roleId = roleId;
        this.resourceId = resourceId;
    }

    public long getRoleId() {
        return this.roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(long resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof RoleHasPermissionId))
            return false;
        RoleHasPermissionId castOther = (RoleHasPermissionId) other;

        return (this.getRoleId() == castOther.getRoleId())
                && (this.getResourceId() == castOther.getResourceId());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getRoleId();
        result = 37 * result + (int) this.getResourceId();
        return result;
    }

}
