package com.globant.bootcamp.sevices;

import com.globant.bootcamp.dao.UserDao;
import com.globant.bootcamp.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void addUser(User user){
        userDao.insertUser(user);
    }

    public List<User> getUsers(){
        return userDao.getUsers();
    }

    public Optional<User> findById(UUID id){
        return userDao.findUserById(id);
    }

    public List<User> findByName(String name){
        return  userDao.findUsersByName(name);
    }

    public Optional<User> findByUserName(String name){
        return userDao.findUserByUserName(name);
    }

    public void updateById(UUID id, User user){
        userDao.updateUserById(id, user);
    }

    public void deleteById(UUID id){
        userDao.deleteUserById(id);
    }

}
