package com.andymartinez1.notes.service;

import com.andymartinez1.notes.dto.UserDTO;
import com.andymartinez1.notes.entity.User;

import java.util.List;

public interface UserService {

    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}

