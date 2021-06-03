package com.globant.bootcamp.sevices;

import com.globant.bootcamp.repositories.UserRepository;
import com.globant.bootcamp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public List<User>getUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }

    public List<User> findByName(String name){
        return  userRepository.findUsersByName(name);
    }

    public Optional<User> findByUserName(String name){
        return userRepository.findUserByUserName(name);
    }

    public void updateById(User user){
        userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
