import org.apache.log4j.Logger;

public class Farmer{
    private final String name;
    private final String lastName;
    private final int age;

    private static final Logger logger = Logger.getLogger(Farmer.class);

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
        logger.info("Everything went smoothly and this log message is saved in a log file");
    }

}
