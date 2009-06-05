package de.decidr.model.entities;

// Generated 05.06.2009 17:08:24 by Hibernate Tools 3.2.2.GA

/**
 * TenantSummaryViewId generated by hbm2java
 */
public class TenantSummaryViewId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long tenantId;
    private String tenantName;
    private String adminFirstName;
    private String adminLastName;
    private long numWorkflowModels;
    private long numDeployedWorkflowModels;
    private long numWorkflowInstances;
    private long numMembers;

    public TenantSummaryViewId() {
    }

    public TenantSummaryViewId(long tenantId, String tenantName,
            long numWorkflowModels, long numDeployedWorkflowModels,
            long numWorkflowInstances, long numMembers) {
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.numWorkflowModels = numWorkflowModels;
        this.numDeployedWorkflowModels = numDeployedWorkflowModels;
        this.numWorkflowInstances = numWorkflowInstances;
        this.numMembers = numMembers;
    }

    public TenantSummaryViewId(long tenantId, String tenantName,
            String adminFirstName, String adminLastName,
            long numWorkflowModels, long numDeployedWorkflowModels,
            long numWorkflowInstances, long numMembers) {
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.numWorkflowModels = numWorkflowModels;
        this.numDeployedWorkflowModels = numDeployedWorkflowModels;
        this.numWorkflowInstances = numWorkflowInstances;
        this.numMembers = numMembers;
    }

    public long getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(long tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getAdminFirstName() {
        return this.adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return this.adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public long getNumWorkflowModels() {
        return this.numWorkflowModels;
    }

    public void setNumWorkflowModels(long numWorkflowModels) {
        this.numWorkflowModels = numWorkflowModels;
    }

    public long getNumDeployedWorkflowModels() {
        return this.numDeployedWorkflowModels;
    }

    public void setNumDeployedWorkflowModels(long numDeployedWorkflowModels) {
        this.numDeployedWorkflowModels = numDeployedWorkflowModels;
    }

    public long getNumWorkflowInstances() {
        return this.numWorkflowInstances;
    }

    public void setNumWorkflowInstances(long numWorkflowInstances) {
        this.numWorkflowInstances = numWorkflowInstances;
    }

    public long getNumMembers() {
        return this.numMembers;
    }

    public void setNumMembers(long numMembers) {
        this.numMembers = numMembers;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof TenantSummaryViewId))
            return false;
        TenantSummaryViewId castOther = (TenantSummaryViewId) other;

        return (this.getTenantId() == castOther.getTenantId())
                && ((this.getTenantName() == castOther.getTenantName()) || (this
                        .getTenantName() != null
                        && castOther.getTenantName() != null && this
                        .getTenantName().equals(castOther.getTenantName())))
                && ((this.getAdminFirstName() == castOther.getAdminFirstName()) || (this
                        .getAdminFirstName() != null
                        && castOther.getAdminFirstName() != null && this
                        .getAdminFirstName().equals(
                                castOther.getAdminFirstName())))
                && ((this.getAdminLastName() == castOther.getAdminLastName()) || (this
                        .getAdminLastName() != null
                        && castOther.getAdminLastName() != null && this
                        .getAdminLastName()
                        .equals(castOther.getAdminLastName())))
                && (this.getNumWorkflowModels() == castOther
                        .getNumWorkflowModels())
                && (this.getNumDeployedWorkflowModels() == castOther
                        .getNumDeployedWorkflowModels())
                && (this.getNumWorkflowInstances() == castOther
                        .getNumWorkflowInstances())
                && (this.getNumMembers() == castOther.getNumMembers());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getTenantId();
        result = 37
                * result
                + (getTenantName() == null ? 0 : this.getTenantName()
                        .hashCode());
        result = 37
                * result
                + (getAdminFirstName() == null ? 0 : this.getAdminFirstName()
                        .hashCode());
        result = 37
                * result
                + (getAdminLastName() == null ? 0 : this.getAdminLastName()
                        .hashCode());
        result = 37 * result + (int) this.getNumWorkflowModels();
        result = 37 * result + (int) this.getNumDeployedWorkflowModels();
        result = 37 * result + (int) this.getNumWorkflowInstances();
        result = 37 * result + (int) this.getNumMembers();
        return result;
    }

}
