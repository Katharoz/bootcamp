package com.globant.bootcamp;

import com.globant.bootcamp.entities.Farm;
import com.globant.bootcamp.entities.Farmer;
import com.globant.bootcamp.entities.User;
import com.globant.bootcamp.entities.factories.BuildingFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        //region Variables
        final int numberOfHens = 40;
        final int eggsPerDay = 2;
        Farm farm = Farm.getInstance();
        Farmer farmer = new Farmer("Billy","Joel",37, farm);
        //endregion

        User user1 = new User(1, "John", "Smith");
        users.add(user1);
        User user2 = new User(2, "Helen", "Smith");
        users.add(user2);
        User user3 = new User(3, "Thomas", "Smith");
        users.add(user3);

        farm.addBuilding(BuildingFactory.createHenHouse());

        farmer.addAnimals(numberOfHens, "Hens");

        farm.generateProducts(eggsPerDay);

        farmer.collectEggs();

        farmer.printEggs(farmer.reds, "Reds");
        farmer.printEggs(farmer.whites, "Whites");

    }

}
