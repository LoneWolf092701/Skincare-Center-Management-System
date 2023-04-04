package Part03;

import Part03.Stock;
import java.util.Arrays;

public class VEQ {
    public VEQ(String[] args) {
        //Checking if There Are No Customers in The Queue
        if ((Stock.Queue01[0] == "EMPTY") && (Stock.Queue01[1] == "EMPTY") && (Stock.Queue01[2] == "EMPTY") && (Stock.Queue01[3] == "EMPTY") && (Stock.Queue01[4] == "EMPTY") && (Stock.Queue01[5] == "EMPTY")) {
            System.out.print("\nQueue 01 is Empty : ");
            //Printing elements ("EMPTY") one by one using for loop
            for(int i = 0; i < 6; i++) {
                System.out.print(Stock.Queue01[i] + " ");
            }
        }
        if ((Stock.Queue02[0] == "EMPTY") && (Stock.Queue02[1] == "EMPTY") && (Stock.Queue02[2] == "EMPTY") && (Stock.Queue02[3] == "EMPTY") && (Stock.Queue02[4] == "EMPTY") && (Stock.Queue02[5] == "EMPTY")) {
            System.out.print("\nQueue 02 is Empty : ");
            for(int i = 0; i < 6; i++) {
                System.out.print(Stock.Queue02[i] + " ");
            }
        }
        if ((Stock.Queue03[0] == "EMPTY") && (Stock.Queue03[1] == "EMPTY") && (Stock.Queue03[2] == "EMPTY") && (Stock.Queue03[3] == "EMPTY") && (Stock.Queue03[4] == "EMPTY") && (Stock.Queue03[5] == "EMPTY")) {
            System.out.print("\nQueue 03 is Empty : ");
            for(int i = 0; i < 6; i++) {
                System.out.print(Stock.Queue03[i] + " ");
            }
        }
        if ((Stock.Queue04[0] == "EMPTY") && (Stock.Queue04[1] == "EMPTY") && (Stock.Queue04[2] == "EMPTY") && (Stock.Queue04[3] == "EMPTY") && (Stock.Queue04[4] == "EMPTY") && (Stock.Queue04[5] == "EMPTY")) {
            System.out.print("\nQueue 03 is Empty : ");
            for(int i = 0; i < 6; i++) {
                System.out.print(Stock.Queue04[i] + " ");
            }
        }
        if ((Stock.Queue05[0] == "EMPTY") && (Stock.Queue05[1] == "EMPTY") && (Stock.Queue05[2] == "EMPTY") && (Stock.Queue05[3] == "EMPTY") && (Stock.Queue05[4] == "EMPTY") && (Stock.Queue05[5] == "EMPTY")) {
            System.out.print("\nQueue 03 is Empty : ");
            for(int i = 0; i < 6; i++) {
                System.out.print(Stock.Queue05[i] + " ");
            }
            System.out.println();
        }

    }
}
