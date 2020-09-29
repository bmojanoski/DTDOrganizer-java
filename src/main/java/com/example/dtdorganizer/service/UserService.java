package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    String getSpecificUser(Long id);
}
