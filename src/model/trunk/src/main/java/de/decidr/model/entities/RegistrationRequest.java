package de.decidr.model.entities;

// Generated 14.12.2009 17:42:31 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * RegistrationRequest generated by hbm2java
 */
public class RegistrationRequest implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private User user;
    private Date creationDate;
    private String authKey;

    public RegistrationRequest() {
        //default empty JavaBean constructor
    }

    public RegistrationRequest(User user, Date creationDate, String authKey) {
        //generated full constructor
        this.user = user;
        this.creationDate = creationDate;
        this.authKey = authKey;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

}
