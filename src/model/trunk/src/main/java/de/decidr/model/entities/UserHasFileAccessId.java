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
 * UserHasFileAccessId generated by hbm2java.
 */
public class UserHasFileAccessId implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The user id. */
    private long userId;

    /** The file id. */
    private long fileId;

    /**
     * Instantiates a new user has file access id.
     */
    public UserHasFileAccessId() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new user has file access id.
     * 
     * @param userId
     *            the user id
     * @param fileId
     *            the file id
     */
    public UserHasFileAccessId(long userId, long fileId) {
        // generated full constructor
        this.userId = userId;
        this.fileId = fileId;
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
        if (!(other instanceof UserHasFileAccessId)) {
            return false;
        }
        UserHasFileAccessId castOther = (UserHasFileAccessId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getFileId() == castOther.getFileId());
    }

    /**
     * Gets the file id.
     * 
     * @return the file id
     */
    public long getFileId() {
        return this.fileId;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public long getUserId() {
        return this.userId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getUserId();
        result = 37 * result + (int) this.getFileId();
        return result;
    }

    /**
     * Sets the file id.
     * 
     * @param fileId
     *            the new file id
     */
    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    /**
     * Sets the user id.
     * 
     * @param userId
     *            the new user id
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

}
