package com.globant.bootcamp.buildings;

import com.globant.bootcamp.animals.Hen;
import com.globant.bootcamp.interfaces.IAnimals;
import com.globant.bootcamp.interfaces.IBuildings;

import java.util.ArrayList;
import java.util.List;

public class HenHouse implements IBuildings {
    private final List<Hen> hens = new ArrayList<>();

    @Override
    public void addAnimal(IAnimals animals) {
        this.hens.add((Hen)animals);
    }

    @Override
    public void generateAnimalProduct(int amountPerDay){
        this.hens.forEach(hen -> {
           hen.generateProduct(amountPerDay);
        });
    }

}
