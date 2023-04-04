package Part03;

import java.util.*;
import Part03.*;

public class passenger {
    //Declaring 5 arrays for passenger queue (each array for each fuel queue)
    public static String[] Passenger01 = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
    public static String[] Passenger02 = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
    public static String[] Passenger03 = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
    public static String[] Passenger04 = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};
    public static String[] Passenger05 = {"Empty", "Empty", "Empty", "Empty", "Empty", "Empty"};

    //Declaring 5 require fuel arrays (each for each passenger queue)
    public static int[] RLiters1 = {0, 0, 0, 0, 0, 0};
    public static int[] RLiters2 = {0, 0, 0, 0, 0, 0};
    public static int[] RLiters3 = {0, 0, 0, 0, 0, 0};
    public static int[] RLiters4 = {0, 0, 0, 0, 0, 0};
    public static int[] RLiters5 = {0, 0, 0, 0, 0, 0};

    //Methods for asking passenger details and adding those to passenger queues and required fuel queues
    static void passenger1(){
        //Declaring local variables
        String FName;
        String SName;
        int VNO;

        //User inputs
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.println("\nInput Passenger Details :-");
        //Asking passenger inputs
        System.out.print("\nEnter First Name :");
        FName = a.nextLine();
        System.out.print("\nEnter Second Name :");
        SName = b.nextLine();
        System.out.print("\nEnter Vehicle no. :");
        VNO = c.nextInt();
        System.out.print("\nEnter no of Liters you need :");
        //Initializing variable Rliters1 to required fuel liters
        int Rliters1 = d.nextInt();

        //Declaring a variable named Details and adding values as String
        String Details = ("\nCustomer Name :" + FName + " " + SName
                + "\nCustomer's Vehicle no :" + VNO
                + "\nno of Liters Customer need :" + Rliters1);

        System.out.println();
        System.out.println(Details);
        //Using for loop to add passenger details to passenger array and required fuel to required fuel array
        for(;variable.a < 6;){
            Passenger01[variable.a] = Details;
            RLiters1[variable.a] = Rliters1;
            break;
        }

    }

    static void passenger2(){
        String FName;
        String SName;
        int VNO;
        //User inputs
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.println("\nInput Passenger Details :-");
        //Asking passenger inputs
        System.out.print("\nEnter First Name :");
        FName = a.nextLine();
        System.out.print("\nEnter Second Name :");
        SName = b.nextLine();
        System.out.print("\nEnter Vehicle no. :");
        VNO = c.nextInt();
        System.out.print("\nEnter no of Liters you need :");
        int Rliters2 = d.nextInt();

        String Details = ("\nCustomer Name :" + FName + " " + SName
                + "\nCustomer's Vehicle no :" + VNO
                + "\nno of Liters Customer need :" + Rliters2);

        System.out.println();
        System.out.println(Details);
        for(;variable.b < 6;){
            Passenger02[variable.b] = Details;
            RLiters2[variable.b] = Rliters2;
            break;
        }

    }


    static void passenger3(){
        String FName;
        String SName;
        int VNO;
        //User inputs
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.println("\nInput Passenger Details :-");
        //Asking passenger inputs
        System.out.print("\nEnter First Name :");
        FName = a.nextLine();
        System.out.print("\nEnter Second Name :");
        SName = b.nextLine();
        System.out.print("\nEnter Vehicle no. :");
        VNO = c.nextInt();
        System.out.print("\nEnter no of Liters you need :");
        int Rliters3 = d.nextInt();

        String Details = ("\nCustomer Name :" + FName + " " + SName
                + "\nCustomer's Vehicle no :" + VNO
                + "\nno of Liters Customer need :" + Rliters3);

        System.out.println();
        System.out.println(Details);
        for(;variable.c < 6;){
            Passenger03[variable.c] = Details;
            RLiters3[variable.c] = Rliters3;
            break;
        }

    }

    static void passenger4(){
        String FName;
        String SName;
        int VNO;
        //User inputs
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.println("\nInput Passenger Details :-");
        //Asking passenger inputs
        System.out.print("\nEnter First Name :");
        FName = a.nextLine();
        System.out.print("\nEnter Second Name :");
        SName = b.nextLine();
        System.out.print("\nEnter Vehicle no. :");
        VNO = c.nextInt();
        System.out.print("\nEnter no of Liters you need :");
        int Rliters4 = d.nextInt();

        String Details = ("\nCustomer Name :" + FName + " " + SName
                + "\nCustomer's Vehicle no :" + VNO
                + "\nno of Liters Customer need :" + Rliters4);

        System.out.println();
        System.out.println(Details);
        for(;variable.d < 6;){
            Passenger04[variable.d] = Details;
            RLiters4[variable.d] = Rliters4;
            break;
        }

    }

    static void passenger5(){
        String FName;
        String SName;
        int VNO;
        //User inputs
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.println("\nInput Passenger Details :-");
        //Asking passenger inputs
        System.out.print("\nEnter First Name :");
        FName = a.nextLine();
        System.out.print("\nEnter Second Name :");
        SName = b.nextLine();
        System.out.print("\nEnter Vehicle no. :");
        VNO = c.nextInt();
        System.out.print("\nEnter no of Liters you need :");
        int Rliters5 = d.nextInt();

        String Details = ("\nCustomer Name :" + FName + " " + SName
                + "\nCustomer's Vehicle no :" + VNO
                + "\nno of Liters Customer need :" + Rliters5);

        System.out.println();
        System.out.println(Details);
        for(;variable.e < 6;){
            Passenger05[variable.e] = Details;
            RLiters5[variable.e] = Rliters5;
            break;
        }

    }
}