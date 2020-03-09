package com.example.dtdorganizer.controller;

import com.example.dtdorganizer.model.User;
import com.example.dtdorganizer.repository.UserRepository;
import com.example.dtdorganizer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //get users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    //get user by id
    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Long Id){
        return this.userService.getUserById(Id);
    }
    //save user
    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return this.userService.createUser(user);
    }
    //update user

    //delete user
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long Id){
        this.userService.deleteUser(Id);
    }

}
