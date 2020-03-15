package com.sap.librarydemo.models.dao;

import com.sap.librarydemo.models.entity.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminDaoImpl implements AdminDao {
    List<Admin> adminlist = new ArrayList<Admin>();

    public void init() {
        Admin admin1 = new Admin(1, "admin", "123456");
        Admin admin2 = new Admin(2, "i530923", "123456");
        adminlist.add(admin1);
        adminlist.add(admin2);
    }

    @Override
    public List<Admin> getAdminList() {
        return adminlist;
    }

    @Override
    public boolean insert(Admin admin) {
        return adminlist.add(admin);

    }
}
