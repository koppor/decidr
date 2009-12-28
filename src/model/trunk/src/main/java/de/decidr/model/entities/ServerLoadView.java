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

// Generated 28.12.2009 10:39:25 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * ServerLoadView generated by hbm2java.
 */
public class ServerLoadView implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    private long id;

    /** The location. */
    private String location;

    /** The load. */
    private byte load;

    /** The locked. */
    private boolean locked;

    /** The dynamically added. */
    private boolean dynamicallyAdded;

    /** The server type id. */
    private long serverTypeId;

    /** The last load update. */
    private Date lastLoadUpdate;

    /** The server type. */
    private String serverType;

    /** The num instances. */
    private long numInstances;

    /**
     * Instantiates a new server load view.
     */
    public ServerLoadView() {
        // default empty JavaBean constructor
    }

    /**
     * Instantiates a new server load view.
     * 
     * @param id
     *            the id
     * @param location
     *            the location
     * @param load
     *            the load
     * @param locked
     *            the locked
     * @param dynamicallyAdded
     *            the dynamically added
     * @param serverTypeId
     *            the server type id
     * @param serverType
     *            the server type
     * @param numInstances
     *            the num instances
     */
    public ServerLoadView(long id, String location, byte load, boolean locked,
            boolean dynamicallyAdded, long serverTypeId, String serverType,
            long numInstances) {
        // generated minimal constructor
        this.id = id;
        this.location = location;
        this.load = load;
        this.locked = locked;
        this.dynamicallyAdded = dynamicallyAdded;
        this.serverTypeId = serverTypeId;
        this.serverType = serverType;
        this.numInstances = numInstances;
    }

    /**
     * Instantiates a new server load view.
     * 
     * @param id
     *            the id
     * @param location
     *            the location
     * @param load
     *            the load
     * @param locked
     *            the locked
     * @param dynamicallyAdded
     *            the dynamically added
     * @param serverTypeId
     *            the server type id
     * @param lastLoadUpdate
     *            the last load update
     * @param serverType
     *            the server type
     * @param numInstances
     *            the num instances
     */
    public ServerLoadView(long id, String location, byte load, boolean locked,
            boolean dynamicallyAdded, long serverTypeId, Date lastLoadUpdate,
            String serverType, long numInstances) {
        // generated full constructor
        this.id = id;
        this.location = location;
        this.load = load;
        this.locked = locked;
        this.dynamicallyAdded = dynamicallyAdded;
        this.serverTypeId = serverTypeId;
        this.lastLoadUpdate = lastLoadUpdate;
        this.serverType = serverType;
        this.numInstances = numInstances;
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
     * Sets the id.
     * 
     * @param id
     *            the new id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the location.
     * 
     * @return the location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Sets the location.
     * 
     * @param location
     *            the new location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the load.
     * 
     * @return the load
     */
    public byte getLoad() {
        return this.load;
    }

    /**
     * Sets the load.
     * 
     * @param load
     *            the new load
     */
    public void setLoad(byte load) {
        this.load = load;
    }

    /**
     * Checks if is locked.
     * 
     * @return true, if is locked
     */
    public boolean isLocked() {
        return this.locked;
    }

    /**
     * Sets the locked.
     * 
     * @param locked
     *            the new locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * Checks if is dynamically added.
     * 
     * @return true, if is dynamically added
     */
    public boolean isDynamicallyAdded() {
        return this.dynamicallyAdded;
    }

    /**
     * Sets the dynamically added.
     * 
     * @param dynamicallyAdded
     *            the new dynamically added
     */
    public void setDynamicallyAdded(boolean dynamicallyAdded) {
        this.dynamicallyAdded = dynamicallyAdded;
    }

    /**
     * Gets the server type id.
     * 
     * @return the server type id
     */
    public long getServerTypeId() {
        return this.serverTypeId;
    }

    /**
     * Sets the server type id.
     * 
     * @param serverTypeId
     *            the new server type id
     */
    public void setServerTypeId(long serverTypeId) {
        this.serverTypeId = serverTypeId;
    }

    /**
     * Gets the last load update.
     * 
     * @return the last load update
     */
    public Date getLastLoadUpdate() {
        return this.lastLoadUpdate;
    }

    /**
     * Sets the last load update.
     * 
     * @param lastLoadUpdate
     *            the new last load update
     */
    public void setLastLoadUpdate(Date lastLoadUpdate) {
        this.lastLoadUpdate = lastLoadUpdate;
    }

    /**
     * Gets the server type.
     * 
     * @return the server type
     */
    public String getServerType() {
        return this.serverType;
    }

    /**
     * Sets the server type.
     * 
     * @param serverType
     *            the new server type
     */
    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * Gets the num instances.
     * 
     * @return the num instances
     */
    public long getNumInstances() {
        return this.numInstances;
    }

    /**
     * Sets the num instances.
     * 
     * @param numInstances
     *            the new num instances
     */
    public void setNumInstances(long numInstances) {
        this.numInstances = numInstances;
    }

}
