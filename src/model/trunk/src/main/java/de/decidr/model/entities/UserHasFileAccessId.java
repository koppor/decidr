package de.decidr.model.entities;

// Generated 29.05.2009 18:32:43 by Hibernate Tools 3.2.2.GA

/**
 * UserHasFileAccessId generated by hbm2java
 */
public class UserHasFileAccessId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private long fileId;

    public UserHasFileAccessId() {
    }

    public UserHasFileAccessId(long userId, long fileId) {
        this.userId = userId;
        this.fileId = fileId;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getFileId() {
        return this.fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof UserHasFileAccessId))
            return false;
        UserHasFileAccessId castOther = (UserHasFileAccessId) other;

        return (this.getUserId() == castOther.getUserId())
                && (this.getFileId() == castOther.getFileId());
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getUserId();
        result = 37 * result + (int) this.getFileId();
        return result;
    }

}
