package Part02;
import java.util.*;

public class VCS {
    public VCS(String[] args){
        //Sorting the array elements
        //For Queue01
        for(int i = 0; i < 6; i++){
            //Using for loop to replace "EMPTY" with "z@z" for sorting
            if(Stock.Queue01[i] == "EMPTY") {
                Stock.Queue01[i] = "z@z";
            }
        }
        //Sorting array
        Arrays.sort(Stock.Queue01);
        //Using for loop to replace "z@z" with "EMPTY"
        for(int i = 0; i < 6; i++){
            if(Stock.Queue01[i] == "z@z") {
                Stock.Queue01[i] = "EMPTY";
            }
        }
        //Sorting the array elements
        //For Queue02
        for(int i = 0; i < 6; i++){
            //Using for loop to replace "EMPTY" with "z@z" for sorting
            if(Stock.Queue02[i] == "EMPTY") {
                Stock.Queue02[i] = "z@z";
            }
        }
        //Sorting array
        Arrays.sort(Stock.Queue02);
        //Using for loop to replace "z@z" with "EMPTY"
        for(int i = 0; i < 6; i++){
            if(Stock.Queue02[i] == "z@z") {
                Stock.Queue02[i] = "EMPTY";
            }
        }
        //Sorting the array elements
        //For Queue03
        for(int i = 0; i < 6; i++){
            //Using for loop to replace "EMPTY" with "z@z" for sorting
            if(Stock.Queue03[i] == "EMPTY") {
                Stock.Queue03[i] = "z@z";
            }
        }
        //Sorting array
        Arrays.sort(Stock.Queue03);
        //Using for loop to replace "z@z" with "EMPTY"
        for(int i = 0; i < 6; i++){
            if(Stock.Queue03[i] == "z@z") {
                Stock.Queue03[i] = "EMPTY";
            }
        }
        //Sorting the array elements
        //For Queue04
        for(int i = 0; i < 6; i++){
            //Using for loop to replace "EMPTY" with "z@z" for sorting
            if(Stock.Queue04[i] == "EMPTY") {
                Stock.Queue04[i] = "z@z";
            }
        }
        //Sorting array
        Arrays.sort(Stock.Queue04);
        //Using for loop to replace "z@z" with "EMPTY"
        for(int i = 0; i < 6; i++){
            if(Stock.Queue04[i] == "z@z") {
                Stock.Queue04[i] = "EMPTY";
            }
        }
        //Sorting the array elements
        //For Queue05
        for(int i = 0; i < 6; i++){
            //Using for loop to replace "EMPTY" with "z@z" for sorting
            if(Stock.Queue05[i] == "EMPTY") {
                Stock.Queue05[i] = "z@z";
            }
        }
        //Sorting array
        Arrays.sort(Stock.Queue05);
        //Using for loop to replace "z@z" with "EMPTY"
        for(int i = 0; i < 6; i++){
            if(Stock.Queue05[i] == "z@z") {
                Stock.Queue05[i] = "EMPTY";
            }
        }
        //Printing All Queues
        System.out.print("Queue 01 : ");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (Stock.Queue01[i] == "EMPTY") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue01[i] + " ");
            }
        }

        //Printing All Passenger Queues
        System.out.println("\n\nPassengers in Queue01 :-");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (passenger.Passenger01[i] == "Empty") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.println("\n" + passenger.Passenger01[i]);
            }
        }

        System.out.println();
        System.out.print("Queue 02 : ");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (Stock.Queue02[i] == "EMPTY") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue02[i] + " ");
            }
        }

        System.out.println("\n\nPassengers in Queue02 :-");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (passenger.Passenger02[i] == "Empty") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.println("\n" + passenger.Passenger02[i]);
            }
        }

        System.out.println();
        System.out.print("Queue 03 : ");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (Stock.Queue03[i] == "EMPTY") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue03[i] + " ");
            }
        }

        System.out.println("\n\nPassengers in Queue03 :-");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (passenger.Passenger03[i] == "Empty") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.println("\n" + passenger.Passenger03[i]);
            }
        }

        System.out.println();
        System.out.print("Queue 04 : ");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (Stock.Queue04[i] == "EMPTY") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue04[i] + " ");
            }
        }

        System.out.println("\n\nPassengers in Queue04 :-");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (passenger.Passenger04[i] == "Empty") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.println("\n" + passenger.Passenger04[i]);
            }
        }

        System.out.println();
        System.out.print("Queue 05 : ");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (Stock.Queue05[i] == "EMPTY") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue05[i] + " ");
            }
        }

        System.out.println("\n\nPassengers in Queue05 :-");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if (passenger.Passenger05[i] == "Empty") {
                System.out.print(" ");
                //otherwise it'll print queue elements
            } else {
                System.out.println("\n" + passenger.Passenger05[i]);
            }
        }
    }
}
