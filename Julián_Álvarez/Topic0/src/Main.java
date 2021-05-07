public class Main {
    public static void main(String[] args) {

        //region Variables
        final int numberOfHens = 40;
        final int eggsPerDay = 2;
        Farm farm = new Farm();
        Farmer farmer = new Farmer("Billy","Joel",37);
        Hen[] hens = new Hen[numberOfHens];
        //endregion

        //Create a new Hen House in our Farm.
        farm.setHenHouse(new HenHouse());

        for(int i=0; i<numberOfHens; i++){
            //When 'i' is under 70% of the total number of hens,
            //it creates a Hen with an eggType = (D)Red
            //Otherwise it creates a Hen with an eggType = (O)White
            Hen hen = new Hen(i<((numberOfHens*70)/100) ? EggType.D : EggType.O, eggsPerDay);
            hens[i] = hen;
        }
        farm.listOfHens(hens);

        //Generate the daily amount of eggs of each hen.
        farm.henHouse.eggs();

        farmer.collectEggs(Hen.reds, "Reds");
        farmer.collectEggs(Hen.whites, "Whites");

    }
}
