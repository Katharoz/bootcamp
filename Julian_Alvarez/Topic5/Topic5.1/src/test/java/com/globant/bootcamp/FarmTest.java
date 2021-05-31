package com.globant.bootcamp;

import com.globant.bootcamp.entities.Farm;
import com.globant.bootcamp.entities.factories.BuildingFactory;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

@RunWith(value = Parameterized.class)

public class FarmTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {"HenHouse"}, {"HENHOUSE"}, {"Hen House"}, {"Hen H o U se"}
        });
    }


    private static final Farm farm = Farm.getInstance();
    private final String str;
    public FarmTest(String str){
        this.str = str;
    }

    @Before
    public void setUp(){
        farm.addBuilding(BuildingFactory.createBuilding(this.str));
    }

    @Test
    public void buildingNotNull(){
        Assert.assertNotNull(farm.getBuildings().get(0));
    }

    @After
    public void clearList(){
        farm.getBuildings().clear();
    }

    /*
    @Test
    public void checkBuildingType(){
        HenHouse henHouse = BuildingFactory.createHenHouse();
        Assertions.assertEquals(henHouse, farm.getBuildings().get(0));
    }
    */

}