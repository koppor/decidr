package de.decidr.model.entities;

// Generated 07.12.2009 17:47:57 by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * WorkItem generated by hbm2java
 */
public class WorkItem implements java.io.Serializable {

    private Long id;
    private WorkflowInstance workflowInstance;
    private User user;
    private Date creationDate;
    private String status;
    private byte[] data;
    private String name;
    private String description;
    private Set<WorkItemContainsFile> workItemContainsFiles = new HashSet<WorkItemContainsFile>(
            0);

    public WorkItem() {
        //default empty JavaBean constructor
    }

    public WorkItem(WorkflowInstance workflowInstance, User user,
            Date creationDate, String status, byte[] data, String name,
            String description) {
        //generated minimal constructor
        this.workflowInstance = workflowInstance;
        this.user = user;
        this.creationDate = creationDate;
        this.status = status;
        this.data = data;
        this.name = name;
        this.description = description;
    }

    public WorkItem(WorkflowInstance workflowInstance, User user,
            Date creationDate, String status, byte[] data, String name,
            String description, Set<WorkItemContainsFile> workItemContainsFiles) {
        //generated full constructor
        this.workflowInstance = workflowInstance;
        this.user = user;
        this.creationDate = creationDate;
        this.status = status;
        this.data = data;
        this.name = name;
        this.description = description;
        this.workItemContainsFiles = workItemContainsFiles;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WorkflowInstance getWorkflowInstance() {
        return this.workflowInstance;
    }

    public void setWorkflowInstance(WorkflowInstance workflowInstance) {
        this.workflowInstance = workflowInstance;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<WorkItemContainsFile> getWorkItemContainsFiles() {
        return this.workItemContainsFiles;
    }

    public void setWorkItemContainsFiles(
            Set<WorkItemContainsFile> workItemContainsFiles) {
        this.workItemContainsFiles = workItemContainsFiles;
    }

}
