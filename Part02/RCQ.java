package Part02;

import java.util.*;
import Part02.*;

public class RCQ {
    public RCQ(String[] args){
        //Asking user to input queue number
        Scanner n = new Scanner(System.in);
        System.out.print("Input Queue number :");
        int queueNO = n.nextInt();
        try {
            if (queueNO == 1) {
                Scanner k = new Scanner(System.in);
                //Asking user to input customer position in the queue
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                //Removing indexno's index details, and required fuel from both arrays
                passenger.Passenger01[indexno] = "Empty";
                passenger.RLiters1[indexno] = 0;

                //If there's no-one the customer position...
                if (Stock.Queue01[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                    //Is there's someone in the position...
                } else {
                    System.out.println("\nCustomer " + Stock.Queue01[(indexno)] + " Removed Successfully");
                    //Customer will be removed and Queue will show "Empty" in that place
                    Stock.Queue01[(indexno)] = "Empty";
//                    continue;
                }

            } else if (queueNO == 2) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger02[indexno] = "Empty";
                passenger.RLiters2[indexno] = 0;

                if (Stock.Queue02[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue02[(indexno)] + " Removed Successfully");
                    Stock.Queue02[(indexno)] = "Empty";
//                    continue;
                }

            } else if (queueNO == 3) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger03[indexno] = "Empty";
                passenger.RLiters3[indexno] = 0;

                if (Stock.Queue03[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue03[(indexno)] + " Removed Successfully");
                    Stock.Queue03[(indexno)] = "Empty";
//                    continue;
                }

            } else if (queueNO == 4) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger04[indexno] = "Empty";
                passenger.RLiters4[indexno] = 0;

                if (Stock.Queue04[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue04[(indexno)] + " Removed Successfully");
                    Stock.Queue04[(indexno)] = "Empty";
//                    continue;
                }

            } else if (queueNO == 5) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger05[indexno] = "Empty";
                passenger.RLiters5[indexno] = 0;

                if (Stock.Queue05[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue05[(indexno)] + " Removed Successfully");
                    Stock.Queue05[(indexno)] = "Empty";
//                    continue;
                }

            } else {
                    System.out.println("Queue does not exists");
            }
        //Exception handler
        } catch (Exception e) {
            System.out.println("An Error Occurred");
        }
//        break;

    }
}
