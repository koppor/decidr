package de.decidr.model.entities;

// Generated 29.10.2009 17:08:04 by Hibernate Tools 3.2.4.GA

/**
 * UserIsMemberOfTenantId generated by hbm2java
 */
public class UserIsMemberOfTenantId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private long tenantId;

    public UserIsMemberOfTenantId() {
        //default empty JavaBean constructor
    }

    public UserIsMemberOfTenantId(long userId, long tenantId) {
        //generated full constructor
        this.userId = userId;
        this.tenantId = tenantId;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof UserIsMemberOfTenantId))
            return false;
        UserIsMemberOfTenantId castOther = (UserIsMemberOfTenantId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getTenantId() == castOther.getTenantId());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getUserId();
        result = 37 * result + (int) this.getTenantId();
        return result;
    }

}
