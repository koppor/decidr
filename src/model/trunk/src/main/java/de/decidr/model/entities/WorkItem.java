package de.decidr.model.entities;

// Generated 20.06.2009 13:06:16 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * WorkItem generated by hbm2java
 */
public class WorkItem implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private WorkflowInstance workflowInstance;
    private User user;
    private Date creationDate;
    private String status;
    private byte[] data;
    private String name;
    private String description;

    public WorkItem() {
    }

    public WorkItem(WorkflowInstance workflowInstance, User user,
            Date creationDate, String status, byte[] data, String name,
            String description) {
        this.workflowInstance = workflowInstance;
        this.user = user;
        this.creationDate = creationDate;
        this.status = status;
        this.data = data;
        this.name = name;
        this.description = description;
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

}
