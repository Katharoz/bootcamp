public class Farmer extends Person implements EggCollection{

    Farmer(String name, String lastName, int age){
        super.name = name;
        super.lastName = lastName;
        super.age = age;
    }

    //Prints the string of eggs in the correct format.
    @Override
    public void collectEggs(String eggs, String typeOfEggs) {
        while (eggs.length()%30 != 0)   eggs += "G";                //Creates as many "empty spaces" in the carton of eggs as necessary.

        for (int i=0; i<eggs.length(); i++){
            if (i % 30 == 0)    System.out.println("=====" +typeOfEggs+ "=====");

            System.out.print("(" +eggs.charAt(i)+ ")");

            if ((i+1)%5==0) System.out.println();
        }
    }

}
