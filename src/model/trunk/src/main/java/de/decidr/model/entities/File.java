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
 * File generated by hbm2java.
 */
public class File implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private Long id;
    
    /** The file name. */
    private String fileName;
    
    /** The mime type. */
    private String mimeType;
    
    /** The may public read. */
    private boolean mayPublicRead;
    
    /** The may public replace. */
    private boolean mayPublicReplace;
    
    /** The may public delete. */
    private boolean mayPublicDelete;
    
    /** The file size bytes. */
    private long fileSizeBytes;
    
    /** The data. */
    private byte[] data;
    
    /** The creation date. */
    private Date creationDate;
    
    /** The temporary. */
    private boolean temporary;
    
    /** The tenants for advanced color scheme id. */
    private Set<Tenant> tenantsForAdvancedColorSchemeId = new HashSet<Tenant>(0);
    
    /** The tenants for simple color scheme id. */
    private Set<Tenant> tenantsForSimpleColorSchemeId = new HashSet<Tenant>(0);
    
    /** The tenants for logo id. */
    private Set<Tenant> tenantsForLogoId = new HashSet<Tenant>(0);
    
    /** The tenants for current color scheme id. */
    private Set<Tenant> tenantsForCurrentColorSchemeId = new HashSet<Tenant>(0);
    
    /** The work item contains files. */
    private Set<WorkItemContainsFile> workItemContainsFiles = new HashSet<WorkItemContainsFile>(
            0);
    
    /** The user has file access. */
    private Set<UserHasFileAccess> userHasFileAccess = new HashSet<UserHasFileAccess>(
            0);

    /**
     * Instantiates a new file.
     */
    public File() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new file.
     * 
     * @param fileName
     *            the file name
     * @param mimeType
     *            the mime type
     * @param mayPublicRead
     *            the may public read
     * @param mayPublicReplace
     *            the may public replace
     * @param mayPublicDelete
     *            the may public delete
     * @param fileSizeBytes
     *            the file size bytes
     * @param creationDate
     *            the creation date
     * @param temporary
     *            the temporary
     */
    public File(String fileName, String mimeType, boolean mayPublicRead,
            boolean mayPublicReplace, boolean mayPublicDelete,
            long fileSizeBytes, Date creationDate, boolean temporary) {
        // generated minimal constructor
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.mayPublicRead = mayPublicRead;
        this.mayPublicReplace = mayPublicReplace;
        this.mayPublicDelete = mayPublicDelete;
        this.fileSizeBytes = fileSizeBytes;
        this.creationDate = creationDate;
        this.temporary = temporary;
    }

    /**
     * Instantiates a new file.
     * 
     * @param fileName
     *            the file name
     * @param mimeType
     *            the mime type
     * @param mayPublicRead
     *            the may public read
     * @param mayPublicReplace
     *            the may public replace
     * @param mayPublicDelete
     *            the may public delete
     * @param fileSizeBytes
     *            the file size bytes
     * @param data
     *            the data
     * @param creationDate
     *            the creation date
     * @param temporary
     *            the temporary
     * @param tenantsForAdvancedColorSchemeId
     *            the tenants for advanced color scheme id
     * @param tenantsForSimpleColorSchemeId
     *            the tenants for simple color scheme id
     * @param tenantsForLogoId
     *            the tenants for logo id
     * @param tenantsForCurrentColorSchemeId
     *            the tenants for current color scheme id
     * @param workItemContainsFiles
     *            the work item contains files
     * @param userHasFileAccess
     *            the user has file access
     */
    public File(String fileName, String mimeType, boolean mayPublicRead,
            boolean mayPublicReplace, boolean mayPublicDelete,
            long fileSizeBytes, byte[] data, Date creationDate,
            boolean temporary, Set<Tenant> tenantsForAdvancedColorSchemeId,
            Set<Tenant> tenantsForSimpleColorSchemeId,
            Set<Tenant> tenantsForLogoId,
            Set<Tenant> tenantsForCurrentColorSchemeId,
            Set<WorkItemContainsFile> workItemContainsFiles,
            Set<UserHasFileAccess> userHasFileAccess) {
        // generated full constructor
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.mayPublicRead = mayPublicRead;
        this.mayPublicReplace = mayPublicReplace;
        this.mayPublicDelete = mayPublicDelete;
        this.fileSizeBytes = fileSizeBytes;
        this.data = data;
        this.creationDate = creationDate;
        this.temporary = temporary;
        this.tenantsForAdvancedColorSchemeId = tenantsForAdvancedColorSchemeId;
        this.tenantsForSimpleColorSchemeId = tenantsForSimpleColorSchemeId;
        this.tenantsForLogoId = tenantsForLogoId;
        this.tenantsForCurrentColorSchemeId = tenantsForCurrentColorSchemeId;
        this.workItemContainsFiles = workItemContainsFiles;
        this.userHasFileAccess = userHasFileAccess;
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
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the file name.
     * 
     * @return the file name
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Sets the file name.
     * 
     * @param fileName
     *            the new file name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets the mime type.
     * 
     * @return the mime type
     */
    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * Sets the mime type.
     * 
     * @param mimeType
     *            the new mime type
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Checks if is may public read.
     * 
     * @return true, if is may public read
     */
    public boolean isMayPublicRead() {
        return this.mayPublicRead;
    }

    /**
     * Sets the may public read.
     * 
     * @param mayPublicRead
     *            the new may public read
     */
    public void setMayPublicRead(boolean mayPublicRead) {
        this.mayPublicRead = mayPublicRead;
    }

    /**
     * Checks if is may public replace.
     * 
     * @return true, if is may public replace
     */
    public boolean isMayPublicReplace() {
        return this.mayPublicReplace;
    }

    /**
     * Sets the may public replace.
     * 
     * @param mayPublicReplace
     *            the new may public replace
     */
    public void setMayPublicReplace(boolean mayPublicReplace) {
        this.mayPublicReplace = mayPublicReplace;
    }

    /**
     * Checks if is may public delete.
     * 
     * @return true, if is may public delete
     */
    public boolean isMayPublicDelete() {
        return this.mayPublicDelete;
    }

    /**
     * Sets the may public delete.
     * 
     * @param mayPublicDelete
     *            the new may public delete
     */
    public void setMayPublicDelete(boolean mayPublicDelete) {
        this.mayPublicDelete = mayPublicDelete;
    }

    /**
     * Gets the file size bytes.
     * 
     * @return the file size bytes
     */
    public long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    /**
     * Sets the file size bytes.
     * 
     * @param fileSizeBytes
     *            the new file size bytes
     */
    public void setFileSizeBytes(long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public byte[] getData() {
        return this.data;
    }

    /**
     * Sets the data.
     * 
     * @param data
     *            the new data
     */
    public void setData(byte[] data) {
        this.data = data;
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
     * Sets the creation date.
     * 
     * @param creationDate
     *            the new creation date
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Checks if is temporary.
     * 
     * @return true, if is temporary
     */
    public boolean isTemporary() {
        return this.temporary;
    }

    /**
     * Sets the temporary.
     * 
     * @param temporary
     *            the new temporary
     */
    public void setTemporary(boolean temporary) {
        this.temporary = temporary;
    }

    /**
     * Gets the tenants for advanced color scheme id.
     * 
     * @return the tenants for advanced color scheme id
     */
    public Set<Tenant> getTenantsForAdvancedColorSchemeId() {
        return this.tenantsForAdvancedColorSchemeId;
    }

    /**
     * Sets the tenants for advanced color scheme id.
     * 
     * @param tenantsForAdvancedColorSchemeId
     *            the new tenants for advanced color scheme id
     */
    public void setTenantsForAdvancedColorSchemeId(
            Set<Tenant> tenantsForAdvancedColorSchemeId) {
        this.tenantsForAdvancedColorSchemeId = tenantsForAdvancedColorSchemeId;
    }

    /**
     * Gets the tenants for simple color scheme id.
     * 
     * @return the tenants for simple color scheme id
     */
    public Set<Tenant> getTenantsForSimpleColorSchemeId() {
        return this.tenantsForSimpleColorSchemeId;
    }

    /**
     * Sets the tenants for simple color scheme id.
     * 
     * @param tenantsForSimpleColorSchemeId
     *            the new tenants for simple color scheme id
     */
    public void setTenantsForSimpleColorSchemeId(
            Set<Tenant> tenantsForSimpleColorSchemeId) {
        this.tenantsForSimpleColorSchemeId = tenantsForSimpleColorSchemeId;
    }

    /**
     * Gets the tenants for logo id.
     * 
     * @return the tenants for logo id
     */
    public Set<Tenant> getTenantsForLogoId() {
        return this.tenantsForLogoId;
    }

    /**
     * Sets the tenants for logo id.
     * 
     * @param tenantsForLogoId
     *            the new tenants for logo id
     */
    public void setTenantsForLogoId(Set<Tenant> tenantsForLogoId) {
        this.tenantsForLogoId = tenantsForLogoId;
    }

    /**
     * Gets the tenants for current color scheme id.
     * 
     * @return the tenants for current color scheme id
     */
    public Set<Tenant> getTenantsForCurrentColorSchemeId() {
        return this.tenantsForCurrentColorSchemeId;
    }

    /**
     * Sets the tenants for current color scheme id.
     * 
     * @param tenantsForCurrentColorSchemeId
     *            the new tenants for current color scheme id
     */
    public void setTenantsForCurrentColorSchemeId(
            Set<Tenant> tenantsForCurrentColorSchemeId) {
        this.tenantsForCurrentColorSchemeId = tenantsForCurrentColorSchemeId;
    }

    /**
     * Gets the work item contains files.
     * 
     * @return the work item contains files
     */
    public Set<WorkItemContainsFile> getWorkItemContainsFiles() {
        return this.workItemContainsFiles;
    }

    /**
     * Sets the work item contains files.
     * 
     * @param workItemContainsFiles
     *            the new work item contains files
     */
    public void setWorkItemContainsFiles(
            Set<WorkItemContainsFile> workItemContainsFiles) {
        this.workItemContainsFiles = workItemContainsFiles;
    }

    /**
     * Gets the user has file access.
     * 
     * @return the user has file access
     */
    public Set<UserHasFileAccess> getUserHasFileAccess() {
        return this.userHasFileAccess;
    }

    /**
     * Sets the user has file access.
     * 
     * @param userHasFileAccess
     *            the new user has file access
     */
    public void setUserHasFileAccess(Set<UserHasFileAccess> userHasFileAccess) {
        this.userHasFileAccess = userHasFileAccess;
    }

}
