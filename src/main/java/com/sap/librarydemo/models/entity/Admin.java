package com.sap.librarydemo.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
public class Admin {

    private int no;   //序号
    private String adminId; //用户名
    private String adminPwd;//用户密码



    @Override
    public String toString() {
        return "Admin [no=" + no + ", adminId=" + adminId + ", adminPwd=" + adminPwd + "]";
    }
    public Admin() {
        super();
    }
}
