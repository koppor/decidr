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

/**
 * StartableWorkflowModelView generated by hbm2java.
 */
public class StartableWorkflowModelView implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private long id;

    /** The tenant id. */
    private long tenantId;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

    /** The published. */
    private boolean published;

    /** The executable. */
    private boolean executable;

    /** The creation date. */
    private Date creationDate;

    /** The modified date. */
    private Date modifiedDate;

    /** The dwdl. */
    private byte[] dwdl;

    /** The version. */
    private long version;

    /** The modified by user id. */
    private Long modifiedByUserId;

    /**
     * Instantiates a new startable workflow model view.
     */
    public StartableWorkflowModelView() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new startable workflow model view.
     * 
     * @param id
     *            the id
     * @param tenantId
     *            the tenant id
     * @param name
     *            the name
     * @param description
     *            the description
     * @param published
     *            the published
     * @param executable
     *            the executable
     * @param creationDate
     *            the creation date
     * @param modifiedDate
     *            the modified date
     * @param dwdl
     *            the dwdl
     * @param version
     *            the version
     */
    public StartableWorkflowModelView(long id, long tenantId, String name,
            String description, boolean published, boolean executable,
            Date creationDate, Date modifiedDate, byte[] dwdl, long version) {
        // generated minimal constructor
        this.id = id;
        this.tenantId = tenantId;
        this.name = name;
        this.description = description;
        this.published = published;
        this.executable = executable;
        this.creationDate = creationDate;
        this.modifiedDate = modifiedDate;
        this.dwdl = dwdl;
        this.version = version;
    }

    /**
     * Instantiates a new startable workflow model view.
     * 
     * @param id
     *            the id
     * @param tenantId
     *            the tenant id
     * @param name
     *            the name
     * @param description
     *            the description
     * @param published
     *            the published
     * @param executable
     *            the executable
     * @param creationDate
     *            the creation date
     * @param modifiedDate
     *            the modified date
     * @param dwdl
     *            the dwdl
     * @param version
     *            the version
     * @param modifiedByUserId
     *            the modified by user id
     */
    public StartableWorkflowModelView(long id, long tenantId, String name,
            String description, boolean published, boolean executable,
            Date creationDate, Date modifiedDate, byte[] dwdl, long version,
            Long modifiedByUserId) {
        // generated full constructor
        this.id = id;
        this.tenantId = tenantId;
        this.name = name;
        this.description = description;
        this.published = published;
        this.executable = executable;
        this.creationDate = creationDate;
        this.modifiedDate = modifiedDate;
        this.dwdl = dwdl;
        this.version = version;
        this.modifiedByUserId = modifiedByUserId;
    }

    /**
     * Gets the creation date.
     * 
     * @return the creation date
     */
    public Date getCreationDate() {
        return this.creationDate;
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
     * Gets the dwdl.
     * 
     * @return the dwdl
     */
    public byte[] getDwdl() {
        return this.dwdl;
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public long getId() {
        return this.id;
    }

    /**
     * Gets the modified by user id.
     * 
     * @return the modified by user id
     */
    public Long getModifiedByUserId() {
        return this.modifiedByUserId;
    }

    /**
     * Gets the modified date.
     * 
     * @return the modified date
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
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
     * Gets the tenant id.
     * 
     * @return the tenant id
     */
    public long getTenantId() {
        return this.tenantId;
    }

    /**
     * Gets the version.
     * 
     * @return the version
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Checks if is executable.
     * 
     * @return true, if is executable
     */
    public boolean isExecutable() {
        return this.executable;
    }

    /**
     * Checks if is published.
     * 
     * @return true, if is published
     */
    public boolean isPublished() {
        return this.published;
    }

    /**
     * Sets the creation date.
     * 
     * @param creationDate
     *            the new creation date
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
     * Sets the dwdl.
     * 
     * @param dwdl
     *            the new dwdl
     */
    public void setDwdl(byte[] dwdl) {
        this.dwdl = dwdl;
    }

    /**
     * Sets the executable.
     * 
     * @param executable
     *            the new executable
     */
    public void setExecutable(boolean executable) {
        this.executable = executable;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the modified by user id.
     * 
     * @param modifiedByUserId
     *            the new modified by user id
     */
    public void setModifiedByUserId(Long modifiedByUserId) {
        this.modifiedByUserId = modifiedByUserId;
    }

    /**
     * Sets the modified date.
     * 
     * @param modifiedDate
     *            the new modified date
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
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
     * Sets the published.
     * 
     * @param published
     *            the new published
     */
    public void setPublished(boolean published) {
        this.published = published;
    }

    /**
     * Sets the tenant id.
     * 
     * @param tenantId
     *            the new tenant id
     */
    public void setTenantId(long tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * Sets the version.
     * 
     * @param version
     *            the new version
     */
    public void setVersion(long version) {
        this.version = version;
    }

}
