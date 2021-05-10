package com.globant.bootcamp.animals;

import com.globant.bootcamp.enums.EggType;

public class Hen {
    EggType eggType;
    int eggsPerDay;
    public Hen(EggType eggType, int eggsPerDay) {
        this.eggType = eggType;
        this.eggsPerDay = eggsPerDay;
    }

    public static String reds = "";
    public static String whites = "";

    //'Spawns' the daily amount of eggs of the hen. Simply adding a letter to it's corresponding string.
    public void hasEgg(){
        int count=0;
        do {
            if (eggType == EggType.D) {
                reds += "D";
            } else {
                whites += "O";
            }
            count++;
        }while(count<eggsPerDay);
    }

}
