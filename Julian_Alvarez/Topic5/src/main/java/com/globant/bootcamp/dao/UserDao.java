package com.globant.bootcamp.dao;

import com.globant.bootcamp.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    void insertUser(UUID id, User user);

    default void insertUser(User user){
        UUID id = UUID.randomUUID();
        insertUser(id, user);
    }

    List<User> getUsers();

    Optional<User> findUserById(UUID id);

    List<User> findUsersByName(String name);

    Optional<User> findUserByUserName(String userName);

    void updateUserById(UUID id, User user);

    void deleteUserById(UUID id);

}
