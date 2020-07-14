package com.example.service;

import com.example.model.Role;
import com.example.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User findById(Long id);
    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    User getUserByName(String name);
    void addUserRoles(Long userId, String userRoles);
    Role findByRole(String role);
    Role findByRole(Long id);
    List<Role> getAllRoles();
}
