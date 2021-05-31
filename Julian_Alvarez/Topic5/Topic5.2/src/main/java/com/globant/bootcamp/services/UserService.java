package com.globant.bootcamp.services;

import com.globant.bootcamp.entities.User;
import com.globant.bootcamp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void save(User user){
        repository.save(new User(user.getUserName(), user.getFullName(), user.getPassword(), "USER"));
    }
}
