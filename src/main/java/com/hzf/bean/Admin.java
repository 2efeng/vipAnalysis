package com.hzf.bean;

public class Admin {

    private String adminname;
    private String adminpwd;

    public Admin() {
        this.adminname = "admin";
        this.adminpwd = "admin";
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd;
    }


}
