package de.decidr.model.entities;

// Generated 25.09.2009 13:27:01 by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;

/**
 * ServerType generated by hbm2java
 */
public class ServerType implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private Set<Server> servers = new HashSet<Server>(0);

    public ServerType() {
    }

    public ServerType(String name) {
        this.name = name;
    }

    public ServerType(String name, Set<Server> servers) {
        this.name = name;
        this.servers = servers;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Server> getServers() {
        return this.servers;
    }

    public void setServers(Set<Server> servers) {
        this.servers = servers;
    }

}
