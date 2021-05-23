package com.globant.bootcamp;

import com.globant.bootcamp.entities.Farm;
import com.globant.bootcamp.entities.Farmer;
import com.globant.bootcamp.entities.factories.BuildingFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        //region Variables
        final int numberOfHens = 40;
        final int eggsPerDay = 2;
        Farm farm = Farm.getInstance();
        Farmer farmer = new Farmer("Billy","Joel",37, farm);
        //endregion

        farm.addBuilding(BuildingFactory.createHenHouse());

        farmer.addAnimals(numberOfHens, "Hens");

        farm.generateProducts(eggsPerDay);

        farmer.collectEggs();

        farmer.printEggs(farmer.reds, "Reds");
        farmer.printEggs(farmer.whites, "Whites");

    }

}
