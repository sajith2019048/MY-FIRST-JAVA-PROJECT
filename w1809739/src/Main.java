import java.sql.Driver;
import java.util.*;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Formula1ChampionshipManager ss = new Formula1ChampionshipManager();
        //ChampionshipManager R = new ChampionshipManager();


        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("*******************************************************************************");
            System.out.println("_____________________Welcome to the Formula1Championship Programme_____________");
            System.out.println("*******************************************************************************");
            System.out.println("===============================================================================");
            System.out.println("01-Enter a ‘N’ to add a driver details ");
            System.out.println("02-Enter a ‘D’ to delete a driver details ");
            System.out.println("03-Enter a 'C' to change driver team ");
            System.out.println("04-Enter a 'V' to display drivers various statistics ");
            System.out.println("05-Enter a 'H' to display the driver details");
            System.out.println("06-Enter a 'E' to display the Formula 1 Driver Table ");
            System.out.println("07-Enter a 'F' to add race completed details ");
            System.out.println("08-Enter a 'S' to saving a file ");
            System.out.println("09-Enter a 'T' to go to next time ");
            System.out.println("09-Enter a 'Q' to exit the programme  ");
            System.out.println("================================================================================");

            System.out.print("Enter you choice - ");
            String choice = scan.nextLine();


            if (choice.equals("N") || choice.equals("n")) {
                //add driver information.
                ss.drivers();
            } else if (choice.equals("D") || choice.equals("d")) {
                //delete method.
                ss.delete();
            } else if (choice.equals("C") || choice.equals("c")) {
                //change driver team.
                ss.Change_team();
            } else if (choice.equals("V") || choice.equals("v")) {
                //show drivers various statistics.
                ss.d_statistics();
            } else if (choice.equals("H") || choice.equals("h")) {
                //show driver information.
                ss.d_details();
            } else if (choice.equals("E") || choice.equals("e")) {
               // show Formula 1 Driver Table.
                String fmt2=ss.formula_d();
                System.out.println(fmt2);
                ss.saving_formula();
            } else if (choice.equals("F") || choice.equals("f")) {
                //show race completed details.
                String fmt4=ss.race_completed();
                System.out.println(fmt4);
            } else if (choice.equals("S") || choice.equals("s")) {
                //saving file.
                ss.saving_file();
            } else if (choice.equals("T") || choice.equals("t")) {
                //go to next time.
                ss.next_time();
            } else if (choice.equals("Q") || choice.equals("q")) {
                //exit the programme.
                break;
            }else{
                System.out.println("Invalid input, Try again");
            }
        }
    }
}