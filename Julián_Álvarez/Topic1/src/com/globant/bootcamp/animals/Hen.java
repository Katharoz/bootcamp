package com.globant.bootcamp.animals;

import com.globant.bootcamp.buildings.HenHouse;
import com.globant.bootcamp.enums.EggType;
import com.globant.bootcamp.interfaces.IAnimals;
import com.globant.bootcamp.interfaces.IBuildings;

public class Hen implements IAnimals {
    private final EggType eggType;
    private HenHouse house;

    public Hen(EggType eggType) {
        this.eggType = eggType;
    }

    @Override
    public void setBuilding(IBuildings henHouse){
        this.house = (HenHouse) henHouse;
        henHouse.addAnimal(this);
    }

    public static String redEggs = "";
    public static String whiteEggs = "";

    //'Spawns' the daily amount of eggs of the hen. Simply adding a letter to it's corresponding string.
    @Override
    public void generateProduct(int amountPerDay){
        int count=0;
        do {
            if (eggType == EggType.D) {
                redEggs += "D";
            } else {
                whiteEggs += "O";
            }
            count++;
        }while(count<amountPerDay);
    }

}
