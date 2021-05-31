package com.globant.bootcamp.entities.factories;

import com.globant.bootcamp.entities.abstracts.Building;
import com.globant.bootcamp.entities.buildings.HenHouse;

public class BuildingFactory {
    public static HenHouse createHenHouse(){
        return new HenHouse();
    }

    public static Building createBuilding(String building){
        building = building.replaceAll(" ", "");
        if(building.equalsIgnoreCase("HenHouse")) return new HenHouse();
        //if(building.equalsIgnoreCase("Barn")) return new Barn();
        return null;
    }
}
