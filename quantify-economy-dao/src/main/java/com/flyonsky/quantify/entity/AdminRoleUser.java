package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class AdminRoleUser implements Serializable {
    private Long urid;

    private Long adminid;

    private Long roleid;

    private static final long serialVersionUID = 1L;

    public Long getUrid() {
        return urid;
    }

    public void setUrid(Long urid) {
        this.urid = urid;
    }

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }
}