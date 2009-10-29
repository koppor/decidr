package de.decidr.model.entities;

// Generated 29.10.2009 17:08:04 by Hibernate Tools 3.2.4.GA

import java.util.Date;

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
    private Date modifiedDate;
    private boolean autoAcceptNewTenants;
    private String systemName;
    private String domain;
    private String systemEmailAddress;
    private String logLevel;
    private int passwordResetRequestLifetimeSeconds;
    private int registrationRequestLifetimeSeconds;
    private int changeEmailRequestLifetimeSeconds;
    private int invitationLifetimeSeconds;
    private String mtaHostname;
    private int mtaPort;
    private boolean mtaUseTls;
    private String mtaUsername;
    private String mtaPassword;
    private long maxUploadFileSizeBytes;
    private int maxAttachmentsPerEmail;
    private int monitorUpdateIntervalSeconds;
    private int monitorAveragingPeriodSeconds;
    private int serverPoolInstances;
    private byte minServerLoadForLock;
    private byte maxServerLoadForUnlock;
    private byte maxServerLoadForShutdown;
    private int minUnlockedServers;
    private int minWorkflowInstancesForLock;
    private int maxWorkflowInstancesForUnlock;
    private int maxWorkflowInstancesForShutdown;

    public SystemSettings() {
        //default empty JavaBean constructor
    }

    public SystemSettings(User superAdmin, Date modifiedDate,
            boolean autoAcceptNewTenants, String systemName, String domain,
            String systemEmailAddress, String logLevel,
            int passwordResetRequestLifetimeSeconds,
            int registrationRequestLifetimeSeconds,
            int changeEmailRequestLifetimeSeconds,
            int invitationLifetimeSeconds, String mtaHostname, int mtaPort,
            boolean mtaUseTls, String mtaUsername, String mtaPassword,
            long maxUploadFileSizeBytes, int maxAttachmentsPerEmail,
            int monitorUpdateIntervalSeconds,
            int monitorAveragingPeriodSeconds, int serverPoolInstances,
            byte minServerLoadForLock, byte maxServerLoadForUnlock,
            byte maxServerLoadForShutdown, int minUnlockedServers,
            int minWorkflowInstancesForLock, int maxWorkflowInstancesForUnlock,
            int maxWorkflowInstancesForShutdown) {
        //generated full constructor
        this.superAdmin = superAdmin;
        this.modifiedDate = modifiedDate;
        this.autoAcceptNewTenants = autoAcceptNewTenants;
        this.systemName = systemName;
        this.domain = domain;
        this.systemEmailAddress = systemEmailAddress;
        this.logLevel = logLevel;
        this.passwordResetRequestLifetimeSeconds = passwordResetRequestLifetimeSeconds;
        this.registrationRequestLifetimeSeconds = registrationRequestLifetimeSeconds;
        this.changeEmailRequestLifetimeSeconds = changeEmailRequestLifetimeSeconds;
        this.invitationLifetimeSeconds = invitationLifetimeSeconds;
        this.mtaHostname = mtaHostname;
        this.mtaPort = mtaPort;
        this.mtaUseTls = mtaUseTls;
        this.mtaUsername = mtaUsername;
        this.mtaPassword = mtaPassword;
        this.maxUploadFileSizeBytes = maxUploadFileSizeBytes;
        this.maxAttachmentsPerEmail = maxAttachmentsPerEmail;
        this.monitorUpdateIntervalSeconds = monitorUpdateIntervalSeconds;
        this.monitorAveragingPeriodSeconds = monitorAveragingPeriodSeconds;
        this.serverPoolInstances = serverPoolInstances;
        this.minServerLoadForLock = minServerLoadForLock;
        this.maxServerLoadForUnlock = maxServerLoadForUnlock;
        this.maxServerLoadForShutdown = maxServerLoadForShutdown;
        this.minUnlockedServers = minUnlockedServers;
        this.minWorkflowInstancesForLock = minWorkflowInstancesForLock;
        this.maxWorkflowInstancesForUnlock = maxWorkflowInstancesForUnlock;
        this.maxWorkflowInstancesForShutdown = maxWorkflowInstancesForShutdown;
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

    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isAutoAcceptNewTenants() {
        return this.autoAcceptNewTenants;
    }

    public void setAutoAcceptNewTenants(boolean autoAcceptNewTenants) {
        this.autoAcceptNewTenants = autoAcceptNewTenants;
    }

    public String getSystemName() {
        return this.systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSystemEmailAddress() {
        return this.systemEmailAddress;
    }

    public void setSystemEmailAddress(String systemEmailAddress) {
        this.systemEmailAddress = systemEmailAddress;
    }

    public String getLogLevel() {
        return this.logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public int getPasswordResetRequestLifetimeSeconds() {
        return this.passwordResetRequestLifetimeSeconds;
    }

    public void setPasswordResetRequestLifetimeSeconds(
            int passwordResetRequestLifetimeSeconds) {
        this.passwordResetRequestLifetimeSeconds = passwordResetRequestLifetimeSeconds;
    }

    public int getRegistrationRequestLifetimeSeconds() {
        return this.registrationRequestLifetimeSeconds;
    }

    public void setRegistrationRequestLifetimeSeconds(
            int registrationRequestLifetimeSeconds) {
        this.registrationRequestLifetimeSeconds = registrationRequestLifetimeSeconds;
    }

    public int getChangeEmailRequestLifetimeSeconds() {
        return this.changeEmailRequestLifetimeSeconds;
    }

    public void setChangeEmailRequestLifetimeSeconds(
            int changeEmailRequestLifetimeSeconds) {
        this.changeEmailRequestLifetimeSeconds = changeEmailRequestLifetimeSeconds;
    }

    public int getInvitationLifetimeSeconds() {
        return this.invitationLifetimeSeconds;
    }

    public void setInvitationLifetimeSeconds(int invitationLifetimeSeconds) {
        this.invitationLifetimeSeconds = invitationLifetimeSeconds;
    }

    public String getMtaHostname() {
        return this.mtaHostname;
    }

    public void setMtaHostname(String mtaHostname) {
        this.mtaHostname = mtaHostname;
    }

    public int getMtaPort() {
        return this.mtaPort;
    }

    public void setMtaPort(int mtaPort) {
        this.mtaPort = mtaPort;
    }

    public boolean isMtaUseTls() {
        return this.mtaUseTls;
    }

    public void setMtaUseTls(boolean mtaUseTls) {
        this.mtaUseTls = mtaUseTls;
    }

    public String getMtaUsername() {
        return this.mtaUsername;
    }

    public void setMtaUsername(String mtaUsername) {
        this.mtaUsername = mtaUsername;
    }

    public String getMtaPassword() {
        return this.mtaPassword;
    }

    public void setMtaPassword(String mtaPassword) {
        this.mtaPassword = mtaPassword;
    }

    public long getMaxUploadFileSizeBytes() {
        return this.maxUploadFileSizeBytes;
    }

    public void setMaxUploadFileSizeBytes(long maxUploadFileSizeBytes) {
        this.maxUploadFileSizeBytes = maxUploadFileSizeBytes;
    }

    public int getMaxAttachmentsPerEmail() {
        return this.maxAttachmentsPerEmail;
    }

    public void setMaxAttachmentsPerEmail(int maxAttachmentsPerEmail) {
        this.maxAttachmentsPerEmail = maxAttachmentsPerEmail;
    }

    public int getMonitorUpdateIntervalSeconds() {
        return this.monitorUpdateIntervalSeconds;
    }

    public void setMonitorUpdateIntervalSeconds(int monitorUpdateIntervalSeconds) {
        this.monitorUpdateIntervalSeconds = monitorUpdateIntervalSeconds;
    }

    public int getMonitorAveragingPeriodSeconds() {
        return this.monitorAveragingPeriodSeconds;
    }

    public void setMonitorAveragingPeriodSeconds(
            int monitorAveragingPeriodSeconds) {
        this.monitorAveragingPeriodSeconds = monitorAveragingPeriodSeconds;
    }

    public int getServerPoolInstances() {
        return this.serverPoolInstances;
    }

    public void setServerPoolInstances(int serverPoolInstances) {
        this.serverPoolInstances = serverPoolInstances;
    }

    public byte getMinServerLoadForLock() {
        return this.minServerLoadForLock;
    }

    public void setMinServerLoadForLock(byte minServerLoadForLock) {
        this.minServerLoadForLock = minServerLoadForLock;
    }

    public byte getMaxServerLoadForUnlock() {
        return this.maxServerLoadForUnlock;
    }

    public void setMaxServerLoadForUnlock(byte maxServerLoadForUnlock) {
        this.maxServerLoadForUnlock = maxServerLoadForUnlock;
    }

    public byte getMaxServerLoadForShutdown() {
        return this.maxServerLoadForShutdown;
    }

    public void setMaxServerLoadForShutdown(byte maxServerLoadForShutdown) {
        this.maxServerLoadForShutdown = maxServerLoadForShutdown;
    }

    public int getMinUnlockedServers() {
        return this.minUnlockedServers;
    }

    public void setMinUnlockedServers(int minUnlockedServers) {
        this.minUnlockedServers = minUnlockedServers;
    }

    public int getMinWorkflowInstancesForLock() {
        return this.minWorkflowInstancesForLock;
    }

    public void setMinWorkflowInstancesForLock(int minWorkflowInstancesForLock) {
        this.minWorkflowInstancesForLock = minWorkflowInstancesForLock;
    }

    public int getMaxWorkflowInstancesForUnlock() {
        return this.maxWorkflowInstancesForUnlock;
    }

    public void setMaxWorkflowInstancesForUnlock(
            int maxWorkflowInstancesForUnlock) {
        this.maxWorkflowInstancesForUnlock = maxWorkflowInstancesForUnlock;
    }

    public int getMaxWorkflowInstancesForShutdown() {
        return this.maxWorkflowInstancesForShutdown;
    }

    public void setMaxWorkflowInstancesForShutdown(
            int maxWorkflowInstancesForShutdown) {
        this.maxWorkflowInstancesForShutdown = maxWorkflowInstancesForShutdown;
    }

}
