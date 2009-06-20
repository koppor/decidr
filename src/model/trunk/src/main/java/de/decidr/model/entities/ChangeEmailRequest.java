package de.decidr.model.entities;

// Generated 20.06.2009 13:06:16 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * ChangeEmailRequest generated by hbm2java
 */
public class ChangeEmailRequest implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private User user;
    private String newEmail;
    private Date creationDate;
    private String authKey;

    public ChangeEmailRequest() {
    }

    public ChangeEmailRequest(User user, String newEmail, Date creationDate,
            String authKey) {
        this.user = user;
        this.newEmail = newEmail;
        this.creationDate = creationDate;
        this.authKey = authKey;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNewEmail() {
        return this.newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
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
