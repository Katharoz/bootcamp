import com.globant.bootcamp.animals.Hen;
import com.globant.bootcamp.enums.EggType;

public class Main {
    public static void main(String[] args) {

        //region Variables
        final int numberOfHens = 40;
        final int eggsPerDay = 2;
        Farm farm = Farm.getInstance();
        Farmer farmer = new Farmer("Billy","Joel",37);
        //endregion

        farm.setHenHouse();

        for(int i=0; i<numberOfHens; i++){
            //When 'i' is under 70% of the total number of hens,
            //it creates a com.globant.bootcamp.animals.Hen with an eggType = (D)Red
            //Otherwise it creates a com.globant.bootcamp.animals.Hen with an eggType = (O)White
            Hen hen = new Hen(i<((numberOfHens*70)/100) ? EggType.D : EggType.O, eggsPerDay);
            hen.setBuilding(farm.getHenHouse());
        }

        farm.getHenHouse().generateAnimalProduct();

        farmer.collectEggs(Hen.redEggs, "Reds");
        farmer.collectEggs(Hen.whiteEggs, "Whites");

    }
}
