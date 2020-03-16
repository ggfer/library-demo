package com.sap.librarydemo.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;



@Data
@AllArgsConstructor
@Entity
@Table(name = "admin")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1529915847634716038L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "ADMIN_ID")
    private String adminId; //用户名
    @Column(name = "ADMIN_PASSWORD")
    private String adminPwd;//用户密码



    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", adminPwd=" + adminPwd + "]";
    }
    public Admin() {
        super();
    }
}
