package de.decidr.model.entities;

// Generated 07.12.2009 17:47:57 by Hibernate Tools 3.2.4.GA

/**
 * UserIsMemberOfTenant generated by hbm2java
 */
public class UserIsMemberOfTenant implements java.io.Serializable {

    private UserIsMemberOfTenantId id;
    private Tenant tenant;
    private User user;

    public UserIsMemberOfTenant() {
        //default empty JavaBean constructor
    }

    public UserIsMemberOfTenant(UserIsMemberOfTenantId id, Tenant tenant,
            User user) {
        //generated full constructor
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
