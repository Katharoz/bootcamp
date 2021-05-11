import com.globant.bootcamp.animals.Hen;
import com.globant.bootcamp.buildings.HenHouse;

import java.util.Arrays;

public class Farm {
    HenHouse henHouse;

    //region Constructor/Getters/Setters
    public Farm() {}

    public HenHouse getHenHouse() {
        return henHouse;
    }

    public void setHenHouse(HenHouse henHouse) {
        this.henHouse = henHouse;
    }
    //endregion

    public void listOfHens(Hen[] hens){

        this.henHouse.setHens(Arrays.asList(hens));
    }

}
