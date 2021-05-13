package com.globant.bootcamp;

import com.globant.bootcamp.buildings.HenHouse;

public class Main {
    public static void main(String[] args) {

        //region Variables
        final int numberOfHens = 40;
        final int eggsPerDay = 2;
        Farm farm = new Farm();
        Farmer farmer = new Farmer("Billy","Joel",37, farm);
        //endregion

        farm.addBuilding(new HenHouse());

        farmer.addAnimals(numberOfHens, "Hens");

        //region TODO fix this hardcoding.
        HenHouse henHouse = (HenHouse) farm.getSpecificBuilding(0);
        henHouse.generateProducts(eggsPerDay);
        //endregion

        farmer.collectEggs();

        farmer.printEggs(farmer.reds, "Reds");
        farmer.printEggs(farmer.whites, "Whites");

    }

}
