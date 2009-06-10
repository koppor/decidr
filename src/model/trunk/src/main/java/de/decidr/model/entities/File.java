package de.decidr.model.entities;

// Generated 10.06.2009 15:02:36 by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;

/**
 * File generated by hbm2java
 */
public class File implements java.io.Serializable {

    private Long id;
    private String fileName;
    private String mimeType;
    private boolean mayPublicRead;
    private Set<Tenant> tenantsForAdvancedColorSchemeId = new HashSet<Tenant>(0);
    private Set<Tenant> tenantsForSimpleColorSchemeId = new HashSet<Tenant>(0);
    private Set<Tenant> tenantsForLogoId = new HashSet<Tenant>(0);
    private Set<Tenant> tenantsForCurrentColorSchemeId = new HashSet<Tenant>(0);
    private Set<UserHasFileAccess> userHasFileAccess = new HashSet<UserHasFileAccess>(
            0);

    public File() {
    }

    public File(String fileName, String mimeType, boolean mayPublicRead) {
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.mayPublicRead = mayPublicRead;
    }

    public File(String fileName, String mimeType, boolean mayPublicRead,
            Set<Tenant> tenantsForAdvancedColorSchemeId,
            Set<Tenant> tenantsForSimpleColorSchemeId,
            Set<Tenant> tenantsForLogoId,
            Set<Tenant> tenantsForCurrentColorSchemeId,
            Set<UserHasFileAccess> userHasFileAccess) {
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.mayPublicRead = mayPublicRead;
        this.tenantsForAdvancedColorSchemeId = tenantsForAdvancedColorSchemeId;
        this.tenantsForSimpleColorSchemeId = tenantsForSimpleColorSchemeId;
        this.tenantsForLogoId = tenantsForLogoId;
        this.tenantsForCurrentColorSchemeId = tenantsForCurrentColorSchemeId;
        this.userHasFileAccess = userHasFileAccess;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public boolean isMayPublicRead() {
        return this.mayPublicRead;
    }

    public void setMayPublicRead(boolean mayPublicRead) {
        this.mayPublicRead = mayPublicRead;
    }

    public Set<Tenant> getTenantsForAdvancedColorSchemeId() {
        return this.tenantsForAdvancedColorSchemeId;
    }

    public void setTenantsForAdvancedColorSchemeId(
            Set<Tenant> tenantsForAdvancedColorSchemeId) {
        this.tenantsForAdvancedColorSchemeId = tenantsForAdvancedColorSchemeId;
    }

    public Set<Tenant> getTenantsForSimpleColorSchemeId() {
        return this.tenantsForSimpleColorSchemeId;
    }

    public void setTenantsForSimpleColorSchemeId(
            Set<Tenant> tenantsForSimpleColorSchemeId) {
        this.tenantsForSimpleColorSchemeId = tenantsForSimpleColorSchemeId;
    }

    public Set<Tenant> getTenantsForLogoId() {
        return this.tenantsForLogoId;
    }

    public void setTenantsForLogoId(Set<Tenant> tenantsForLogoId) {
        this.tenantsForLogoId = tenantsForLogoId;
    }

    public Set<Tenant> getTenantsForCurrentColorSchemeId() {
        return this.tenantsForCurrentColorSchemeId;
    }

    public void setTenantsForCurrentColorSchemeId(
            Set<Tenant> tenantsForCurrentColorSchemeId) {
        this.tenantsForCurrentColorSchemeId = tenantsForCurrentColorSchemeId;
    }

    public Set<UserHasFileAccess> getUserHasFileAccess() {
        return this.userHasFileAccess;
    }

    public void setUserHasFileAccess(Set<UserHasFileAccess> userHasFileAccess) {
        this.userHasFileAccess = userHasFileAccess;
    }

    // The following is extra code specified in the hbm.xml files
    private static final long serialVersionUID = 1L;
    // end of extra code specified in the hbm.xml files

}
