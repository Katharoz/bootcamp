public class BuildingFactory {
    public IBuildings createBuilding(String building){
        if(building.equalsIgnoreCase("HenHouse")) return new HenHouse();
        //if(building.equalsIgnoreCase("Barn")) return new Barn();
        return null;
    }
}
