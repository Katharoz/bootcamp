package com.globant.bootcamp.repositories;

import com.globant.bootcamp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> usersByName = new ArrayList<>();
    default List<User> findUsersByName(String name) {
        usersByName.clear();
        findAll().forEach(user -> {
            if (user.getName().equals(name))    usersByName.add(user);
        });
        return usersByName;
    }

    default Optional<User> findUserByUserName(String userName) {
        return findAll().stream()
                .filter(user -> user.getUserName().equals(userName))
                .findFirst();
    }

}
