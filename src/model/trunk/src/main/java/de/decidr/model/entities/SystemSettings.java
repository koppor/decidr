package de.decidr.model.entities;

// Generated 13.06.2009 13:16:18 by Hibernate Tools 3.2.4.GA

/**
 * SystemSettings generated by hbm2java
 */
public class SystemSettings implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private User superAdmin;
    private boolean autoAcceptNewTenants;
    private String logLevel;

    public SystemSettings() {
    }

    public SystemSettings(boolean autoAcceptNewTenants, String logLevel) {
        this.autoAcceptNewTenants = autoAcceptNewTenants;
        this.logLevel = logLevel;
    }

    public SystemSettings(User superAdmin, boolean autoAcceptNewTenants,
            String logLevel) {
        this.superAdmin = superAdmin;
        this.autoAcceptNewTenants = autoAcceptNewTenants;
        this.logLevel = logLevel;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getSuperAdmin() {
        return this.superAdmin;
    }

    public void setSuperAdmin(User superAdmin) {
        this.superAdmin = superAdmin;
    }

    public boolean isAutoAcceptNewTenants() {
        return this.autoAcceptNewTenants;
    }

    public void setAutoAcceptNewTenants(boolean autoAcceptNewTenants) {
        this.autoAcceptNewTenants = autoAcceptNewTenants;
    }

    public String getLogLevel() {
        return this.logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

}
