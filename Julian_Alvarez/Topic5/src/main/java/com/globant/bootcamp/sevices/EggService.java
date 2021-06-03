package com.globant.bootcamp.sevices;

import com.globant.bootcamp.models.EggCarton;
import com.globant.bootcamp.repositories.EggCartonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EggService {

    @Autowired
    private EggCartonRepository eggCartonRepository;

    public void addEggs(int amount, EggCarton carton){
        for (int i=0; i<amount; i++) {
            eggCartonRepository.save(new EggCarton(carton.getEggType()));
        }
    }

    public List<EggCarton> getCartons(){
        return eggCartonRepository.findAll();
    }

    public void updateEgg(EggCarton carton){
        eggCartonRepository.save(carton);
    }

    public void deleteEgg(int amount, EggCarton carton){
        for (int i=0; i<amount; i++) {
            eggCartonRepository.deleteByType(carton);
        }
    }


}
