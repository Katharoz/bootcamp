package com.globant.bootcamp.animals;

import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.abstracts.Building;
import com.globant.bootcamp.buildings.HenHouse;
import com.globant.bootcamp.enums.EggType;

public class Hen extends Animal {
    private final EggType eggType;
    private Building livesIn;

    public Hen(EggType eggType) {
        this.eggType = eggType;
    }

    public Building getLivesIn() {
        return livesIn;
    }

    public void setLivesIn(HenHouse livesIn) {
        this.livesIn = livesIn;
        livesIn.addAnimal(this);
    }

    //'Spawns' the daily amount of eggs of the hen. Simply adding a letter to it's corresponding string.
    public EggType hasEgg(){
        if (eggType == EggType.D) return EggType.D;
        else return EggType.O;
    }

}
