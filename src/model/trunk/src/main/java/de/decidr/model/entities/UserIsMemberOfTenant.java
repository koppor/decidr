package de.decidr.model.entities;

// Generated 13.06.2009 13:16:18 by Hibernate Tools 3.2.4.GA

/**
 * UserIsMemberOfTenant generated by hbm2java
 */
public class UserIsMemberOfTenant implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private UserIsMemberOfTenantId id;
    private Tenant tenant;
    private User user;

    public UserIsMemberOfTenant() {
    }

    public UserIsMemberOfTenant(UserIsMemberOfTenantId id, Tenant tenant,
            User user) {
        this.id = id;
        this.tenant = tenant;
        this.user = user;
    }

    public UserIsMemberOfTenantId getId() {
        return this.id;
    }

    public void setId(UserIsMemberOfTenantId id) {
        this.id = id;
    }

    public Tenant getTenant() {
        return this.tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
