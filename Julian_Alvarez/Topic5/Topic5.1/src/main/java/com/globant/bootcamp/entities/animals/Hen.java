package com.globant.bootcamp.entities.animals;

import com.globant.bootcamp.entities.abstracts.Animal;
import com.globant.bootcamp.entities.abstracts.Building;
import com.globant.bootcamp.entities.buildings.HenHouse;
import com.globant.bootcamp.entities.enums.EggType;

public class Hen extends Animal {
    private final EggType eggType;
    private Building livesIn;

    public Hen(EggType eggType) {
        this.eggType = eggType;
    }

    public EggType getEggType(){ return this.eggType; }

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
