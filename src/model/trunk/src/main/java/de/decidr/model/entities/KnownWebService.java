package de.decidr.model.entities;

// Generated 29.10.2009 17:08:04 by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;

/**
 * KnownWebService generated by hbm2java
 */
public class KnownWebService implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private String namespace;
    private byte[] wsdl;
    private Set<Activity> activities = new HashSet<Activity>(0);

    public KnownWebService() {
        //default empty JavaBean constructor
    }

    public KnownWebService(String namespace, byte[] wsdl) {
        //generated minimal constructor
        this.namespace = namespace;
        this.wsdl = wsdl;
    }

    public KnownWebService(String namespace, byte[] wsdl,
            Set<Activity> activities) {
        //generated full constructor
        this.namespace = namespace;
        this.wsdl = wsdl;
        this.activities = activities;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public byte[] getWsdl() {
        return this.wsdl;
    }

    public void setWsdl(byte[] wsdl) {
        this.wsdl = wsdl;
    }

    public Set<Activity> getActivities() {
        return this.activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

}
