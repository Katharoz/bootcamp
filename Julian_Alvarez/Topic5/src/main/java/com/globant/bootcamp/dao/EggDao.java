package com.globant.bootcamp.dao;

import com.globant.bootcamp.entities.EggType;

import java.util.List;

public interface EggDao {

    void insertEgg(String type);

    List<EggType>  getEggs();

    void updateEgg(int index, String type);

    void buyEggs(String type);

}
