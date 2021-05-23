package com.globant.bootcamp;

import com.globant.bootcamp.entities.Farm;
import com.globant.bootcamp.entities.Farmer;
import com.globant.bootcamp.entities.buildings.HenHouse;
import com.globant.bootcamp.entities.factories.BuildingFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)

public class FarmerTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {40,2,80}, {20,4,8}, {30,3,90}, {5,10,50}
        });
    }


    private int amount, daily, exp;
    private Farm farm = Farm.getInstance();
    private Farmer farmer = new Farmer("Billy","Joel",37, farm);

    public FarmerTest(int amount, int daily,int exp){
        this.amount = amount;
        this.daily = daily;
        this.exp = exp;
    }


    @Before
    public void setUp(){
        farm.addBuilding(BuildingFactory.createHenHouse());
        farmer.addAnimals(amount, "Hen");
        farm.generateProducts(daily);
    }

    @Test
    public void amountOfEggs(){
        Assert.assertEquals(daily*amount, HenHouse.listOfEggs.size());
        System.out.println("Number of eggs: " +HenHouse.listOfEggs.size());
    }

    @After
    public void clearLists(){
        farm.getBuildings().clear();
        HenHouse.listOfEggs.clear();
    }

}