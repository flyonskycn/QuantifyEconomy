package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class AdminRole implements Serializable {
    private Long roleid;

    private String rolename;

    private static final long serialVersionUID = 1L;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}