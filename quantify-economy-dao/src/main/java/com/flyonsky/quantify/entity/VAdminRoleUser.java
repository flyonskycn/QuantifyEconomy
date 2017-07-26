package com.flyonsky.quantify.entity;

import java.io.Serializable;
import java.util.Date;

public class VAdminRoleUser implements Serializable {
    private Long adminid;

    private String adminpwd;

    private String adminname;

    private Date adminjoin;

    private Long roleid;

    private String rolename;

    private Long urid;

    private static final long serialVersionUID = 1L;

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public Date getAdminjoin() {
        return adminjoin;
    }

    public void setAdminjoin(Date adminjoin) {
        this.adminjoin = adminjoin;
    }

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

    public Long getUrid() {
        return urid;
    }

    public void setUrid(Long urid) {
        this.urid = urid;
    }
}