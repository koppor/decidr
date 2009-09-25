package de.decidr.model.entities;

// Generated 25.09.2009 13:27:01 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * ServerLoadView generated by hbm2java
 */
public class ServerLoadView implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private String location;
    private byte load;
    private boolean locked;
    private boolean dynamicallyAdded;
    private long serverTypeId;
    private Date lastLoadUpdate;
    private String serverType;
    private long numInstances;

    public ServerLoadView() {
    }

    public ServerLoadView(long id, String location, byte load, boolean locked,
            boolean dynamicallyAdded, long serverTypeId, String serverType,
            long numInstances) {
        this.id = id;
        this.location = location;
        this.load = load;
        this.locked = locked;
        this.dynamicallyAdded = dynamicallyAdded;
        this.serverTypeId = serverTypeId;
        this.serverType = serverType;
        this.numInstances = numInstances;
    }

    public ServerLoadView(long id, String location, byte load, boolean locked,
            boolean dynamicallyAdded, long serverTypeId, Date lastLoadUpdate,
            String serverType, long numInstances) {
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

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public byte getLoad() {
        return this.load;
    }

    public void setLoad(byte load) {
        this.load = load;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isDynamicallyAdded() {
        return this.dynamicallyAdded;
    }

    public void setDynamicallyAdded(boolean dynamicallyAdded) {
        this.dynamicallyAdded = dynamicallyAdded;
    }

    public long getServerTypeId() {
        return this.serverTypeId;
    }

    public void setServerTypeId(long serverTypeId) {
        this.serverTypeId = serverTypeId;
    }

    public Date getLastLoadUpdate() {
        return this.lastLoadUpdate;
    }

    public void setLastLoadUpdate(Date lastLoadUpdate) {
        this.lastLoadUpdate = lastLoadUpdate;
    }

    public String getServerType() {
        return this.serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public long getNumInstances() {
        return this.numInstances;
    }

    public void setNumInstances(long numInstances) {
        this.numInstances = numInstances;
    }

}
