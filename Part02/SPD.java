package Part02;

import java.util.*;
import java.io.*;
import Part02.*;

public class SPD {
    public SPD(String[] args){
        try{
            //Declaring file name to create with FileWriter method
            FileWriter inputData = new FileWriter("SPD.txt");
            inputData.write("-----------------------------------------------------------");
            //Inputting data to write in a text file
            inputData.write("\nQueue01 have :\n");
            //Using for loop to access queue data and write in text file
            for(int y = 0; y < 6; y++){
                //If queue element is "EMPTY" it will print " "
                if ((Stock.Queue01[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Stock.Queue01[y] + "\n");
                }

            }
            //Using for loop to access passenger data and write in text file
            inputData.write("\nPassengers of Queue01 have :\n");
            for(int y = 0; y < 6; y++){
                //If queue element is "EMPTY" it will print " "
                if ((passenger.Passenger01[y]).equals("Empty")) {
                    inputData.write("");
                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + passenger.Passenger01[y] + "\n");
                }
            }


            inputData.write("-----------------------------------------------------------");
            inputData.write("\nQueue02 have :\n");
            for(int y = 0; y < 6; y++){
                if ((Stock.Queue02[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Stock.Queue02[y] + "\n");
                }
            }
            inputData.write("\nPassengers of Queue02 have :\n");
            for(int y = 0; y < 6; y++){
                if ((passenger.Passenger02[y]).equals("Empty")) {
                    inputData.write("");
                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + passenger.Passenger02[y] + "\n");
                }
            }


            inputData.write("-----------------------------------------------------------");
            inputData.write("\nQueue03 have :\n");
            for(int y = 0; y < 6; y++){
                if ((Stock.Queue03[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Stock.Queue03[y] + "\n");
                }
            }
            inputData.write("\nPassengers of Queue03 have :\n");
            for(int y = 0; y < 6; y++){
                if ((passenger.Passenger03[y]).equals("Empty")) {
                    inputData.write("");
                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + passenger.Passenger03[y] + "\n");
                }
            }


            inputData.write("-----------------------------------------------------------");
            inputData.write("\nQueue04 have :\n");
            for(int y = 0; y < 6; y++){
                if ((Stock.Queue04[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Stock.Queue04[y] + "\n");
                }
            }
            inputData.write("\nPassengers of Queue04 have :\n");
            for(int y = 0; y < 6; y++){
                if ((passenger.Passenger04[y]).equals("Empty")) {
                    inputData.write("");
                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + passenger.Passenger04[y] + "\n");
                }
            }


            inputData.write("-----------------------------------------------------------");
            inputData.write("\nQueue05 have :\n");
            for(int y = 0; y < 6; y++){
                if ((Stock.Queue05[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Stock.Queue05[y] + "\n");
                }
            }
            inputData.write("\nPassengers of Queue05 have :\n");
            for(int y = 0; y < 6; y++){
                if ((passenger.Passenger05[y]).equals("Empty")) {
                    inputData.write("");
                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + passenger.Passenger05[y] + "\n");
                }
            }

            inputData.close();
            System.out.println("Data Stored Successfully ^_^");
        }catch(IOException e){
            System.out.println("An error occurred");
        }

    }
}
