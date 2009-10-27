package de.decidr.model.entities;

// Generated 27.10.2009 21:04:58 by Hibernate Tools 3.2.4.GA

/**
 * UserProfile generated by hbm2java
 */
public class UserProfile implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long userId;
    private User user;
    private String username;
    private String passwordHash;
    private String passwordSalt;
    private String firstName;
    private String lastName;
    private String street;
    private String postalCode;
    private String city;

    public UserProfile() {
        //default empty JavaBean constructor
    }

    public UserProfile(User user, String username, String passwordHash,
            String passwordSalt) {
        //generated minimal constructor
        this.user = user;
        this.username = username;
        this.passwordHash = passwordHash;
        this.passwordSalt = passwordSalt;
    }

    public UserProfile(User user, String username, String passwordHash,
            String passwordSalt, String firstName, String lastName,
            String street, String postalCode, String city) {
        //generated full constructor
        this.user = user;
        this.username = username;
        this.passwordHash = passwordHash;
        this.passwordSalt = passwordSalt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordSalt() {
        return this.passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
