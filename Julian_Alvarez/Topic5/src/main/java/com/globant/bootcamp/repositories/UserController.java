package com.globant.bootcamp.repositories;

import com.globant.bootcamp.entities.User;
import com.globant.bootcamp.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> users(){
        return userService.getUsers();
    }

    @GetMapping("/name")
    public List<User> usersByName(@RequestParam("name") String name){
        return userService.findByName(name);
    }

    @GetMapping("/userName")
    public Optional<User> userByUsername(@RequestParam("userName") String userName){
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

    @PutMapping("/{id}")
    public void updateUser(@PathVariable("id") UUID id, @RequestBody User user){
        userService.updateById(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") UUID id){
        userService.deleteById(id);
    }

}
