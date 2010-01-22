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
 * UserAdministratesWorkflowInstanceId generated by hbm2java.
 */
public class UserAdministratesWorkflowInstanceId implements
        java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The user id. */
    private long userId;
    
    /** The workflow instance id. */
    private long workflowInstanceId;

    /**
     * Instantiates a new user administrates workflow instance id.
     */
    public UserAdministratesWorkflowInstanceId() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new user administrates workflow instance id.
     * 
     * @param userId
     *            the user id
     * @param workflowInstanceId
     *            the workflow instance id
     */
    public UserAdministratesWorkflowInstanceId(long userId,
            long workflowInstanceId) {
        // generated full constructor
        this.userId = userId;
        this.workflowInstanceId = workflowInstanceId;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public long getUserId() {
        return this.userId;
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

    /**
     * Gets the workflow instance id.
     * 
     * @return the workflow instance id
     */
    public long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    /**
     * Sets the workflow instance id.
     * 
     * @param workflowInstanceId
     *            the new workflow instance id
     */
    public void setWorkflowInstanceId(long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof UserAdministratesWorkflowInstanceId))
            return false;
        UserAdministratesWorkflowInstanceId castOther = (UserAdministratesWorkflowInstanceId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getWorkflowInstanceId() == castOther
                        .getWorkflowInstanceId());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getUserId();
        result = 37 * result + (int) this.getWorkflowInstanceId();
        return result;
    }

}
