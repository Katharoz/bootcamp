package com.globant.bootcamp.dao;

import com.globant.bootcamp.entities.EggType;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EggDaoImplement implements EggDao{

    private final List<EggType> eggsDB = new ArrayList<>();

    @Override
    public void insertEgg(String type) {
        eggsDB.add(EggType.valueOf(type));
    }

    @Override
    public List<EggType> getEggs() {
        return eggsDB;
    }

    @Override
    public void updateEgg(int index, String type) {
        if (index >= 0 && index < eggsDB.size())    eggsDB.set(index, EggType.valueOf(type));
    }

    @Override
    public void buyEggs(String type) {
        for (EggType egg : eggsDB) {
            if (egg.getType().equals(type)) {
                eggsDB.remove(egg);
                break;
            }
        }
    }
}
