package com.globant.bootcamp.factories;

import com.globant.bootcamp.buildings.HenHouse;
import com.globant.bootcamp.abstracts.Building;

public class BuildingFactory {
    public static Building createBuilding(String building){
        if(building.equalsIgnoreCase("HenHouse")) return new HenHouse();
        //if(building.equalsIgnoreCase("Barn")) return new Barn();
        return null;
    }
}
