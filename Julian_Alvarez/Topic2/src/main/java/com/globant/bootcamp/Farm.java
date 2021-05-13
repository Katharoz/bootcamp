package com.globant.bootcamp;

import com.globant.bootcamp.abstracts.Building;
import java.util.ArrayList;
import java.util.List;

public class Farm {

    //region Singleton
    private static Farm instance;
    private Farm(){};
    public static Farm getInstance(){
        if (instance == null)   instance = new Farm();
        return instance;
    }
    //endregion


    private final List<Building> buildings = new ArrayList<>();

    //region Getters
    public List<Building> getBuildings() {
        return buildings;
    }

    public Building getSpecificBuilding(int index){
        if (index > buildings.size())   return null;
        return buildings.get(index);
    }

    public Building getBuildingType(String buildingType){
        for (Building building:buildings) {
            if (building.getClass().toString().toLowerCase().contains(buildingType.toLowerCase()))  return building;
        }
        return null;
    }
    //endregion

    public void addBuilding(Building building) { this.buildings.add(building); }


}
