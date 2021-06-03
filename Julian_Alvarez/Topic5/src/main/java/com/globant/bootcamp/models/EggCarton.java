package com.globant.bootcamp.models;

import javax.persistence.*;

@Entity
@Table(name = "carton")
public class EggCarton {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private EggType eggType;

    public EggCarton(){

    }

    public EggCarton(EggType eggType) {
        this.eggType = eggType;
    }

    public EggCarton(Long id, EggType eggType) {
        this.id = id;
        this.eggType = eggType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EggType getEggType() {
        return eggType;
    }

    public void setEggType(EggType eggType) {
        this.eggType = eggType;
    }
}
