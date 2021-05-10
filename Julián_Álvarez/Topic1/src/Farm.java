import com.globant.bootcamp.builders.BuildingFactory;
import com.globant.bootcamp.buildings.HenHouse;
import com.globant.bootcamp.interfaces.IBuildings;

public class Farm {
    private final BuildingFactory factory = new BuildingFactory();
    private IBuildings henHouse;

    //region Constructor/Getters/Setters
    private static Farm instance;
    private Farm() {}

    public static Farm getInstance(){
        if(instance == null) instance = new Farm();
        return instance;
    }

    public HenHouse getHenHouse() {
        return (HenHouse) this.henHouse;
    }

    public void setHenHouse() {
        this.henHouse = factory.createBuilding("henHouse");
    }
    //endregion

}
