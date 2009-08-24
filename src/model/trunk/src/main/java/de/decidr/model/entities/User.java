package de.decidr.model.entities;

// Generated 24.08.2009 15:40:36 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private Tenant currentTenant;
    private String authKey;
    private String email;
    private Date disabledSince;
    private Date unavailableSince;
    private Date registeredSince;
    private Date creationDate;
    private Set<WorkItem> workItems = new HashSet<WorkItem>(0);
    private Set<Invitation> invitationsForSenderId = new HashSet<Invitation>(0);
    private Set<WorkflowModel> workflowModels = new HashSet<WorkflowModel>(0);
    private Set<UserIsMemberOfTenant> userIsMemberOfTenants = new HashSet<UserIsMemberOfTenant>(
            0);
    private UserProfile userProfile;
    private PasswordResetRequest passwordResetRequest;
    private RegistrationRequest registrationRequest;
    private Set<Invitation> invitationsForReceiverId = new HashSet<Invitation>(
            0);
    private Set<UserAdministratesWorkflowInstance> userAdministratesWorkflowInstances = new HashSet<UserAdministratesWorkflowInstance>(
            0);
    private Set<SystemSettings> systemSettings = new HashSet<SystemSettings>(0);
    private Set<UserHasFileAccess> userHasFileAccess = new HashSet<UserHasFileAccess>(
            0);
    private Set<UserParticipatesInWorkflow> userParticipatesInWorkflows = new HashSet<UserParticipatesInWorkflow>(
            0);
    private Set<Tenant> administratedTenants = new HashSet<Tenant>(0);
    private Set<Login> logins = new HashSet<Login>(0);
    private ChangeEmailRequest changeEmailRequest;
    private Set<UserAdministratesWorkflowModel> userAdministratesWorkflowModels = new HashSet<UserAdministratesWorkflowModel>(
            0);

    public User() {
    }

    public User(String email, Date creationDate) {
        this.email = email;
        this.creationDate = creationDate;
    }

    public User(
            Tenant currentTenant,
            String authKey,
            String email,
            Date disabledSince,
            Date unavailableSince,
            Date registeredSince,
            Date creationDate,
            Set<WorkItem> workItems,
            Set<Invitation> invitationsForSenderId,
            Set<WorkflowModel> workflowModels,
            Set<UserIsMemberOfTenant> userIsMemberOfTenants,
            UserProfile userProfile,
            PasswordResetRequest passwordResetRequest,
            RegistrationRequest registrationRequest,
            Set<Invitation> invitationsForReceiverId,
            Set<UserAdministratesWorkflowInstance> userAdministratesWorkflowInstances,
            Set<SystemSettings> systemSettings,
            Set<UserHasFileAccess> userHasFileAccess,
            Set<UserParticipatesInWorkflow> userParticipatesInWorkflows,
            Set<Tenant> administratedTenants, Set<Login> logins,
            ChangeEmailRequest changeEmailRequest,
            Set<UserAdministratesWorkflowModel> userAdministratesWorkflowModels) {
        this.currentTenant = currentTenant;
        this.authKey = authKey;
        this.email = email;
        this.disabledSince = disabledSince;
        this.unavailableSince = unavailableSince;
        this.registeredSince = registeredSince;
        this.creationDate = creationDate;
        this.workItems = workItems;
        this.invitationsForSenderId = invitationsForSenderId;
        this.workflowModels = workflowModels;
        this.userIsMemberOfTenants = userIsMemberOfTenants;
        this.userProfile = userProfile;
        this.passwordResetRequest = passwordResetRequest;
        this.registrationRequest = registrationRequest;
        this.invitationsForReceiverId = invitationsForReceiverId;
        this.userAdministratesWorkflowInstances = userAdministratesWorkflowInstances;
        this.systemSettings = systemSettings;
        this.userHasFileAccess = userHasFileAccess;
        this.userParticipatesInWorkflows = userParticipatesInWorkflows;
        this.administratedTenants = administratedTenants;
        this.logins = logins;
        this.changeEmailRequest = changeEmailRequest;
        this.userAdministratesWorkflowModels = userAdministratesWorkflowModels;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tenant getCurrentTenant() {
        return this.currentTenant;
    }

    public void setCurrentTenant(Tenant currentTenant) {
        this.currentTenant = currentTenant;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDisabledSince() {
        return this.disabledSince;
    }

    public void setDisabledSince(Date disabledSince) {
        this.disabledSince = disabledSince;
    }

    public Date getUnavailableSince() {
        return this.unavailableSince;
    }

    public void setUnavailableSince(Date unavailableSince) {
        this.unavailableSince = unavailableSince;
    }

    public Date getRegisteredSince() {
        return this.registeredSince;
    }

    public void setRegisteredSince(Date registeredSince) {
        this.registeredSince = registeredSince;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Set<WorkItem> getWorkItems() {
        return this.workItems;
    }

    public void setWorkItems(Set<WorkItem> workItems) {
        this.workItems = workItems;
    }

    public Set<Invitation> getInvitationsForSenderId() {
        return this.invitationsForSenderId;
    }

    public void setInvitationsForSenderId(Set<Invitation> invitationsForSenderId) {
        this.invitationsForSenderId = invitationsForSenderId;
    }

    public Set<WorkflowModel> getWorkflowModels() {
        return this.workflowModels;
    }

    public void setWorkflowModels(Set<WorkflowModel> workflowModels) {
        this.workflowModels = workflowModels;
    }

    public Set<UserIsMemberOfTenant> getUserIsMemberOfTenants() {
        return this.userIsMemberOfTenants;
    }

    public void setUserIsMemberOfTenants(
            Set<UserIsMemberOfTenant> userIsMemberOfTenants) {
        this.userIsMemberOfTenants = userIsMemberOfTenants;
    }

    public UserProfile getUserProfile() {
        return this.userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public PasswordResetRequest getPasswordResetRequest() {
        return this.passwordResetRequest;
    }

    public void setPasswordResetRequest(
            PasswordResetRequest passwordResetRequest) {
        this.passwordResetRequest = passwordResetRequest;
    }

    public RegistrationRequest getRegistrationRequest() {
        return this.registrationRequest;
    }

    public void setRegistrationRequest(RegistrationRequest registrationRequest) {
        this.registrationRequest = registrationRequest;
    }

    public Set<Invitation> getInvitationsForReceiverId() {
        return this.invitationsForReceiverId;
    }

    public void setInvitationsForReceiverId(
            Set<Invitation> invitationsForReceiverId) {
        this.invitationsForReceiverId = invitationsForReceiverId;
    }

    public Set<UserAdministratesWorkflowInstance> getUserAdministratesWorkflowInstances() {
        return this.userAdministratesWorkflowInstances;
    }

    public void setUserAdministratesWorkflowInstances(
            Set<UserAdministratesWorkflowInstance> userAdministratesWorkflowInstances) {
        this.userAdministratesWorkflowInstances = userAdministratesWorkflowInstances;
    }

    public Set<SystemSettings> getSystemSettings() {
        return this.systemSettings;
    }

    public void setSystemSettings(Set<SystemSettings> systemSettings) {
        this.systemSettings = systemSettings;
    }

    public Set<UserHasFileAccess> getUserHasFileAccess() {
        return this.userHasFileAccess;
    }

    public void setUserHasFileAccess(Set<UserHasFileAccess> userHasFileAccess) {
        this.userHasFileAccess = userHasFileAccess;
    }

    public Set<UserParticipatesInWorkflow> getUserParticipatesInWorkflows() {
        return this.userParticipatesInWorkflows;
    }

    public void setUserParticipatesInWorkflows(
            Set<UserParticipatesInWorkflow> userParticipatesInWorkflows) {
        this.userParticipatesInWorkflows = userParticipatesInWorkflows;
    }

    public Set<Tenant> getAdministratedTenants() {
        return this.administratedTenants;
    }

    public void setAdministratedTenants(Set<Tenant> administratedTenants) {
        this.administratedTenants = administratedTenants;
    }

    public Set<Login> getLogins() {
        return this.logins;
    }

    public void setLogins(Set<Login> logins) {
        this.logins = logins;
    }

    public ChangeEmailRequest getChangeEmailRequest() {
        return this.changeEmailRequest;
    }

    public void setChangeEmailRequest(ChangeEmailRequest changeEmailRequest) {
        this.changeEmailRequest = changeEmailRequest;
    }

    public Set<UserAdministratesWorkflowModel> getUserAdministratesWorkflowModels() {
        return this.userAdministratesWorkflowModels;
    }

    public void setUserAdministratesWorkflowModels(
            Set<UserAdministratesWorkflowModel> userAdministratesWorkflowModels) {
        this.userAdministratesWorkflowModels = userAdministratesWorkflowModels;
    }

}
