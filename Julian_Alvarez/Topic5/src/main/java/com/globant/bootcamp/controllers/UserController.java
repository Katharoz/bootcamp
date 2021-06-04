package com.globant.bootcamp.controllers;

import com.globant.bootcamp.models.User;
import com.globant.bootcamp.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> users(){
        return userService.getUsers();
    }

    @GetMapping("/name")
    public List<User> usersByName(@RequestParam("name") String name){
        return userService.findByName(name);
    }

    @GetMapping("/username")
    public Optional<User> userByUsername(@RequestParam("username") String userName){
        return userService.findByUserName(userName);
    }

    @PostMapping
    public String addUser(@RequestBody User user){
        if (userService.findByUserName(user.getUserName()).isEmpty()){
            userService.addUser(user);
            return "User created";
        }
        return "User name already exist";
    }

    @PutMapping
    public void updateUser(@RequestBody User user){
        userService.updateById(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteById(id);
    }

}
