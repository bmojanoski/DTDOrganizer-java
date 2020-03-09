package com.example.dtdorganizer.service;

import com.example.dtdorganizer.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long Id);
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);

}
