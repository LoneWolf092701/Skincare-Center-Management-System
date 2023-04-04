package Part02;

import java.util.*;
import java.util.stream.IntStream;
import Part02.*;

//import static Part02.variable.*;

public class PCQ {
    public PCQ(String[] args){
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
                    System.arraycopy(Stock.Queue01, 1, Stock.Queue01, 0, Stock.Queue01.length - 1);
                    //Making last element as "EMPTY" to prevent last 2 elements become same
                    Stock.Queue01[5] = "EMPTY";

                    //making last element from passenger queue as "Empty"
                    System.arraycopy(passenger.Passenger01, 1, passenger.Passenger01, 0, passenger.Passenger01.length - 1);
                    passenger.Passenger01[0] = "Empty";

                    //making last element from required fuel queue as 0
                    System.arraycopy(passenger.RLiters1, 1, passenger.RLiters1, 0, passenger.RLiters1.length - 1);
                    passenger.RLiters1[5] = 0;

                }else if (Qnumber == 2) {
                    System.arraycopy(Stock.Queue02, 1, Stock.Queue02, 0, Stock.Queue02.length - 1);
                    Stock.Queue02[5] = "EMPTY";

                    //making last element from passenger queue as "Empty"
                    System.arraycopy(passenger.Passenger02, 1, passenger.Passenger02, 0, passenger.Passenger02.length - 1);
                    passenger.Passenger02[0] = "Empty";

                    //making last element from required fuel queue as 0
                    System.arraycopy(passenger.RLiters2, 1, passenger.RLiters2, 0, passenger.RLiters2.length - 1);
                    passenger.RLiters2[5] = 0;

                }else if (Qnumber == 3) {
                    System.arraycopy(Stock.Queue03, 1, Stock.Queue03, 0, Stock.Queue03.length - 1);
                    Stock.Queue03[5] = "EMPTY";

                    //making last element from passenger queue as "Empty"
                    System.arraycopy(passenger.Passenger03, 1, passenger.Passenger03, 0, passenger.Passenger03.length - 1);
                    passenger.Passenger03[0] = "Empty";

                    //making last element from required fuel queue as 0
                    System.arraycopy(passenger.RLiters3, 1, passenger.RLiters3, 0, passenger.RLiters3.length - 1);
                    passenger.RLiters3[5] = 0;

                }else if (Qnumber == 4) {
                    System.arraycopy(Stock.Queue04, 1, Stock.Queue04, 0, Stock.Queue04.length - 1);
                    Stock.Queue04[5] = "EMPTY";

                    //making last element from passenger queue as "Empty"
                    System.arraycopy(passenger.Passenger04, 1, passenger.Passenger04, 0, passenger.Passenger04.length - 1);
                    passenger.Passenger04[0] = "Empty";

                    //making last element from required fuel queue as 0
                    System.arraycopy(passenger.RLiters4, 1, passenger.RLiters4, 0, passenger.RLiters4.length - 1);
                    passenger.RLiters4[5] = 0;

                }else if (Qnumber == 5) {
                    System.arraycopy(Stock.Queue05, 1, Stock.Queue05, 0, Stock.Queue05.length - 1);
                    Stock.Queue05[5] = "EMPTY";

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
                    System.arraycopy(Stock.Queue01, removecus, Stock.Queue01, 0, Stock.Queue01.length - removecus);
                    System.arraycopy(passenger.Passenger01, 1, passenger.Passenger01, 0, passenger.Passenger01.length - 1);
                    System.arraycopy(passenger.RLiters1, 1, passenger.RLiters1, 0, passenger.RLiters1.length - 1);
                    int raca = 6 - removecus;
                    //Using for loop to remove and enter "Empty" to the removed customers location
                    for (int u = 0; u <= re; u++) {
                        Stock.Queue01[raca] = "EMPTY";
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
                    System.arraycopy(Stock.Queue02, removecus, Stock.Queue02, 0, Stock.Queue02.length - removecus);
                    System.arraycopy(passenger.Passenger02, 1, passenger.Passenger02, 0, passenger.Passenger02.length - 1);
                    System.arraycopy(passenger.RLiters2, 1, passenger.RLiters2, 0, passenger.RLiters2.length - 1);
                    int racb = 6 - removecus;
                    for (int u = 0; u <= re; u++) {
                        Stock.Queue02[racb] = "EMPTY";
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
                    System.arraycopy(Stock.Queue03, removecus, Stock.Queue03, 0, Stock.Queue03.length - removecus);
                    System.arraycopy(passenger.Passenger03, 1, passenger.Passenger03, 0, passenger.Passenger03.length - 1);
                    System.arraycopy(passenger.RLiters3, 1, passenger.RLiters3, 0, passenger.RLiters3.length - 1);
                    int racc = 6 - removecus;
                    for (int u = 0; u <= re; u++) {
                        Stock.Queue03[racc] = "EMPTY";
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
                    System.arraycopy(Stock.Queue04, removecus, Stock.Queue04, 0, Stock.Queue04.length - removecus);
                    System.arraycopy(passenger.Passenger04, 1, passenger.Passenger04, 0, passenger.Passenger04.length - 1);
                    System.arraycopy(passenger.RLiters4, 1, passenger.RLiters4, 0, passenger.RLiters4.length - 1);
                    int racd = 6 - removecus;
                    for (int u = 0; u <= re; u++) {
                        Stock.Queue04[racd] = "EMPTY";
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
                    System.arraycopy(Stock.Queue05, removecus, Stock.Queue05, 0, Stock.Queue05.length - removecus);
                    System.arraycopy(passenger.Passenger05, 1, passenger.Passenger05, 0, passenger.Passenger05.length - 1);
                    System.arraycopy(passenger.RLiters5, 1, passenger.RLiters5, 0, passenger.RLiters5.length - 1);
                    int race = 6 - removecus;
                    for (int u = 0; u <= re; u++) {
                        Stock.Queue05[race] = "EMPTY";
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
                        System.out.println("Index position of the specific customer is :" + findIndex1(Stock.Queue01, cuname));
                        //Checking that input name customer exist or not
                        if((findIndex1(Stock.Queue01, cuname)) == -1){
                            System.out.println("\nCustomer does not exist");
                            break;
                        }

                        //Using for loop to loop through array elements
                        for (int q = 0, j = 0; q < Stock.Queue01.length; q++) {
                            if (q != findIndex1(Stock.Queue01, cuname)) {
                                j++;
                                //Assigning the values again with for loop without the specific customer
                                Stock.Queue01[q] = Stock.Queue01[q];
                            } else {
                                //...Assigning "Empty" to the specific customer location if the index position matched
                                Stock.Queue01[j] = "EMPTY";
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
                        System.out.println("Index position of the specific customer is :" + findIndex2(Stock.Queue02, cuname));
                        //Checking that input name customer exist or not
                        int l = findIndex2(Stock.Queue02, cuname);
                        if(l == -1){
                            System.out.println("\nCustomer does not exist");
                            break;
                        }

                        for (int t = 0, j = 0; t < Stock.Queue02.length; t++) {
                            if (t != findIndex2(Stock.Queue02, cuname)) {
                                j++;
                                Stock.Queue02[t] = Stock.Queue02[t];
                            } else {
                                Stock.Queue02[j] = "EMPTY";
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
                        System.out.println("Index position of the specific customer is :" + findIndex3(Stock.Queue03, cuname));
                        //Checking that input name customer exist or not
                        if((findIndex3(Stock.Queue03, cuname)) == -1){
                            System.out.println("\nCustomer does not exist");
                            break;
                        }

                        for (int y = 0, j = 0; y < Stock.Queue03.length; y++) {
                            if (y != findIndex3(Stock.Queue03, cuname)) {
                                j++;
                                Stock.Queue03[y] = Stock.Queue03[y];
                            } else {
                                Stock.Queue03[j] = "EMPTY";
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
                        System.out.println("Index position of the specific customer is :" + findIndex4(Stock.Queue04, cuname));
                        //Checking that input name customer exist or not
                        if((findIndex4(Stock.Queue04, cuname)) == -1){
                            System.out.println("\nCustomer does not exist");
                            break;
                        }

                        for (int y = 0, j = 0; y < Stock.Queue04.length; y++) {
                            if (y != findIndex4(Stock.Queue04, cuname)) {
                                j++;
                                Stock.Queue04[y] = Stock.Queue04[y];
                            } else {
                                Stock.Queue04[j] = "EMPTY";
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
                        System.out.println("Index position of the specific customer is :" + findIndex5(Stock.Queue05, cuname));
                        //Checking that input name customer exist or not
                        if((findIndex5(Stock.Queue05, cuname)) == -1){
                            System.out.println("\nCustomer does not exist");
                            break;
                        }

                        for (int y = 0, j = 0; y < Stock.Queue05.length; y++) {
                            if (y != findIndex5(Stock.Queue05, cuname)) {
                                j++;
                                Stock.Queue05[y] = Stock.Queue05[y];
                            } else {
                                Stock.Queue05[j] = "EMPTY";
                                passenger.Passenger05[j] = "Empty";
                            }
                        }
//                        passenger.Passenger05[findIndex5(Stock.Queue05, cuname)] = "Empty";
                        variable.x++;
                        System.out.println("Customer Removed Successfully");

                    } else {
                        System.out.println("Queue does not exists");
                    }
                } catch (Exception e) {
                    System.out.println("An Error Occurred");
                }
                break;


            default:
                System.out.println("Invalid Input");
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

}
