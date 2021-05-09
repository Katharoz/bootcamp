public class Hen implements IAnimals {
    private final EggType eggType;
    private final int eggsPerDay;
    private HenHouse house;

    public Hen(EggType eggType, int eggsPerDay) {
        this.eggType = eggType;
        this.eggsPerDay = eggsPerDay;
    }

    @Override
    public void setBuilding(IBuildings henHouse){
        this.house = (HenHouse) henHouse;
        henHouse.addAnimal(this);
    }

    public static String redEggs = "";
    public static String whiteEggs = "";

    //'Spawns' the daily amount of eggs of the hen. Simply adding a letter to it's corresponding string.
    @Override
    public void generateProduct(){
        int count=0;
        do {
            if (eggType == EggType.D) {
                redEggs += "D";
            } else {
                whiteEggs += "O";
            }
            count++;
        }while(count<eggsPerDay);
    }

}
