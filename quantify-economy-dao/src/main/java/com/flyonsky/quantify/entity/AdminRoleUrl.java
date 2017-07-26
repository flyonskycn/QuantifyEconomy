package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class AdminRoleUrl implements Serializable {
    private Long ruid;

    private Long uid;

    private Long roleid;

    private static final long serialVersionUID = 1L;

    public Long getRuid() {
        return ruid;
    }

    public void setRuid(Long ruid) {
        this.ruid = ruid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}