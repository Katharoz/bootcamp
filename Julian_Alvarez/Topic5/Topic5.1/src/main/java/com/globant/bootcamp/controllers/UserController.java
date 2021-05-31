package com.globant.bootcamp.controllers;

import com.globant.bootcamp.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import static com.globant.bootcamp.Application.users;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping("/get")
    public List<User> users(){
        return users;
    }

    @PostMapping("/post")
    public void addUser(@RequestBody User user){
        users.add(user);
    }

    @PutMapping("/put/{id}")
    public void updateUser(@PathVariable int id, @RequestBody User user){
        User updUsr = users.get(id-1);

        updUsr.setName(user.getName());
        updUsr.setLastName(user.getLastName());
    }

    @GetMapping("/getByName")
    public List<User> findByName(@RequestParam(value = "name") String name){
        List<User> usersByName = new ArrayList<>();
        users.forEach(user -> {
            if (user.getName().equals(name)) usersByName.add(user);
        });

        return usersByName;

    }


}
