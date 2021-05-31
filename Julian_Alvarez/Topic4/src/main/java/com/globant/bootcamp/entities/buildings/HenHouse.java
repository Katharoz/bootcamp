package com.globant.bootcamp.entities.buildings;

import com.globant.bootcamp.entities.abstracts.Animal;
import com.globant.bootcamp.entities.abstracts.Building;
import com.globant.bootcamp.entities.animals.Hen;
import com.globant.bootcamp.entities.enums.EggType;
import java.util.ArrayList;
import java.util.List;

public class HenHouse extends Building {

    private final List<Hen> hens = new ArrayList<>();

    public static final List<EggType> listOfEggs = new ArrayList<>();

    public List<Hen> getHens() {
        return hens;
    }

    @Override
    public void addAnimal(Animal hen) {
        this.hens.add((Hen) hen);
    }

    @Override
    public void generateProducts(int dailyAmount){
        this.hens.forEach(hen -> {
            int count = 0;
            do{
                listOfEggs.add(hen.hasEgg());
                count++;
            }while (count<dailyAmount);
        });
    }

}