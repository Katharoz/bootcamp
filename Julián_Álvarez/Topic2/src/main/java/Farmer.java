import java.util.logging.Logger;

public class Farmer{
    private final String name;
    private final String lastName;
    private final int age;

    private static Logger logger = Logger.getLogger("Farmer");

    Farmer(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Prints the string of eggs in the correct format.
    public void collectEggs(String eggs, String typeOfEggs) {
        while (eggs.length()%30 != 0)   eggs += "G";                //Creates as many "empty spaces" in the carton of eggs as necessary.

        for (int i=0; i<eggs.length(); i++){
            if (i % 30 == 0)    System.out.println("=====" +typeOfEggs+ "=====");

            System.out.print("(" +eggs.charAt(i)+ ")");

            if ((i+1)%5==0) System.out.println();
        }
        logger.info("Everything went smoothly");
    }

}
