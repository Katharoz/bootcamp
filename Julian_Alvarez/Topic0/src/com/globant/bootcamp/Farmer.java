package com.globant.bootcamp;

import com.globant.bootcamp.animals.Hen;
import com.globant.bootcamp.buildings.HenHouse;
import com.globant.bootcamp.enums.EggType;
import java.util.ArrayList;
import java.util.List;


public class Farmer {
    private String name;
    private String lastName;
    private int age;
    private Farm farm;

    public Farmer(String name, String lastName, int age, Farm farm){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.farm = farm;
    }

    public void addAnimals(int amount, String typeOfAnimal){
        if (typeOfAnimal.toLowerCase().contains("hen")) {
            HenHouse henHouse = (HenHouse) farm.getBuildingType("henHouse");
            for(int i=0; i<amount; i++){
                //When 'i' is under 70% of the total number of hens,
                //it creates a com.globant.bootcamp.animals.Hen with an eggType = (D)Red
                //Otherwise it creates a com.globant.bootcamp.animals.Hen with an eggType = (O)White
                Hen hen = new Hen(i<((amount*70)/100) ? EggType.D : EggType.O);
                hen.setLivesIn(henHouse);
            }
        }
    }

    public List<EggType> reds = new ArrayList<>();
    public List<EggType> whites = new ArrayList<>();
    public void collectEggs() {
        List<EggType> listOfEggs = HenHouse.listOfEggs;

        for (EggType egg:listOfEggs) {
            if (egg == EggType.D)   reds.add(egg);
            else whites.add(egg);
        }
    }

    public void printEggs(List<EggType> eggs, String typeOfEgg){
        int cont = 0;
        for (EggType egg:eggs) {
            if (cont % 30 == 0) System.out.println("\n=====" +typeOfEgg+ "=====");
            System.out.print("(" +egg.name()+ ")");
            if ((cont+1)%5==0) System.out.println();
            cont++;
        }
        while (cont % 30 != 0){
            System.out.print("(G)");
            if ((cont+1)%5==0) System.out.println();
            cont++;
        }
    }

}
