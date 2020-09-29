package com.example.dtdorganizer.service.impl;

import com.example.dtdorganizer.exceptions.UserNotFoundException;
import com.example.dtdorganizer.model.User;
import com.example.dtdorganizer.repository.UserRepository;
import com.example.dtdorganizer.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public String getSpecificUser(Long id) {
        User user = this.userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        return user.getFullName();
    }
}
