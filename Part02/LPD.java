package Part02;

import java.io.*;
import java.util.*;
import Part02.*;

public class LPD {
    public LPD(String[] args){
        //Try block for exception handling
        try{
            //Extract specific file from same directory
            File inputFile = new File("SPD.txt");
            Scanner outputData = new Scanner(inputFile);
            String file_line;
            //While there's text lines in the text file...
            while(outputData.hasNextLine()){
                file_line = outputData.nextLine();
                //Printing those lines
                System.out.println(file_line);
            }
            //Closing the text file
            outputData.close();
            System.out.println("\nProgram data loaded successfully");
        }catch(IOException e){
            System.out.println("An error occurred");
        }

    }
}
