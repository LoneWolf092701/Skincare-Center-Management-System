package Part02;

import Part03.*;
import java.util.*;

public class CWClassVersion{
    public static void main(String[] args){

        int count = 1;
        while (count > 0) {
            System.out.println("""
                    
                    100 or VFQ: View all Fuel Queues.
                    101 or VEQ: View all Empty Queues.
                    102 or ACQ: Add customer to a Queue.
                    103 or RCQ: Remove a customer from a Queue.
                    104 or PCQ: Remove a served customer.
                    105 or VCS: View Customers Sorted in alphabetical order.
                    106 or SPD: Store Program Data into file.
                    107 or LPD: Load Program Data from file.
                    108 or STK: View Remaining Fuel Stock.
                    109 or AFS: Add Fuel Stock.
                    999 or EXT: Exit the Program.
                    110 or IFQ: Income of Fuel Queue.""");                               //done
            System.out.println();

            Scanner o = new Scanner(System.in);
            System.out.print("Select an option :");
            String mainoption = o.next();
            mainoption = mainoption.toUpperCase();
            System.out.println();

            if(FuelStock.totalfuel <= 500){
                System.out.println("Warning only 500 liters of fuel left!");
            }

            switch (mainoption) {
                case "999":
                case "EXT":
                    //Quiting the program
                    System.out.println("Program is Quiting!");
                    break;

                case "100":
                case "VFQ":
                    //calling method VFQ to print all Queues
                    new VFQ(Stock.Queue01);
                    break;

                case "101":
                case "VEQ":
                    //calling method VEQ to print empty Queues
                    new VEQ(Stock.Queue01);
                    break;

                case "102":
                case "ACQ":
                    //Asking for user input
                    new FuelQueue(Stock.Queue01);
                    //Passenger class call inside FuelQueue class
                    //Separate Passenger Queues for each Fuel Queues
                    break;

                case "103":
                case "RCQ":
                    //Removing a customer
                    new RCQ(Stock.Queue01);
                    break;

                case "104":
                case "PCQ":
                    //Removing served customer
                    new PCQ(Stock.Queue01);
                    break;

                case "105":
                case "VCS":
                    //sorting customer names in Queue
                    new VCS(Stock.Queue01);
                    break;

                case "106":
                case "SPD":
                    //Saving data on a text file
                    new SPD(Stock.Queue01);
                    break;

                case "107":
                case "LPD":
                    //Loading data from text file
                    new LPD(Stock.Queue01);
                    break;

                case "108":
                case "STK":
                    //calling STK method to print total fuel stock
                    new STK(FuelStock.totalfuel);
                    break;

                case "109":
                case "AFS":
                    //Adding fuel to stock
                    new AFS(Stock.Queue01);
                    break;

                case "110":
                case "IFQ":
                    //Exiting program
                    new IFQ(Stock.Queue01);
                    break;

                default:
                    System.out.println("Invalid Option");

            }

                //Asking user to loop
            Scanner again = new Scanner(System.in);
            System.out.println();
            System.out.print("\nDo you want to use again? (y/n): ");
            String loopagain = again.nextLine().toUpperCase();
            if (loopagain.equals("Y")) {
                count = count + 1;
                continue;
            } else {
                System.out.println("\nThank you for using this program.");
                count = count - 1;
                break;
            }
        }
    }
}