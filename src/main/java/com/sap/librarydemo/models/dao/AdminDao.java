package com.sap.librarydemo.models.dao;

import com.sap.librarydemo.models.entity.Admin;

import java.util.List;

public interface AdminDao {
    public List<Admin> getAdminList();

    public boolean insert(Admin admin);
}
