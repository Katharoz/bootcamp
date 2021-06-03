package com.globant.bootcamp.repositories;

import com.globant.bootcamp.models.EggCarton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EggCartonRepository extends JpaRepository<EggCarton, Long> {
    default void deleteByType(EggCarton carton){
        for (EggCarton egg:findAll()) {
            if (egg.getEggType().equals(carton.getEggType())){
                deleteById(egg.getId());
                break;
            }
        }
    }
}
