package de.decidr.model.entities;

// Generated 20.06.2009 13:06:16 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * WorkItemSummaryView generated by hbm2java
 */
public class WorkItemSummaryView implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private String workItemName;
    private String tenantName;
    private Date creationDate;
    private String workItemStatus;
    private long userId;
    private long workflowInstanceId;

    public WorkItemSummaryView() {
    }

    public WorkItemSummaryView(long id, String workItemName, String tenantName,
            Date creationDate, String workItemStatus, long userId,
            long workflowInstanceId) {
        this.id = id;
        this.workItemName = workItemName;
        this.tenantName = tenantName;
        this.creationDate = creationDate;
        this.workItemStatus = workItemStatus;
        this.userId = userId;
        this.workflowInstanceId = workflowInstanceId;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public void setWorkflowInstanceId(long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
    }

}
