package com.globant.bootcamp.sevices;

import com.globant.bootcamp.dao.EggDao;
import com.globant.bootcamp.entities.EggType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EggService {

    @Autowired
    private EggDao eggDao;

    public void addEggs(int amount, String type){
        for (int i=0; i<amount; i++) {
            eggDao.insertEgg(type);
        }
    }

    public List<EggType> getEggs(){
        return eggDao.getEggs();
    }

    public void updateEgg(int index, String type){
        eggDao.updateEgg(index, type);
    }

    public void deleteEgg(int amount, String type){
        for (int i=0; i<amount; i++) {
            eggDao.buyEggs(type);
        }
    }


}
