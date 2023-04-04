package Part02;

import java.util.*;

import static Part02.variable.*;

//Removed old 102 add customer method and created fue queue class because this is the only place this class can be used

public class FuelQueue {
    public FuelQueue(String[] args) {
        //using while loop for adding more customers at one 102 input
        while (true) {

            //Checking which Queue have minimum length with nested if loops
            if ((a <= b) && (a <= c) && (a <= d) && (a <= e)) {
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; a < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    //Assigning a(from class variable) index element from Queue01 as customer name
                    Stock.Queue01[a] = cname;
                    Part02.passenger.passenger1();
                    //Incrementing variable a for further add customer
                    a++;
                    //Reducing 10 liters of fuel from total fuel
                    FuelStock.totalfuel = FuelStock.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    //If queue is full (variable a = 6)
                    if (a == 6) {
                        System.out.println("\nQueue is Full");
                        break;
                    }
                    //Asking user wants to add another customer
                    System.out.print("\nDo You Want to Add Another Customer? :");
                    String asks = ask.next().toUpperCase();
                    //If yes loop will continue
                    if (asks.equals("Y")) {
                        continue;
                        //Otherwise, loop will break
                    } else {
                        break;
                    }
                }

            } else if ((b <= a) && (b <= c) && (b <= d) && (b <= e)) {
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; b < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Stock.Queue02[b] = cname;
                    Part02.passenger.passenger2();
                    b++;
                    //Reducing 10 liters of fuel from total fuel
                    FuelStock.totalfuel = FuelStock.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (b == 6) {
                        System.out.println("\nQueue is Full");
                        break;
                    }
                    //Asking user wants to add another customer
                    System.out.print("\nDo You Want to Add Another Customer? :");
                    String asks = ask.next().toUpperCase();
                    //If yes loop will continue
                    if (asks.equals("Y")) {
                        continue;
                        //Otherwise, loop will break
                    } else {
                        break;
                    }
                }

            } else if ((c <= a) && (c <= b) && (c <= d) && (c <= e)) {
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; c < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Stock.Queue03[c] = cname;
                    Part02.passenger.passenger3();
                    c++;
                    //Reducing 10 liters of fuel from total fuel
                    FuelStock.totalfuel = FuelStock.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (c == 6) {
                        System.out.println("\nQueue is Full");
                        break;
                    }
                    //Asking user wants to add another customer
                    System.out.print("\nDo You Want to Add Another Customer? :");
                    String asks = ask.next().toUpperCase();
                    //If yes loop will continue
                    if (asks.equals("Y")) {
                        continue;
                        //Otherwise, loop will break
                    } else {
                        break;
                    }
                }

            } else if ((d <= a) && (d <= b) && (d <= c) && (d <= e)) {
//                Stock.Queue04[i] = Details;
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; d < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Stock.Queue04[d] = cname;
                    Part02.passenger.passenger4();
                    d++;
                    //Reducing 10 liters of fuel from total fuel
                    FuelStock.totalfuel = FuelStock.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (d == 6) {
                        System.out.println("\nQueue is Full");
                        break;
                    }
                    //Asking user wants to add another customer
                    System.out.print("\nDo You Want to Add Another Customer? :");
                    String asks = ask.next().toUpperCase();
                    //If yes loop will continue
                    if (asks.equals("Y")) {
                        continue;
                        //Otherwise, loop will break
                    } else {
                        break;
                    }
                }

            } else if ((e <= a) && (e <= b) && (e <= c) && (e <= d)) {
//                Stock.Queue05[i] = Details;
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; e < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Stock.Queue05[e] = cname;
                    Part02.passenger.passenger5();
                    e++;
                    //Reducing 10 liters of fuel from total fuel
                    FuelStock.totalfuel = FuelStock.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (e == 6) {
                        System.out.println("\nQueue is Full");
                        break;
                    }
                    //Asking user wants to add another customer
                    System.out.print("\nDo You Want to Add Another Customer? :");
                    String asks = ask.next().toUpperCase();
                    //If yes loop will continue
                    if (asks.equals("Y")) {
                        continue;
                        //Otherwise, loop will break
                    } else {
                        break;
                    }
                }
            }
            break;

        }

    }

}



