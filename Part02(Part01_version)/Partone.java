
import java.io.*;
import java.util.*;


public class Partone {
    public static int totalfuel = 6600;

    //Declaring and creating 5 arrays for fuel queue
    public static String[] Queue01 = {"EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY"};
    public static String[] Queue02 = {"EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY"};
    public static String[] Queue03 = {"EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY"};
    public static String[] Queue04 = {"EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY"};
    public static String[] Queue05 = {"EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY"};

    public static void main(String[] args) {

        //Initialising count for while loop
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
                    999 or EXT: Exit the Program.""");
            System.out.println();

            //Using Scanner Method for Main Menu Input
            Scanner o = new Scanner(System.in);
            System.out.print("Select an option :");
            String mainoption = o.next();
            mainoption = mainoption.toUpperCase();
            System.out.println();

            //Throwing a warning message if fuel stock is below or equals to 500 liters
            if (totalfuel <= 500) {
                System.out.println("Warning only 500 liters of fuel left!");
            }

            //Switch with main menu input
            switch (mainoption) {
                case "999":
                case "EXT":
                    System.out.println("Program is Quiting!");
                    count--;
                    break;

                case "100":
                case "VFQ":
                    //Printing All Queue
                    System.out.println("-----------------------------------------------------------");
                    //Printing All Queues
                    System.out.print("Queue 01 : ");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((Queue01[i]).equals("EMPTY")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue01[i] + " ");
                        }
                    }

                    //Printing All Passenger Queues
                    System.out.println("\n\nPassengers in Queue01 :-");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((passenger.Passenger01[i]).equals("Empty")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.println("\n" + passenger.Passenger01[i]);
                        }
                    }

                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Queue 02 : ");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((Queue02[i]).equals("EMPTY")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue02[i] + " ");
                        }
                    }

                    System.out.println("\n\nPassengers in Queue02 :-");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((passenger.Passenger02[i]).equals("Empty")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.println("\n" + passenger.Passenger02[i]);
                        }
                    }

                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Queue 03 : ");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((Queue03[i]).equals("EMPTY")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue03[i] + " ");
                        }
                    }

                    System.out.println("\n\nPassengers in Queue03 :-");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((passenger.Passenger03[i]).equals("Empty")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.println("\n" + passenger.Passenger03[i]);
                        }
                    }

                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Queue 04 : ");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((Queue04[i]).equals("EMPTY")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue04[i] + " ");
                        }
                    }

                    System.out.println("\n\nPassengers in Queue04 :-");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((passenger.Passenger04[i]).equals("Empty")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.println("\n" + passenger.Passenger04[i]);
                        }
                    }

                    System.out.println("-----------------------------------------------------------");
                    System.out.print("Queue 05 : ");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((Queue05[i]).equals("EMPTY")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue05[i] + " ");
                        }
                    }

                    System.out.println("\n\nPassengers in Queue05 :-");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if ((passenger.Passenger05[i]).equals("Empty")) {
                            System.out.print("");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.println("\n" + passenger.Passenger05[i]);
                        }
                    }

                    System.out.println(" ");
                    break;

                case "101":
                case "VEQ":
                    //Checking if There are any Customers in The Queue
                    if (((Queue01[0]).equals("EMPTY")) && ((Queue01[1]).equals("EMPTY")) && ((Queue01[2]).equals("EMPTY")) && ((Queue01[3]).equals("EMPTY")) && (Queue01[4] == "EMPTY") && ((Queue01[5]).equals("EMPTY"))) {
                        System.out.print("\nQueue 01 is Empty : ");
                        //Printing elements ("EMPTY") one by one using for loop
                        for(int i = 0; i < 6; i++) {
                            System.out.print(Queue01[i] + " ");
                        }
                    }
                    if (((Queue02[0]).equals("EMPTY")) && ((Queue02[1]).equals("EMPTY")) && ((Queue02[2]).equals("EMPTY")) && ((Queue02[3]).equals("EMPTY")) && ((Queue02[4]).equals("EMPTY")) && ((Queue02[5]).equals("EMPTY"))) {
                        System.out.print("\nQueue 02 is Empty : ");
                        for(int i = 0; i < 6; i++) {
                            System.out.print(Queue02[i] + " ");
                        }
                    }
                    if (((Queue03[0]).equals("EMPTY")) && ((Queue03[1]).equals("EMPTY")) && ((Queue03[2]).equals("EMPTY")) && ((Queue03[3]).equals("EMPTY")) && ((Queue03[4]).equals("EMPTY")) && ((Queue03[5]).equals("EMPTY"))) {
                        System.out.print("\nQueue 03 is Empty : ");
                        for(int i = 0; i < 6; i++) {
                            System.out.print(Queue03[i] + " ");
                        }
                    }
                    if (((Queue04[0]).equals("EMPTY")) && ((Queue04[1]).equals("EMPTY")) && ((Queue04[2]).equals("EMPTY")) && ((Queue04[3]).equals("EMPTY")) && ((Queue04[4]).equals("EMPTY")) && ((Queue04[5]).equals("EMPTY"))) {
                        System.out.print("\nQueue 03 is Empty : ");
                        for(int i = 0; i < 6; i++) {
                            System.out.print(Queue04[i] + " ");
                        }
                    }
                    if (((Queue05[0]).equals("EMPTY")) && ((Queue05[1]).equals("EMPTY")) && ((Queue05[2]).equals("EMPTY")) && ((Queue05[3]).equals("EMPTY")) && ((Queue05[4]).equals("EMPTY")) && ((Queue05[5]).equals("EMPTY"))) {
                        System.out.print("\nQueue 03 is Empty : ");
                        for(int i = 0; i < 6; i++) {
                            System.out.print(Queue05[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case "102":
                case "ACQ":
                    new FuelQueue(Queue01);
                    break;

                case "103":
                case "RCQ":
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
                            if (Queue01[(indexno)].equals("EMPTY")) {
                                System.out.println("There's No Customer in That Position");
                                //Is there's someone in the position...
                            } else {
                                System.out.println("\nCustomer " + Queue01[(indexno)] + " Removed Successfully");
                                //Customer will be removed and Queue will show "Empty" in that place
                                Queue01[(indexno)] = "Empty";
//                    continue;
                            }

                        } else if (queueNO == 2) {
                            Scanner k = new Scanner(System.in);
                            System.out.print("Input Position of the customer You Want to Remove :");
                            int indexno = k.nextInt() - 1;
                            passenger.Passenger02[indexno] = "Empty";
                            passenger.RLiters2[indexno] = 0;

                            if (Queue02[(indexno)].equals("EMPTY")) {
                                System.out.println("There's No Customer in That Position");
                            } else {
                                System.out.println("\nCustomer " + Queue02[(indexno)] + " Removed Successfully");
                                Queue02[(indexno)] = "Empty";
//                    continue;
                            }

                        } else if (queueNO == 3) {
                            Scanner k = new Scanner(System.in);
                            System.out.print("Input Position of the customer You Want to Remove :");
                            int indexno = k.nextInt() - 1;
                            passenger.Passenger03[indexno] = "Empty";
                            passenger.RLiters3[indexno] = 0;

                            if (Queue03[(indexno)].equals("EMPTY")) {
                                System.out.println("There's No Customer in That Position");
                            } else {
                                System.out.println("\nCustomer " + Queue03[(indexno)] + " Removed Successfully");
                                Queue03[(indexno)] = "Empty";
//                    continue;
                            }

                        } else if (queueNO == 4) {
                            Scanner k = new Scanner(System.in);
                            System.out.print("Input Position of the customer You Want to Remove :");
                            int indexno = k.nextInt() - 1;
                            passenger.Passenger04[indexno] = "Empty";
                            passenger.RLiters4[indexno] = 0;

                            if (Queue04[(indexno)].equals("EMPTY")) {
                                System.out.println("There's No Customer in That Position");
                            } else {
                                System.out.println("\nCustomer " + Queue04[(indexno)] + " Removed Successfully");
                                Queue04[(indexno)] = "Empty";
//                    continue;
                            }

                        } else if (queueNO == 5) {
                            Scanner k = new Scanner(System.in);
                            System.out.print("Input Position of the customer You Want to Remove :");
                            int indexno = k.nextInt() - 1;
                            passenger.Passenger05[indexno] = "Empty";
                            passenger.RLiters5[indexno] = 0;

                            if (Queue05[(indexno)].equals("EMPTY")) {
                                System.out.println("There's No Customer in That Position");
                            } else {
                                System.out.println("\nCustomer " + Queue05[(indexno)] + " Removed Successfully");
                                Queue05[(indexno)] = "Empty";
//                    continue;
                            }

                        } else {
                            System.out.println("Queue does not exists");
                        }
                        //Exception handler
                    } catch (Exception z) {
                        System.out.println("An Error Occurred");
                    }
                    break;

                case "104":
                case "PCQ":
                    //Asking customer to select remove method
                    Scanner h = new Scanner(System.in);
                    System.out.print("---------Select remove method---------" +
                            "\nAuto remove first served customer in queue (Enter: 1)" +
                            "\nRemove customer by FCFS (Enter: 2)" +
                            "\nRemove specific customer (Enter: 3)" +
                            "\n:");
                    String select = h.next();

                    //Switch with sub menu input select
                    switch (select) {
                        case "1":
                            Scanner Qno = new Scanner(System.in);
                            //Asking user to input queue number to remove a customer
                            System.out.print("Where you want to remove a served customer? \nInput the Queue no. :");
                            int Qnumber = Qno.nextInt();
                            if (Qnumber == 1) {
                                //Shifting elements of the selected queue to left by 1
                                System.arraycopy(Queue01, 1, Queue01, 0, Queue01.length - 1);
                                //Making last element as "EMPTY" to prevent last 2 elements become same
                                Queue01[5] = "EMPTY";

                                //making last element from passenger queue as "Empty"
                                System.arraycopy(passenger.Passenger01, 1, passenger.Passenger01, 0, passenger.Passenger01.length - 1);
                                passenger.Passenger01[0] = "Empty";

                                //making last element from required fuel queue as 0
                                System.arraycopy(passenger.RLiters1, 1, passenger.RLiters1, 0, passenger.RLiters1.length - 1);
                                passenger.RLiters1[5] = 0;

                            }else if (Qnumber == 2) {
                                System.arraycopy(Queue02, 1, Queue02, 0, Queue02.length - 1);
                                Queue02[5] = "EMPTY";

                                //making last element from passenger queue as "Empty"
                                System.arraycopy(passenger.Passenger02, 1, passenger.Passenger02, 0, passenger.Passenger02.length - 1);
                                passenger.Passenger02[0] = "Empty";

                                //making last element from required fuel queue as 0
                                System.arraycopy(passenger.RLiters2, 1, passenger.RLiters2, 0, passenger.RLiters2.length - 1);
                                passenger.RLiters2[5] = 0;

                            }else if (Qnumber == 3) {
                                System.arraycopy(Queue03, 1, Queue03, 0, Queue03.length - 1);
                                Queue03[5] = "EMPTY";

                                //making last element from passenger queue as "Empty"
                                System.arraycopy(passenger.Passenger03, 1, passenger.Passenger03, 0, passenger.Passenger03.length - 1);
                                passenger.Passenger03[0] = "Empty";

                                //making last element from required fuel queue as 0
                                System.arraycopy(passenger.RLiters3, 1, passenger.RLiters3, 0, passenger.RLiters3.length - 1);
                                passenger.RLiters3[5] = 0;

                            }else if (Qnumber == 4) {
                                System.arraycopy(Queue04, 1, Queue04, 0, Queue04.length - 1);
                                Queue04[5] = "EMPTY";

                                //making last element from passenger queue as "Empty"
                                System.arraycopy(passenger.Passenger04, 1, passenger.Passenger04, 0, passenger.Passenger04.length - 1);
                                passenger.Passenger04[0] = "Empty";

                                //making last element from required fuel queue as 0
                                System.arraycopy(passenger.RLiters4, 1, passenger.RLiters4, 0, passenger.RLiters4.length - 1);
                                passenger.RLiters4[5] = 0;

                            }else if (Qnumber == 5) {
                                System.arraycopy(Queue05, 1, Queue05, 0, Queue05.length - 1);
                                Queue05[5] = "EMPTY";

                                //making last element from passenger queue as "Empty"
                                System.arraycopy(passenger.Passenger05, 1, passenger.Passenger05, 0, passenger.Passenger05.length - 1);
                                passenger.Passenger05[0] = "Empty";

                                //making last element from required fuel queue as 0
                                System.arraycopy(passenger.RLiters5, 1, passenger.RLiters5, 0, passenger.RLiters5.length - 1);
                                passenger.RLiters5[5] = 0;

                            }else {
                                System.out.println("Queue does not exists...");
                            }

                            break;

                        case "2":
                            Scanner qno = new Scanner(System.in);
                            //Queue selection
                            System.out.print("\nSelect Queue :");
                            int Queueno = qno.nextInt();
                            if (Queueno == 1) {
                                Scanner B = new Scanner(System.in);
                                //Asking how many customers user wants to remove
                                System.out.print("\nHow many served customers to be removed? :");
                                //Reducing 1 from no.of customers for index positioning
                                int removecus = B.nextInt();
                                //Declaring a variable and initialising it with a value of (6 - no.of customers to be removed)
                                int re = removecus - 1;

                                //Moving customer Queue, passenger queue, and required fuel queue to
                                System.arraycopy(Queue01, removecus, Queue01, 0, Queue01.length - removecus);
                                System.arraycopy(passenger.Passenger01, 1, passenger.Passenger01, 0, passenger.Passenger01.length - 1);
                                System.arraycopy(passenger.RLiters1, 1, passenger.RLiters1, 0, passenger.RLiters1.length - 1);
                                int raca = 6 - removecus;
                                //Using for loop to remove and enter "Empty" to the removed customers location
                                for (int u = 0; u <= re; u++) {
                                    Queue01[raca] = "EMPTY";
                                    passenger.Passenger01[raca] = "Empty";
                                    passenger.RLiters1[raca] = 0;
                                    raca++;
                                }
                                System.out.println("First " + removecus + " Customers Removed From The Queue");
                                break;

                            }else if (Queueno == 2) {
                                Scanner Ba = new Scanner(System.in);
                                System.out.print("\nHow many served customers to be removed? :");
                                int removecus = Ba.nextInt();
                                int re = removecus - 1;
                                System.arraycopy(Queue02, removecus, Queue02, 0, Queue02.length - removecus);
                                System.arraycopy(passenger.Passenger02, 1, passenger.Passenger02, 0, passenger.Passenger02.length - 1);
                                System.arraycopy(passenger.RLiters2, 1, passenger.RLiters2, 0, passenger.RLiters2.length - 1);
                                int racb = 6 - removecus;
                                for (int u = 0; u <= re; u++) {
                                    Queue02[racb] = "EMPTY";
                                    passenger.Passenger02[racb] = "Empty";
                                    passenger.RLiters2[racb] = 0;
                                    racb++;
                                }
//                    FuelStock.totalfuel = FuelStock.totalfuel - (10 * removecus);
                                System.out.println("First " + removecus + " Customers Removed From The Queue");
                                break;

                            }else if (Queueno == 3) {
                                Scanner Bb = new Scanner(System.in);
                                System.out.print("\nHow many served customers to be removed? :");
                                int removecus = Bb.nextInt();
                                int re = removecus - 1;
                                System.arraycopy(Queue03, removecus, Queue03, 0, Queue03.length - removecus);
                                System.arraycopy(passenger.Passenger03, 1, passenger.Passenger03, 0, passenger.Passenger03.length - 1);
                                System.arraycopy(passenger.RLiters3, 1, passenger.RLiters3, 0, passenger.RLiters3.length - 1);
                                int racc = 6 - removecus;
                                for (int u = 0; u <= re; u++) {
                                    Queue03[racc] = "EMPTY";
                                    passenger.Passenger03[racc] = "Empty";
                                    passenger.RLiters3[racc] = 0;
                                    racc++;
                                }
                                System.out.println("First " + removecus + " Customers Removed From The Queue");
                                break;

                            }else if (Queueno == 4) {
                                Scanner Bc = new Scanner(System.in);
                                System.out.print("\nHow many served customers to be removed? :");
                                int removecus = Bc.nextInt();
                                int re = removecus - 1;
                                System.arraycopy(Queue04, removecus, Queue04, 0, Queue04.length - removecus);
                                System.arraycopy(passenger.Passenger04, 1, passenger.Passenger04, 0, passenger.Passenger04.length - 1);
                                System.arraycopy(passenger.RLiters4, 1, passenger.RLiters4, 0, passenger.RLiters4.length - 1);
                                int racd = 6 - removecus;
                                for (int u = 0; u <= re; u++) {
                                    Queue04[racd] = "EMPTY";
                                    passenger.Passenger04[racd] = "Empty";
                                    passenger.RLiters4[racd] = 0;
                                    racd++;
                                }
                                System.out.println("First " + removecus + " Customers Removed From The Queue");
                                break;

                            }else if (Queueno == 5) {
                                Scanner Bd = new Scanner(System.in);
                                System.out.print("\nHow many served customers to be removed? :");
                                int removecus = Bd.nextInt();
                                int re = removecus - 1;
                                System.arraycopy(Queue05, removecus, Queue05, 0, Queue05.length - removecus);
                                System.arraycopy(passenger.Passenger05, 1, passenger.Passenger05, 0, passenger.Passenger05.length - 1);
                                System.arraycopy(passenger.RLiters5, 1, passenger.RLiters5, 0, passenger.RLiters5.length - 1);
                                int race = 6 - removecus;
                                for (int u = 0; u <= re; u++) {
                                    Queue05[race] = "EMPTY";
                                    passenger.Passenger05[race] = "Empty";
                                    passenger.RLiters5[race] = 0;
                                    race++;
                                }
                                System.out.println("First " + removecus + " Customers Removed From The Queue");
                                break;
                            }

                        case "3":
                            //Asking user to input queue number
                            Scanner k = new Scanner(System.in);
                            System.out.print("Input Queue number :");
                            int queueno = k.nextInt();
                            try {
                                if (queueno == 1) {                                 //Put queue2 at 1st position in add customer
                                    //Asking user to input name of the customer to remove
                                    Scanner cu = new Scanner(System.in);
                                    System.out.print("Input customer name:");
                                    String cuname = cu.nextLine().toUpperCase();

                                    //Find the index of cuname
                                    System.out.println("Index position of the specific customer is :" + findIndex1(Queue01, cuname));
                                    //Checking that input name customer exist or not
                                    if((findIndex1(Queue01, cuname)) == -1){
                                        System.out.println("\nCustomer does not exist");
                                        break;
                                    }

                                    //Using for loop to loop through array elements
                                    for (int q = 0, j = 0; q < Queue01.length; q++) {
                                        if (q != findIndex1(Queue01, cuname)) {
                                            j++;
                                            //Assigning the values again with for loop without the specific customer
                                            Queue01[q] = Queue01[q];
                                        } else {
                                            //...Assigning "Empty" to the specific customer location if the index position matched
                                            Queue01[j] = "EMPTY";
                                            passenger.Passenger01[j] = "Empty";
                                        }
                                    }
                                    variable.x++;
                                    System.out.println("Customer Removed Successfully");

                                } else if (queueno == 2) {
                                    //Asking user to input name of the customer to remove
                                    Scanner cu = new Scanner(System.in);
                                    System.out.print("Input customer name:");
                                    String cuname = cu.nextLine().toUpperCase();

                                    //Find the index of cuname
                                    System.out.println("Index position of the specific customer is :" + findIndex2(Queue02, cuname));
                                    //Checking that input name customer exist or not
                                    int l = findIndex2(Queue02, cuname);
                                    if(l == -1){
                                        System.out.println("\nCustomer does not exist");
                                        break;
                                    }

                                    for (int t = 0, j = 0; t < Queue02.length; t++) {
                                        if (t != findIndex2(Queue02, cuname)) {
                                            j++;
                                            Queue02[t] = Queue02[t];
                                        } else {
                                            Queue02[j] = "EMPTY";
                                            passenger.Passenger02[j] = "Empty";
                                        }
                                    }
//                        passenger.Passenger02[findIndex2(Stock.Queue02, cuname)] = "Empty";
                                    variable.x = 0;
                                    System.out.println("Customer Removed Successfully");

                                } else if (queueno == 3) {
                                    //Asking user to input name of the customer to remove
                                    Scanner cu = new Scanner(System.in);
                                    System.out.print("Input customer name:");
                                    String cuname = cu.nextLine().toUpperCase();

                                    //Find the index of cuname
                                    System.out.println("Index position of the specific customer is :" + findIndex3(Queue03, cuname));
                                    //Checking that input name customer exist or not
                                    if((findIndex3(Queue03, cuname)) == -1){
                                        System.out.println("\nCustomer does not exist");
                                        break;
                                    }

                                    for (int y = 0, j = 0; y < Queue03.length; y++) {
                                        if (y != findIndex3(Queue03, cuname)) {
                                            j++;
                                            Queue03[y] = Queue03[y];
                                        } else {
                                            Queue03[j] = "EMPTY";
                                            passenger.Passenger03[j] = "Empty";
                                        }
                                    }
//                        passenger.Passenger03[findIndex3(Stock.Queue03, cuname)] = "Empty";
                                    variable.x++;
                                    System.out.println("Customer Removed Successfully");

                                } else if (queueno == 4) {
                                    //Asking user to input name of the customer to remove
                                    Scanner cu = new Scanner(System.in);
                                    System.out.print("Input customer name:");
                                    String cuname = cu.nextLine().toUpperCase();

                                    //Find the index of cuname
                                    System.out.println("Index position of the specific customer is :" + findIndex4(Queue04, cuname));
                                    //Checking that input name customer exist or not
                                    if((findIndex4(Queue04, cuname)) == -1){
                                        System.out.println("\nCustomer does not exist");
                                        break;
                                    }

                                    for (int y = 0, j = 0; y < Queue04.length; y++) {
                                        if (y != findIndex4(Queue04, cuname)) {
                                            j++;
                                            Queue04[y] = Queue04[y];
                                        } else {
                                            Queue04[j] = "EMPTY";
                                            passenger.Passenger04[j] = "Empty";
                                        }
                                    }
//                        passenger.Passenger04[findIndex4(Stock.Queue04, cuname)] = "Empty";
                                    variable.x++;
                                    System.out.println("Customer Removed Successfully");

                                } else if (queueno == 5) {
                                    //Asking user to input name of the customer to remove
                                    Scanner cu = new Scanner(System.in);
                                    System.out.print("Input customer name:");
                                    String cuname = cu.nextLine().toUpperCase();

                                    //Find the index of cuname
                                    System.out.println("Index position of the specific customer is :" + findIndex5(Queue05, cuname));
                                    //Checking that input name customer exist or not
                                    if((findIndex5(Queue05, cuname)) == -1){
                                        System.out.println("\nCustomer does not exist");
                                        break;
                                    }

                                    for (int y = 0, j = 0; y < Queue05.length; y++) {
                                        if (y != findIndex5(Queue05, cuname)) {
                                            j++;
                                            Queue05[y] = Queue05[y];
                                        } else {
                                            Queue05[j] = "EMPTY";
                                            passenger.Passenger05[j] = "Empty";
                                        }
                                    }
//                        passenger.Passenger05[findIndex5(Stock.Queue05, cuname)] = "Empty";
                                    variable.x++;
                                    System.out.println("Customer Removed Successfully");

                                } else {
                                    System.out.println("Queue does not exists");
                                }
                            } catch (Exception z) {
                                System.out.println("An Error Occurred");
                            }
                            break;


                        default:
                            System.out.println("Invalid Input");
                    }

                    break;

                case "105":
                case "VCS":
                    //Sorting the array elements
                    //For Queue01
                    for(int i = 0; i < 6; i++){
                        //Using for loop to replace "EMPTY" with "z@z" for sorting
                        if(Queue01[i] == "EMPTY") {
                            Queue01[i] = "z@z";
                        }
                    }
                    //Sorting array
                    Arrays.sort(Queue01);
                    //Using for loop to replace "z@z" with "EMPTY"
                    for(int i = 0; i < 6; i++){
                        if(Queue01[i] == "z@z") {
                            Queue01[i] = "EMPTY";
                        }
                    }
                    //Sorting the array elements
                    //For Queue02
                    for(int i = 0; i < 6; i++){
                        //Using for loop to replace "EMPTY" with "z@z" for sorting
                        if(Queue02[i] == "EMPTY") {
                            Queue02[i] = "z@z";
                        }
                    }
                    //Sorting array
                    Arrays.sort(Queue02);
                    //Using for loop to replace "z@z" with "EMPTY"
                    for(int i = 0; i < 6; i++){
                        if(Queue02[i] == "z@z") {
                            Queue02[i] = "EMPTY";
                        }
                    }
                    //Sorting the array elements
                    //For Queue03
                    for(int i = 0; i < 6; i++){
                        //Using for loop to replace "EMPTY" with "z@z" for sorting
                        if(Queue03[i] == "EMPTY") {
                            Queue03[i] = "z@z";
                        }
                    }
                    //Sorting array
                    Arrays.sort(Queue03);
                    //Using for loop to replace "z@z" with "EMPTY"
                    for(int i = 0; i < 6; i++){
                        if(Queue03[i] == "z@z") {
                            Queue03[i] = "EMPTY";
                        }
                    }
                    //Sorting the array elements
                    //For Queue04
                    for(int i = 0; i < 6; i++){
                        //Using for loop to replace "EMPTY" with "z@z" for sorting
                        if(Queue04[i] == "EMPTY") {
                            Queue04[i] = "z@z";
                        }
                    }
                    //Sorting array
                    Arrays.sort(Queue04);
                    //Using for loop to replace "z@z" with "EMPTY"
                    for(int i = 0; i < 6; i++){
                        if(Queue04[i] == "z@z") {
                            Queue04[i] = "EMPTY";
                        }
                    }
                    //Sorting the array elements
                    //For Queue05
                    for(int i = 0; i < 6; i++){
                        //Using for loop to replace "EMPTY" with "z@z" for sorting
                        if(Queue05[i] == "EMPTY") {
                            Queue05[i] = "z@z";
                        }
                    }
                    //Sorting array
                    Arrays.sort(Queue05);
                    //Using for loop to replace "z@z" with "EMPTY"
                    for(int i = 0; i < 6; i++){
                        if(Queue05[i] == "z@z") {
                            Queue05[i] = "EMPTY";
                        }
                    }
                    //Printing All Queues
                    System.out.print("Queue 01 : ");
                    //Using for loop to access all elements of the queue
                    for(int i = 0; i < 6; i++) {
                        //If queue element is "EMPTY" it will print " "
                        if (Queue01[i] == "EMPTY") {
                            System.out.print(" ");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue01[i] + " ");
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
                        if (Queue02[i] == "EMPTY") {
                            System.out.print(" ");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue02[i] + " ");
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
                        if (Queue03[i] == "EMPTY") {
                            System.out.print(" ");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue03[i] + " ");
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
                        if (Queue04[i] == "EMPTY") {
                            System.out.print(" ");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue04[i] + " ");
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
                        if (Queue05[i] == "EMPTY") {
                            System.out.print(" ");
                            //otherwise it'll print queue elements
                        } else {
                            System.out.print(Queue05[i] + " ");
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
                    break;

                case "106":
                case "SPD":
                    //Save data to file
                    Savedata1(Queue01);
                    System.out.println("Your Data is Saved");
                    break;

                case "107":
                case "LPD":
                    //Load data from file
                    System.out.println("Your Saved Data :\n");
                    ReadFile();
                    break;

                case "108":
                case "STK":
                    //View remaining fuel stock
                    System.out.println("Total Remaining Fuel Stock (in Liters) is :" + totalfuel);
                    break;

                case "109":
                case "AFS":
                    //Asking to add fuel stock
                    Scanner fs = new Scanner(System.in);
                    System.out.print("Add Fuel Stock :");
                    int Addfuel = fs.nextInt();
                    totalfuel = totalfuel + Addfuel;
                    System.out.println("Total Fuel Stock is :" + totalfuel);
                    break;

                case "110":
                case "IFQ":
                    System.out.print("Fuel Queue 01 income :");
                    //Using for loop to add required fuel * 430 to a variable
                    for(int i = 0; i < 6; i++) {
                        int Rliterpercus1 = passenger.RLiters1[i] * 430;
                        //Adding that total value to a variable from variable class
                        variable.RLiters1total = variable.RLiters1total + Rliterpercus1;
                    }
                    //Printing that variable value
                    System.out.println( variable.RLiters1total  + "/=");

                    //Doing the same as above
                    System.out.print("Fuel Queue 02 income :");
                    for(int i = 0; i < 6; i++) {
                        int Rliterpercus2 = passenger.RLiters2[i] * 430;
                        variable.RLiters2total = variable.RLiters2total + Rliterpercus2;
                    }
                    System.out.println( variable.RLiters2total  + "/=");

                    System.out.print("Fuel Queue 03 income :");
                    for(int i = 0; i < 6; i++) {
                        int Rliterpercus3 = passenger.RLiters3[i] * 430;
                        variable.RLiters3total = variable.RLiters3total + Rliterpercus3;
                    }
                    System.out.println( variable.RLiters3total  + "/=");

                    System.out.print("Fuel Queue 04 income :");
                    for(int i = 0; i < 6; i++) {
                        int Rliterpercus4 = passenger.RLiters4[i] * 430;
                        variable.RLiters4total = variable.RLiters4total + Rliterpercus4;
                    }
                    System.out.println( variable.RLiters4total  + "/=");

                    System.out.print("Fuel Queue 05 income :");
                    for(int i = 0; i < 6; i++) {
                        int Rliterpercus5 = passenger.RLiters5[i] * 430;
                        variable.RLiters5total = variable.RLiters5total + Rliterpercus5;
                    }
                    System.out.println( variable.RLiters5total  + "/=");
                    break;

                default:
                    System.out.println("Invalid Option");

            }
            //Asking user to loop the program
            Scanner again = new Scanner(System.in);
            System.out.println();
            System.out.print("Do you want to use again? (y/n): ");
            String loopagain = again.nextLine().toUpperCase();
            if (loopagain.equals("Y")) {
                count = count + 1;
                continue;
            } else {
                System.out.println("Thank you for using this program.");
                count = count - 1;
                break;
            }
        }
    }

    //Finding the index position of the customer
    public static int findIndex1(String arr[], String t) {
        // Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        // adding elements of array
        // to ArrayList
        for (String i : arr)
            clist.add(i);

        // returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex2(String arr[], String t) {
        // Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        // adding elements of array
        // to ArrayList
        for (String i : arr)
            clist.add(i);

        // returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex3(String arr[], String t) {
        // Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        // adding elements of array
        // to ArrayList
        for (String i : arr)
            clist.add(i);

        // returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex4(String arr[], String t) {
        // Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        // adding elements of array
        // to ArrayList
        for (String i : arr)
            clist.add(i);

        // returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex5(String arr[], String t) {
        // Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        // adding elements of array
        // to ArrayList
        for (String i : arr)
            clist.add(i);

        // returning index of the element
        return clist.indexOf(t);

    }

    //Method for save data to a text file
    private static void Savedata1(String[] args) {
        try{
            //Declaring file name to create with FileWriter method
            FileWriter inputData = new FileWriter("SPD.txt");
            inputData.write("-----------------------------------------------------------");
            //Inputting data to write in a text file
            inputData.write("\nQueue01 have :\n");
            //Using for loop to access queue data and write in text file
            for(int y = 0; y < 6; y++){
                //If queue element is "EMPTY" it will print " "
                if ((Queue01[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Queue01[y] + "\n");
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
                if ((Queue02[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Queue02[y] + "\n");
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
                if ((Queue03[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Queue03[y] + "\n");
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
                if ((Queue04[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Queue04[y] + "\n");
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
                if ((Queue05[y]).equals("EMPTY")) {
                    inputData.write("");

                    //otherwise it'll print queue elements
                } else {
                    inputData.write("\n" + Queue05[y] + "\n");
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
        }catch(IOException z){
            System.out.println("An error occurred");
        }
    }

    //Method for load data from a text file
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


