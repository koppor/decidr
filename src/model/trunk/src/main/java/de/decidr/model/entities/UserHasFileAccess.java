package de.decidr.model.entities;

// Generated 29.10.2009 17:08:04 by Hibernate Tools 3.2.4.GA

/**
 * UserHasFileAccess generated by hbm2java
 */
public class UserHasFileAccess implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private UserHasFileAccessId id;
    private User user;
    private File file;
    private boolean mayRead;
    private boolean mayDelete;
    private boolean mayReplace;

    public UserHasFileAccess() {
        //default empty JavaBean constructor
    }

    public UserHasFileAccess(UserHasFileAccessId id, User user, File file,
            boolean mayRead, boolean mayDelete, boolean mayReplace) {
        //generated full constructor
        this.id = id;
        this.user = user;
        this.file = file;
        this.mayRead = mayRead;
        this.mayDelete = mayDelete;
        this.mayReplace = mayReplace;
    }

    public UserHasFileAccessId getId() {
        return this.id;
    }

    public void setId(UserHasFileAccessId id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public File getFile() {
        return this.file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean isMayRead() {
        return this.mayRead;
    }

    public void setMayRead(boolean mayRead) {
        this.mayRead = mayRead;
    }

    public boolean isMayDelete() {
        return this.mayDelete;
    }

    public void setMayDelete(boolean mayDelete) {
        this.mayDelete = mayDelete;
    }

    public boolean isMayReplace() {
        return this.mayReplace;
    }

    public void setMayReplace(boolean mayReplace) {
        this.mayReplace = mayReplace;
    }

}
