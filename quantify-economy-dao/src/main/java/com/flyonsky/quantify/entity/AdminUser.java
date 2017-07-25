package com.flyonsky.quantify.entity;

import java.util.Date;

public class AdminUser {
    private Long adminid;

    private String adminemail;

    private String adminpwd;

    private String adminname;

    private String headerpic;

    private String admindesc;

    private Date adminjoin;

    private Date logintime;

    private String location;

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public String getAdminemail() {
        return adminemail;
    }

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
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

    public String getHeaderpic() {
        return headerpic;
    }

    public void setHeaderpic(String headerpic) {
        this.headerpic = headerpic == null ? null : headerpic.trim();
    }

    public String getAdmindesc() {
        return admindesc;
    }

    public void setAdmindesc(String admindesc) {
        this.admindesc = admindesc == null ? null : admindesc.trim();
    }

    public Date getAdminjoin() {
        return adminjoin;
    }

    public void setAdminjoin(Date adminjoin) {
        this.adminjoin = adminjoin;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}