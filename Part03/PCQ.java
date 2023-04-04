package Part03;

import java.util.*;
import java.util.stream.IntStream;
import Part03.*;

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
                        //Stock.Queue01[u] = "EMPTY";
                        displayQueue();
                        //Assigning u index variable to raca index queue position
                        Stock.Queue01[raca] = variable.queue[u];
                        raca++;
                        //Removing assigned element from waiting queue
                        deQueue(variable.queue[u]);
                        displayQueue();
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
                        //Stock.Queue02[u] = "EMPTY";
                        displayQueue();
                        System.out.println(Arrays.toString(Stock.Queue02));
                        Stock.Queue02[racb] = variable.queue[u];
                        racb++;
                        deQueue(variable.queue[u]);
                        displayQueue();
                    }
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
                        //Stock.Queue03[u] = "EMPTY";
                        displayQueue();
                        System.out.println(Arrays.toString(Stock.Queue03));
                        Stock.Queue03[racc] = variable.queue[u];
                        racc++;
                        deQueue(variable.queue[u]);
                        displayQueue();
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
                        //Stock.Queue04[u] = "EMPTY";
                        displayQueue();
                        System.out.println(Arrays.toString(Stock.Queue04));
                        Stock.Queue04[racd] = variable.queue[u];
                        racd++;
                        deQueue(variable.queue[u]);
                        displayQueue();
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
                        //Stock.Queue05[u] = "EMPTY";
                        displayQueue();
                        System.out.println(Arrays.toString(Stock.Queue05));
                        Stock.Queue05[race] = variable.queue[u];
                        race++;
                        deQueue(variable.queue[u]);
                        displayQueue();
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
                        System.out.println("Index position is :" + findIndex1(Stock.Queue01, cuname));
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
                                //Assigning "Empty" to the specific customer location
//                                Stock.Queue01[j] = "EMPTY";
                                Stock.Queue01[j] = Stock.Queue01[j+1];
                                displayQueue();
                                //Assigning customer from waiting queue to the removed customer place
                                Stock.Queue01[j] = variable.queue[variable.x];
                                //Remove customer from waiting queue
                                deQueue(variable.queue[variable.x]);
                                //Display waiting queue
                                displayQueue();
                            }
                            variable.x++;
                        }
                        System.out.println("Customer Removed Successfully");

                    } else if (queueno == 2) {
                        //Asking user to input name of the customer to remove
                        Scanner cu = new Scanner(System.in);
                        System.out.print("Input customer name:");
                        String cuname = cu.nextLine().toUpperCase();

                        //Find the index of cuname
                        System.out.println("Index position is :" + findIndex2(Stock.Queue02, cuname));
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
                                //Stock.Queue02[j] = variable.queue[0];
                                displayQueue();
                                Stock.Queue02[j] = variable.queue[t];
                                deQueue(variable.queue[variable.x]);
                                displayQueue();
                            }
                            variable.x++;
                        }
                        System.out.println("Customer Removed Successfully");

                    } else if (queueno == 3) {
                        //Asking user to input name of the customer to remove
                        Scanner cu = new Scanner(System.in);
                        System.out.print("Input customer name:");
                        String cuname = cu.nextLine().toUpperCase();

                        //Find the index of cuname
                        System.out.println("Index position is :" + findIndex3(Stock.Queue03, cuname));
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
//                                displayQueue();
//                                Stock.Queue03[j] = variable.queue[variable.x];
//                                deQueue(variable.queue[variable.x]);
//                                displayQueue();
//                                FuelStock.totalfuel = FuelStock.totalfuel + 10;
                            }
                            variable.x++;
                        }
                        System.out.println("Customer Removed Successfully");

                    } else if (queueno == 4) {
                        //Asking user to input name of the customer to remove
                        Scanner cu = new Scanner(System.in);
                        System.out.print("Input customer name:");
                        String cuname = cu.nextLine().toUpperCase();

                        //Find the index of cuname
                        System.out.println("Index position is :" + findIndex4(Stock.Queue04, cuname));
                        //Checking that input name customer exist or not
                        if((findIndex4(Stock.Queue04, cuname)) == -1){
                            System.out.println("\nCustomer does not exist");
                            break;
                        }

                        //removing customer by making a copy of the array
                        String[] Queue04copy = new String[Stock.Queue04.length - 1];
                        for (int y = 0, j = 0; y < Stock.Queue04.length; y++) {
                            if (y != findIndex4(Stock.Queue04, cuname)) {
                                j++;
                                Stock.Queue04[y] = Stock.Queue04[y];
                            } else {
//                                Stock.Queue04[j] = "EMPTY";
                                displayQueue();
                                Stock.Queue04[j] = variable.queue[variable.x];
                                deQueue(variable.queue[variable.x]);
                                displayQueue();
                            }
                            variable.x++;
                        }
                        System.out.println("Customer Removed Successfully");

                    } else if (queueno == 5) {
                        //Asking user to input name of the customer to remove
                        Scanner cu = new Scanner(System.in);
                        System.out.print("Input customer name:");
                        String cuname = cu.nextLine().toUpperCase();

                        //Find the index of cuname
                        System.out.println("Index position is :" + findIndex5(Stock.Queue05, cuname));
                        //Checking that input name customer exist or not
                        if((findIndex5(Stock.Queue05, cuname)) == -1){
                            System.out.println("\nCustomer does not exist");
                            break;
                        }

                        //removing customer by making a copy of the array
                        String[] Queue05copy = new String[Stock.Queue05.length - 1];
                        for (int y = 0, j = 0; y < Stock.Queue05.length; y++) {
                            if (y != findIndex5(Stock.Queue05, cuname)) {
                                j++;
                                Stock.Queue05[y] = Stock.Queue05[y];
                            } else {
//                                Stock.Queue05[j] = "EMPTY";
                                displayQueue();
                                Stock.Queue05[j] = variable.queue[variable.x];
                                deQueue(variable.queue[variable.x]);
                                displayQueue();
                            }
                            variable.x++;
                        }
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
        //Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        //adding elements of array
        //to ArrayList
        for (String i : arr)
            clist.add(i);

        //returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex2(String arr[], String t) {
        //Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        //adding elements of array
        //to ArrayList
        for (String i : arr)
            clist.add(i);

        //returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex3(String arr[], String t) {
        //Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        //adding elements of array
        //to ArrayList
        for (String i : arr)
            clist.add(i);

        //returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex4(String arr[], String t) {
        //Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        //adding elements of array
        //to ArrayList
        for (String i : arr)
            clist.add(i);

        //returning index of the element
        return clist.indexOf(t);

    }

    public static int findIndex5(String arr[], String t) {
        //Creating ArrayList
        ArrayList<String> clist = new ArrayList<>();

        //adding elements of array
        //to ArrayList
        for (String i : arr)
            clist.add(i);

        //returning index of the element
        return clist.indexOf(t);

    }


    //Check if the queue is empty or not
    boolean isEmptyQueue() {
        if (variable.front == -1)
            return true;
        else
            return false;
    }


    //Implementing the 2 scenarios to check if the queue is full or not
    boolean isFullQueue() {
        if (variable.front == 0 && variable.rear == 6 - 1) {
            return true;
        }
        if (variable.front == variable.rear + 1) {
            return true;
        }
        return false;
    }

    //Adding an element in the queue
    void enQueue(String value) {
        if (isFullQueue()) {
            System.out.println("\nSorry !! Waiting Queue is full... No more Customers could be inserted in it");
        } else {
            //if there is no element in the queue
            if (variable.front == -1)
                variable.front = 0;
            //incrementing the rear position in circular manner using modulo operator
            variable.rear = (variable.rear + 1) % 6;
            //placing the value at the rear position
            variable.queue[variable.rear] = value;
            System.out.println("\nCustomer " + value + " is Entered the Waiting Queue");
        }
    }


    //Deleting the element from the queue
    void deQueue(String value) {
        //checking the queue is empty or not
        if (isEmptyQueue()) {
            System.out.println("\nSorry !!The Waiting Queue is Empty...");
        } else {
            value = variable.queue[variable.front];
            //if there is only one element in the queue
            if (variable.front == variable.rear) {
                variable.front = -1;
                variable.rear = -1;
            } else {
                //Incrementing the front in a circular manner
                variable.front = (variable.front + 1) % 6;
            }
            System.out.println("\nCustomer " + value + " is Removed from the Waiting Queue \nand Added to the Selected Fuel Queue");
        }
    }

    //Displaying the elements of the Circular queue
    void displayQueue() {
        int i;
        if (isEmptyQueue()) {
            System.out.println("\nThe Waiting Queue is Empty...");
        } else {
            System.out.println("\nCustomers of the Waiting Queue :");
            for (i = variable.front; i != variable.rear; i = (i + 1) % 6)
                System.out.print(variable.queue[i] + ", ");
            System.out.println(variable.queue[i]);
        }
    }



}
