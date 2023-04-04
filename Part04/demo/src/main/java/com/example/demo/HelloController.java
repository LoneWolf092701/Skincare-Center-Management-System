package com.example.demo;

import com.example.demo.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        ReadFile();
    }

    @FXML
    protected void onHelloButtonClick1(){}

    public static void ReadFile() {
        try {
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