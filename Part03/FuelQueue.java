package Part03;

import java.util.*;

import static Part03.variable.*;
import static Part03.passenger.*;

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
                    passenger.passenger1();
                    //Incrementing variable a for further add customer
                    a++;
                    //Reducing 10 liters of fuel from total fuel
                    FuelStock.totalfuel = FuelStock.totalfuel - 10;
                    Scanner ask = new Scanner(System.in);
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
                    passenger.passenger2();
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
                Length.Detail_count2++;

            } else if ((c <= a) && (c <= b) && (c <= d) && (c <= e)) {
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; c < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Stock.Queue03[c] = cname;
                    passenger.passenger3();
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
                Length.Detail_count3++;

            } else if ((d <= a) && (d <= b) && (d <= c) && (d <= e)) {
//                Stock.Queue04[i] = Details;
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; d < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Stock.Queue04[d] = cname;
                    passenger.passenger4();
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
                Length.Detail_count2++;

            } else if ((e <= a) && (e <= b) && (e <= c) && (e <= d)) {
//                Stock.Queue05[i] = Details;
                //Asking user to input name of the customer to add
                Scanner cu = new Scanner(System.in);
                for (; e < 6; ) {
                    System.out.print("\nInput customer name:");
                    //Changing the name in to capitals
                    String cname = cu.nextLine().toUpperCase();
                    Stock.Queue05[e] = cname;
                    passenger.passenger5();
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
                Length.Detail_count2++;

            //If all fuel queues are full
            } if ((a >= 6) && (b >= 6) && (c >= 6) && (d >= 6) && (e >= 6)) {
                displayQueue();
                Scanner cq = new Scanner(System.in);
                //Asking for user wants to use waiting queue
                System.out.print("All Queues are Full, do you want to add Customer to Waiting Queue? : ");
                String cqq = cq.next().toUpperCase();
                if(cqq.equalsIgnoreCase("Y")) {
                    //CirQueue que = new CirQueue();
                    Scanner n = new Scanner(System.in);
                    //Asking for user input name to the waiting queue
                    System.out.print("\nInput customer name :");
                    //Adding the customer name to the waiting queue (circular queue)
                    enQueue(n.next());
                    displayQueue();

                }
            }
            break;

        }

    }

//    // Check if the queue is empty or not
    boolean isEmptyQueue() {
        if (front == -1)
            return true;
        else
            return false;
    }


    // Implementing the 2 scenarios to check if the queue is full or not
    boolean isFullQueue() {
        if (front == 0 && rear == 6 - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Adding an element in the queue
    void enQueue(String value) {
        if (isFullQueue()) {
            System.out.println("\nSorry !! Waiting Queue is full... No more Customers could be inserted in it");
        } else {
            // if there is no element in the queue
            if (front == -1)
                front = 0;
            // incrementing the rear position in circular manner using modulo operator
            rear = (rear + 1) % 6;
            //placing the value at the rear position
            queue[rear] = value;
            System.out.println("\nCustomer " + value + " is Entered the Waiting Queue");
        }
    }

    // Deleting the element from the queue
    void deQueue(String value) {
        // checking the queue is empty or not
        if (isEmptyQueue()) {
            System.out.println("\nSorry !!The Waiting Queue is Empty...");
        } else {
            value = queue[front];
            // if there is only one element in the queue
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                // Incrementing the front in a circular manner
                front = (front + 1) % 6;
            }
            System.out.println("\nCustomer " + value + " is Removed from the Waiting Queue");
        }
    }

    // Displaying the elements of the Circular queue
    void displayQueue() {
        int i;
        if (isEmptyQueue()) {
            System.out.println("\nThe Waiting Queue is Empty...");
        } else {
            System.out.println("\nCustomers of the Waiting Queue are :");
            for (i = front; i != rear; i = (i + 1) % 6)
                System.out.print(queue[i] + ", ");
            System.out.println(queue[i]);
        }
    }


}



