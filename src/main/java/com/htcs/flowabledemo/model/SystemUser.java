package com.htcs.flowabledemo.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author
 */
public class SystemUser{
    private String id;
    private String firstName;
    private String LastName;
    private String email;
    private String Fullname;
    private List<SystemGroup> groups;
    private String privileges;

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public List<SystemGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<SystemGroup> groups) {
        this.groups = groups;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }
}