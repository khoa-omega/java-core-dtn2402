package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    public List<User> findEmployeeAndManagerByProjectId(int projectId) {
        return service.findEmployeeAndManagerByProjectId(projectId);
    }

    public User findAdminByEmailAndPassword(String email, String password) {
        return service.findAdminByEmailAndPassword(email, password);
    }

    public int create(String fullName, String email) {
        return service.create(fullName, email);
    }
}
