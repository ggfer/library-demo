package com.sap.librarydemo.models.entity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Admin {

    private int no;   //序号
    private String adminId; //用户名
    private String adminPwd;//用户密码


    public Admin(int no, String adminId, String adminPwd) {
        super();
        this.no = no;
        this.adminId = adminId;
        this.adminPwd = adminPwd;
    }

    @Override
    public String toString() {
        return "Admin [no=" + no + ", adminId=" + adminId + ", adminPwd=" + adminPwd + "]";
    }
    public Admin() {
        super();
    }
}
