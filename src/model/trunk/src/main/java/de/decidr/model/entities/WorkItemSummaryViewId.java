package de.decidr.model.entities;

// Generated 29.05.2009 18:32:43 by Hibernate Tools 3.2.2.GA

import java.util.Date;

/**
 * WorkItemSummaryViewId generated by hbm2java
 */
public class WorkItemSummaryViewId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long workItemId;
    private String workItemName;
    private String tenantName;
    private Date creationDate;
    private String workItemStatus;

    public WorkItemSummaryViewId() {
    }

    public WorkItemSummaryViewId(long workItemId, String workItemName,
            String tenantName, Date creationDate, String workItemStatus) {
        this.workItemId = workItemId;
        this.workItemName = workItemName;
        this.tenantName = tenantName;
        this.creationDate = creationDate;
        this.workItemStatus = workItemStatus;
    }

    public long getWorkItemId() {
        return this.workItemId;
    }

    public void setWorkItemId(long workItemId) {
        this.workItemId = workItemId;
    }

    public String getWorkItemName() {
        return this.workItemName;
    }

    public void setWorkItemName(String workItemName) {
        this.workItemName = workItemName;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getWorkItemStatus() {
        return this.workItemStatus;
    }

    public void setWorkItemStatus(String workItemStatus) {
        this.workItemStatus = workItemStatus;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof WorkItemSummaryViewId))
            return false;
        WorkItemSummaryViewId castOther = (WorkItemSummaryViewId) other;

        return (this.getWorkItemId() == castOther.getWorkItemId())
                && ((this.getWorkItemName() == castOther.getWorkItemName()) || (this
                        .getWorkItemName() != null
                        && castOther.getWorkItemName() != null && this
                        .getWorkItemName().equals(castOther.getWorkItemName())))
                && ((this.getTenantName() == castOther.getTenantName()) || (this
                        .getTenantName() != null
                        && castOther.getTenantName() != null && this
                        .getTenantName().equals(castOther.getTenantName())))
                && ((this.getCreationDate() == castOther.getCreationDate()) || (this
                        .getCreationDate() != null
                        && castOther.getCreationDate() != null && this
                        .getCreationDate().equals(castOther.getCreationDate())))
                && ((this.getWorkItemStatus() == castOther.getWorkItemStatus()) || (this
                        .getWorkItemStatus() != null
                        && castOther.getWorkItemStatus() != null && this
                        .getWorkItemStatus().equals(
                                castOther.getWorkItemStatus())));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getWorkItemId();
        result = 37
                * result
                + (getWorkItemName() == null ? 0 : this.getWorkItemName()
                        .hashCode());
        result = 37
                * result
                + (getTenantName() == null ? 0 : this.getTenantName()
                        .hashCode());
        result = 37
                * result
                + (getCreationDate() == null ? 0 : this.getCreationDate()
                        .hashCode());
        result = 37
                * result
                + (getWorkItemStatus() == null ? 0 : this.getWorkItemStatus()
                        .hashCode());
        return result;
    }

}
