package com.globant.bootcamp.dao;

import com.globant.bootcamp.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserDaoImplement implements UserDao{

    private static final List<User> usersDB = new ArrayList<>();
    private final List<User> usersByName = new ArrayList<>();

    @Override
    public List<User> getUsers() {
        return usersDB;
    }

    @Override
    public void insertUser(UUID id, User user) {
        usersDB.add(new User(id, user.getName(), user.getUserName()));
    }

    @Override
    public Optional<User> findUserById(UUID id) {
        return usersDB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<User> findUsersByName(String name) {
        usersByName.clear();
        usersDB.forEach(user -> {
            if (user.getName().equals(name))    usersByName.add(user);
        });
        return usersByName;
    }

    @Override
    public Optional<User> findUserByUserName(String userName) {
        return usersDB.stream()
                .filter(user -> user.getUserName().equals(userName))
                .findFirst();
    }

    @Override
    public void updateUserById(UUID id, User user) {
        Optional<User> userIfFound = findUserById(id);
        if (userIfFound.isEmpty())  return;
        int index = usersDB.indexOf(userIfFound.get());
        usersDB.set(index, new User(id, user.getName(), user.getUserName()));
    }

    @Override
    public void deleteUserById(UUID id) {
        Optional<User> userIfFound = findUserById(id);
        if (userIfFound.isEmpty())  return;
        usersDB.remove(userIfFound.get());
    }
}
