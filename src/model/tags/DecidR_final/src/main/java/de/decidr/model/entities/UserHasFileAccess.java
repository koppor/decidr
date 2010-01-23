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
 * UserHasFileAccess generated by hbm2java.
 */
public class UserHasFileAccess implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private UserHasFileAccessId id;

    /** The user. */
    private User user;

    /** The file. */
    private File file;

    /** The may read. */
    private boolean mayRead;

    /** The may delete. */
    private boolean mayDelete;

    /** The may replace. */
    private boolean mayReplace;

    /**
     * Instantiates a new user has file access.
     */
    public UserHasFileAccess() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new user has file access.
     * 
     * @param id
     *            the id
     * @param user
     *            the user
     * @param file
     *            the file
     * @param mayRead
     *            the may read
     * @param mayDelete
     *            the may delete
     * @param mayReplace
     *            the may replace
     */
    public UserHasFileAccess(UserHasFileAccessId id, User user, File file,
            boolean mayRead, boolean mayDelete, boolean mayReplace) {
        // generated full constructor
        this.id = id;
        this.user = user;
        this.file = file;
        this.mayRead = mayRead;
        this.mayDelete = mayDelete;
        this.mayReplace = mayReplace;
    }

    /**
     * Gets the file.
     * 
     * @return the file
     */
    public File getFile() {
        return this.file;
    }

    /**
     * Gets the id.
     * 
     * @return the id
     */
    public UserHasFileAccessId getId() {
        return this.id;
    }

    /**
     * Gets the user.
     * 
     * @return the user
     */
    public User getUser() {
        return this.user;
    }

    /**
     * Checks if is may delete.
     * 
     * @return true, if is may delete
     */
    public boolean isMayDelete() {
        return this.mayDelete;
    }

    /**
     * Checks if is may read.
     * 
     * @return true, if is may read
     */
    public boolean isMayRead() {
        return this.mayRead;
    }

    /**
     * Checks if is may replace.
     * 
     * @return true, if is may replace
     */
    public boolean isMayReplace() {
        return this.mayReplace;
    }

    /**
     * Sets the file.
     * 
     * @param file
     *            the new file
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(UserHasFileAccessId id) {
        this.id = id;
    }

    /**
     * Sets the may delete.
     * 
     * @param mayDelete
     *            the new may delete
     */
    public void setMayDelete(boolean mayDelete) {
        this.mayDelete = mayDelete;
    }

    /**
     * Sets the may read.
     * 
     * @param mayRead
     *            the new may read
     */
    public void setMayRead(boolean mayRead) {
        this.mayRead = mayRead;
    }

    /**
     * Sets the may replace.
     * 
     * @param mayReplace
     *            the new may replace
     */
    public void setMayReplace(boolean mayReplace) {
        this.mayReplace = mayReplace;
    }

    /**
     * Sets the user.
     * 
     * @param user
     *            the new user
     */
    public void setUser(User user) {
        this.user = user;
    }

}
