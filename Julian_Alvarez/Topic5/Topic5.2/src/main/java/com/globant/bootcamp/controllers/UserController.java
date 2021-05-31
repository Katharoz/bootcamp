package com.globant.bootcamp.controllers;

import com.globant.bootcamp.entities.User;
import com.globant.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/get")
    public String get(){
        if (securityContextHolder()==null){
            return "error, no user";
        }
        return "get";
    }

    @Autowired
    private UserService service;

    @PostMapping("/singIn")
    public String register(@RequestBody User user){
        service.save(user);
        return "User Created Successfully";
    }

    public static String securityContextHolder(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            return authentication.getName();
        }
        return null;
    }

}
