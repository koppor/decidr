/*
 * The DecidR Development Team licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.decidr.model.entities;

// Generated 22.01.2010 14:51:15 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tenant generated by hbm2java.
 */
public class Tenant implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;

    /** The logo. */
    private File logo;

    /** The simple color scheme. */
    private File simpleColorScheme;

    /** The advanced color scheme. */
    private File advancedColorScheme;

    /** The admin. */
    private User admin;

    /** The current color scheme. */
    private File currentColorScheme;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

    /** The approved since. */
    private Date approvedSince;

    /** The user is member of tenants. */
    private Set<UserIsMemberOfTenant> userIsMemberOfTenants = new HashSet<UserIsMemberOfTenant>(
            0);

    /** The workflow models. */
    private Set<WorkflowModel> workflowModels = new HashSet<WorkflowModel>(0);

    /** The invitations. */
    private Set<Invitation> invitations = new HashSet<Invitation>(0);

    /** The currently bustling users. */
    private Set<User> currentlyBustlingUsers = new HashSet<User>(0);

    /** The deployed workflow models. */
    private Set<DeployedWorkflowModel> deployedWorkflowModels = new HashSet<DeployedWorkflowModel>(
            0);

    /**
     * Instantiates a new tenant.
     */
    public Tenant() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new tenant.
     * 
     * @param logo
     *            the logo
     * @param simpleColorScheme
     *            the simple color scheme
     * @param advancedColorScheme
     *            the advanced color scheme
     * @param admin
     *            the admin
     * @param currentColorScheme
     *            the current color scheme
     * @param name
     *            the name
     * @param description
     *            the description
     * @param approvedSince
     *            the approved since
     * @param userIsMemberOfTenants
     *            the user is member of tenants
     * @param workflowModels
     *            the workflow models
     * @param invitations
     *            the invitations
     * @param currentlyBustlingUsers
     *            the currently bustling users
     * @param deployedWorkflowModels
     *            the deployed workflow models
     */
    public Tenant(File logo, File simpleColorScheme, File advancedColorScheme,
            User admin, File currentColorScheme, String name,
            String description, Date approvedSince,
            Set<UserIsMemberOfTenant> userIsMemberOfTenants,
            Set<WorkflowModel> workflowModels, Set<Invitation> invitations,
            Set<User> currentlyBustlingUsers,
            Set<DeployedWorkflowModel> deployedWorkflowModels) {
        // generated full constructor
        this.logo = logo;
        this.simpleColorScheme = simpleColorScheme;
        this.advancedColorScheme = advancedColorScheme;
        this.admin = admin;
        this.currentColorScheme = currentColorScheme;
        this.name = name;
        this.description = description;
        this.approvedSince = approvedSince;
        this.userIsMemberOfTenants = userIsMemberOfTenants;
        this.workflowModels = workflowModels;
        this.invitations = invitations;
        this.currentlyBustlingUsers = currentlyBustlingUsers;
        this.deployedWorkflowModels = deployedWorkflowModels;
    }

    /**
     * Instantiates a new tenant.
     * 
     * @param admin
     *            the admin
     * @param name
     *            the name
     * @param description
     *            the description
     */
    public Tenant(User admin, String name, String description) {
        // generated minimal constructor
        this.admin = admin;
        this.name = name;
        this.description = description;
    }

    /**
     * Gets the admin.
     * 
     * @return the admin
     */
    public User getAdmin() {
        return this.admin;
    }

    /**
     * Gets the advanced color scheme.
     * 
     * @return the advanced color scheme
     */
    public File getAdvancedColorScheme() {
        return this.advancedColorScheme;
    }

    /**
     * Gets the approved since.
     * 
     * @return the approved since
     */
    public Date getApprovedSince() {
        return this.approvedSince;
    }

    /**
     * Gets the current color scheme.
     * 
     * @return the current color scheme
     */
    public File getCurrentColorScheme() {
        return this.currentColorScheme;
    }

    /**
     * Gets the currently bustling users.
     * 
     * @return the currently bustling users
     */
    public Set<User> getCurrentlyBustlingUsers() {
        return this.currentlyBustlingUsers;
    }

    /**
     * Gets the deployed workflow models.
     * 
     * @return the deployed workflow models
     */
    public Set<DeployedWorkflowModel> getDeployedWorkflowModels() {
        return this.deployedWorkflowModels;
    }

    /**
     * Gets the description.
     * 
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Gets the invitations.
     * 
     * @return the invitations
     */
    public Set<Invitation> getInvitations() {
        return this.invitations;
    }

    /**
     * Gets the logo.
     * 
     * @return the logo
     */
    public File getLogo() {
        return this.logo;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the simple color scheme.
     * 
     * @return the simple color scheme
     */
    public File getSimpleColorScheme() {
        return this.simpleColorScheme;
    }

    /**
     * Gets the user is member of tenants.
     * 
     * @return the user is member of tenants
     */
    public Set<UserIsMemberOfTenant> getUserIsMemberOfTenants() {
        return this.userIsMemberOfTenants;
    }

    /**
     * Gets the workflow models.
     * 
     * @return the workflow models
     */
    public Set<WorkflowModel> getWorkflowModels() {
        return this.workflowModels;
    }

    /**
     * Sets the admin.
     * 
     * @param admin
     *            the new admin
     */
    public void setAdmin(User admin) {
        this.admin = admin;
    }

    /**
     * Sets the advanced color scheme.
     * 
     * @param advancedColorScheme
     *            the new advanced color scheme
     */
    public void setAdvancedColorScheme(File advancedColorScheme) {
        this.advancedColorScheme = advancedColorScheme;
    }

    /**
     * Sets the approved since.
     * 
     * @param approvedSince
     *            the new approved since
     */
    public void setApprovedSince(Date approvedSince) {
        this.approvedSince = approvedSince;
    }

    /**
     * Sets the current color scheme.
     * 
     * @param currentColorScheme
     *            the new current color scheme
     */
    public void setCurrentColorScheme(File currentColorScheme) {
        this.currentColorScheme = currentColorScheme;
    }

    /**
     * Sets the currently bustling users.
     * 
     * @param currentlyBustlingUsers
     *            the new currently bustling users
     */
    public void setCurrentlyBustlingUsers(Set<User> currentlyBustlingUsers) {
        this.currentlyBustlingUsers = currentlyBustlingUsers;
    }

    /**
     * Sets the deployed workflow models.
     * 
     * @param deployedWorkflowModels
     *            the new deployed workflow models
     */
    public void setDeployedWorkflowModels(
            Set<DeployedWorkflowModel> deployedWorkflowModels) {
        this.deployedWorkflowModels = deployedWorkflowModels;
    }

    /**
     * Sets the description.
     * 
     * @param description
     *            the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets the invitations.
     * 
     * @param invitations
     *            the new invitations
     */
    public void setInvitations(Set<Invitation> invitations) {
        this.invitations = invitations;
    }

    /**
     * Sets the logo.
     * 
     * @param logo
     *            the new logo
     */
    public void setLogo(File logo) {
        this.logo = logo;
    }

    /**
     * Sets the name.
     * 
     * @param name
     *            the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the simple color scheme.
     * 
     * @param simpleColorScheme
     *            the new simple color scheme
     */
    public void setSimpleColorScheme(File simpleColorScheme) {
        this.simpleColorScheme = simpleColorScheme;
    }

    /**
     * Sets the user is member of tenants.
     * 
     * @param userIsMemberOfTenants
     *            the new user is member of tenants
     */
    public void setUserIsMemberOfTenants(
            Set<UserIsMemberOfTenant> userIsMemberOfTenants) {
        this.userIsMemberOfTenants = userIsMemberOfTenants;
    }

    /**
     * Sets the workflow models.
     * 
     * @param workflowModels
     *            the new workflow models
     */
    public void setWorkflowModels(Set<WorkflowModel> workflowModels) {
        this.workflowModels = workflowModels;
    }

}
