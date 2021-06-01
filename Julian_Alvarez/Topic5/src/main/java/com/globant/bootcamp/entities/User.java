package com.globant.bootcamp.entities;

import java.util.UUID;

public class User {

    private final UUID id;
    private final String name;
    private final String userName;

    public User(UUID id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }
}
