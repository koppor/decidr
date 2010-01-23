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

/**
 * RoleHasPermissionId generated by hbm2java.
 */
public class RoleHasPermissionId implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The role id. */
    private long roleId;

    /** The permission id. */
    private long permissionId;

    /**
     * Instantiates a new role has permission id.
     */
    public RoleHasPermissionId() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new role has permission id.
     * 
     * @param roleId
     *            the role id
     * @param permissionId
     *            the permission id
     */
    public RoleHasPermissionId(long roleId, long permissionId) {
        // generated full constructor
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof RoleHasPermissionId)) {
            return false;
        }
        RoleHasPermissionId castOther = (RoleHasPermissionId) other;

        return (this.getRoleId() == castOther.getRoleId())
                && (this.getPermissionId() == castOther.getPermissionId());
    }

    /**
     * Gets the permission id.
     * 
     * @return the permission id
     */
    public long getPermissionId() {
        return this.permissionId;
    }

    /**
     * Gets the role id.
     * 
     * @return the role id
     */
    public long getRoleId() {
        return this.roleId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getRoleId();
        result = 37 * result + (int) this.getPermissionId();
        return result;
    }

    /**
     * Sets the permission id.
     * 
     * @param permissionId
     *            the new permission id
     */
    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * Sets the role id.
     * 
     * @param roleId
     *            the new role id
     */
    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

}
