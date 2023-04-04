import java.util.Scanner;

//Removed old 102 add customer method and created fue queue class because this is the only place this class can be used

public class FuelQueue {
    public FuelQueue(String[] args) {
        //using while loop for adding more customers at one 102 input
        while (true) {

            //Checking which Queue have minimum length with nested if loops
            if ((variable.a <= variable.b) && (variable.a <= variable.c) && (variable.a <= variable.d) && (variable.a <= variable.e)) {
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; variable.a < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    //Assigning a(from class variable) index element from Queue01 as customer name
                    Partone.Queue01[variable.a] = cname;
                    passenger.passenger1();
                    //Incrementing variable a for further add customer
                    variable.a++;
                    //Reducing 10 liters of fuel from total fuel
                    Partone.totalfuel = Partone.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    //If queue is full (variable a = 6)
                    if (variable.a == 6) {
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

            } else if ((variable.b <= variable.a) && (variable.b <= variable.c) && (variable.b <= variable.d) && (variable.b <= variable.e)) {
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; variable.b < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Partone.Queue02[variable.b] = cname;
                    passenger.passenger2();
                    variable.b++;
                    //Reducing 10 liters of fuel from total fuel
                    Partone.totalfuel = Partone.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (variable.b == 6) {
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

            } else if ((variable.c <= variable.a) && (variable.c <= variable.b) && (variable.c <= variable.d) && (variable.c <= variable.e)) {
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; variable.c < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Partone.Queue03[variable.c] = cname;
                    passenger.passenger3();
                    variable.c++;
                    //Reducing 10 liters of fuel from total fuel
                    Partone.totalfuel = Partone.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (variable.c == 6) {
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

            } else if ((variable.d <= variable.a) && (variable.d <= variable.b) && (variable.d <= variable.c) && (variable.d <= variable.e)) {
//                Stock.Queue04[i] = Details;
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; variable.d < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Partone.Queue04[variable.d] = cname;
                    passenger.passenger4();
                    variable.d++;
                    //Reducing 10 liters of fuel from total fuel
                    Partone.totalfuel = Partone.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (variable.d == 6) {
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

            } else if ((variable.e <= variable.a) && (variable.e <= variable.b) && (variable.e <= variable.c) && (variable.e <= variable.d)) {
//                Stock.Queue05[i] = Details;
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; variable.e < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Partone.Queue05[variable.e] = cname;
                    passenger.passenger5();
                    variable.e++;
                    //Reducing 10 liters of fuel from total fuel
                    Partone.totalfuel = Partone.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
                    if (variable.e == 6) {
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



