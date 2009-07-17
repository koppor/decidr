package de.decidr.model.entities;

// Generated 17.07.2009 17:02:43 by Hibernate Tools 3.2.4.GA

import java.util.Date;

/**
 * Login generated by hbm2java
 */
public class Login implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private User user;
    private Date loginDate;
    private boolean success;

    public Login() {
    }

    public Login(User user, Date loginDate, boolean success) {
        this.user = user;
        this.loginDate = loginDate;
        this.success = success;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
