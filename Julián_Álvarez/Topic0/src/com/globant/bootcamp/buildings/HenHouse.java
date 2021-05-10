package com.globant.bootcamp.buildings;

import com.globant.bootcamp.animals.Hen;

import java.util.ArrayList;
import java.util.List;

public class HenHouse {
    List<Hen> hens = new ArrayList<>();

    //region Constructor/Getters/Setters

    public List<Hen> getHens() {
        return hens;
    }

    public void setHens(List<Hen> hens) {
        this.hens = hens;
    }
    //endregion

    public void eggs(){
        this.hens.forEach(Hen::hasEgg);
    }

}
