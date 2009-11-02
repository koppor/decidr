package de.decidr.model.entities;

// Generated 30.10.2009 13:07:36 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * WorkflowInstance generated by hbm2java
 */
public class WorkflowInstance implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private DeployedWorkflowModel deployedWorkflowModel;
    private Server server;
    private String odePid;
    private byte[] startConfiguration;
    private Date startedDate;
    private Date completedDate;
    private Set<WorkItem> workItems = new HashSet<WorkItem>(0);
    private Set<UserAdministratesWorkflowInstance> userAdministratesWorkflowInstances = new HashSet<UserAdministratesWorkflowInstance>(
            0);
    private Set<Invitation> invitations = new HashSet<Invitation>(0);
    private Set<UserParticipatesInWorkflow> userParticipatesInWorkflows = new HashSet<UserParticipatesInWorkflow>(
            0);

    public WorkflowInstance() {
        // default empty JavaBean constructor
    }

    public WorkflowInstance(DeployedWorkflowModel deployedWorkflowModel,
            Server server, String odePid, byte[] startConfiguration) {
        // generated minimal constructor
        this.deployedWorkflowModel = deployedWorkflowModel;
        this.server = server;
        this.odePid = odePid;
        this.startConfiguration = startConfiguration;
    }

    public WorkflowInstance(
            DeployedWorkflowModel deployedWorkflowModel,
            Server server,
            String odePid,
            byte[] startConfiguration,
            Date startedDate,
            Date completedDate,
            Set<WorkItem> workItems,
            Set<UserAdministratesWorkflowInstance> userAdministratesWorkflowInstances,
            Set<Invitation> invitations,
            Set<UserParticipatesInWorkflow> userParticipatesInWorkflows) {
        // generated full constructor
        this.deployedWorkflowModel = deployedWorkflowModel;
        this.server = server;
        this.odePid = odePid;
        this.startConfiguration = startConfiguration;
        this.startedDate = startedDate;
        this.completedDate = completedDate;
        this.workItems = workItems;
        this.userAdministratesWorkflowInstances = userAdministratesWorkflowInstances;
        this.invitations = invitations;
        this.userParticipatesInWorkflows = userParticipatesInWorkflows;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeployedWorkflowModel getDeployedWorkflowModel() {
        return this.deployedWorkflowModel;
    }

    public void setDeployedWorkflowModel(
            DeployedWorkflowModel deployedWorkflowModel) {
        this.deployedWorkflowModel = deployedWorkflowModel;
    }

    public Server getServer() {
        return this.server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public String getOdePid() {
        return this.odePid;
    }

    public void setOdePid(String odePid) {
        this.odePid = odePid;
    }

    public byte[] getStartConfiguration() {
        return this.startConfiguration;
    }

    public void setStartConfiguration(byte[] startConfiguration) {
        this.startConfiguration = startConfiguration;
    }

    public Date getStartedDate() {
        return this.startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getCompletedDate() {
        return this.completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Set<WorkItem> getWorkItems() {
        return this.workItems;
    }

    public void setWorkItems(Set<WorkItem> workItems) {
        this.workItems = workItems;
    }

    public Set<UserAdministratesWorkflowInstance> getUserAdministratesWorkflowInstances() {
        return this.userAdministratesWorkflowInstances;
    }

    public void setUserAdministratesWorkflowInstances(
            Set<UserAdministratesWorkflowInstance> userAdministratesWorkflowInstances) {
        this.userAdministratesWorkflowInstances = userAdministratesWorkflowInstances;
    }

    public Set<Invitation> getInvitations() {
        return this.invitations;
    }

    public void setInvitations(Set<Invitation> invitations) {
        this.invitations = invitations;
    }

    public Set<UserParticipatesInWorkflow> getUserParticipatesInWorkflows() {
        return this.userParticipatesInWorkflows;
    }

    public void setUserParticipatesInWorkflows(
            Set<UserParticipatesInWorkflow> userParticipatesInWorkflows) {
        this.userParticipatesInWorkflows = userParticipatesInWorkflows;
    }

}
