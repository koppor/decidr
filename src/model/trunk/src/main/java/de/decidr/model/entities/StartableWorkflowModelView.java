package de.decidr.model.entities;

// Generated 26.10.2009 11:28:11 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * StartableWorkflowModelView generated by hbm2java
 */
public class StartableWorkflowModelView implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private long version;
    private long tenantId;
    private String name;
    private String description;
    private boolean published;
    private boolean executable;
    private Date creationDate;
    private Date modifiedDate;
    private byte[] dwdl;
    private Long modifiedByUserId;

    public StartableWorkflowModelView() {
        //default empty JavaBean constructor
    }

    public StartableWorkflowModelView(long id, long tenantId, String name,
            String description, boolean published, boolean executable,
            Date creationDate, Date modifiedDate, byte[] dwdl) {
        //generated minimal constructor
        this.id = id;
        this.tenantId = tenantId;
        this.name = name;
        this.description = description;
        this.published = published;
        this.executable = executable;
        this.creationDate = creationDate;
        this.modifiedDate = modifiedDate;
        this.dwdl = dwdl;
    }

    public StartableWorkflowModelView(long id, long tenantId, String name,
            String description, boolean published, boolean executable,
            Date creationDate, Date modifiedDate, byte[] dwdl,
            Long modifiedByUserId) {
        //generated full constructor
        this.id = id;
        this.tenantId = tenantId;
        this.name = name;
        this.description = description;
        this.published = published;
        this.executable = executable;
        this.creationDate = creationDate;
        this.modifiedDate = modifiedDate;
        this.dwdl = dwdl;
        this.modifiedByUserId = modifiedByUserId;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVersion() {
        return this.version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(long tenantId) {
        this.tenantId = tenantId;
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

    public boolean isPublished() {
        return this.published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isExecutable() {
        return this.executable;
    }

    public void setExecutable(boolean executable) {
        this.executable = executable;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public byte[] getDwdl() {
        return this.dwdl;
    }

    public void setDwdl(byte[] dwdl) {
        this.dwdl = dwdl;
    }

    public Long getModifiedByUserId() {
        return this.modifiedByUserId;
    }

    public void setModifiedByUserId(Long modifiedByUserId) {
        this.modifiedByUserId = modifiedByUserId;
    }

}
