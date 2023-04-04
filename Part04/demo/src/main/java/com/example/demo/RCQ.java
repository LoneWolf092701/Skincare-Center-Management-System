package Part03;

import java.util.*;
import java.util.stream.IntStream;
import Part03.*;
public class RCQ {
    public RCQ(String[] args){
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
                if (Stock.Queue01[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                    //Is there's someone in the position...
                } else {
                    System.out.println("\nCustomer " + Stock.Queue01[(indexno)] + " Removed Successfully");
                    //Customer will be removed and Queue will show "Empty" in that place
//                    Stock.Queue01[(indexno)] = "Empty";
                    displayQueue();
                    Stock.Queue01[indexno] = variable.queue[variable.x];
                    deQueue(variable.queue[variable.x]);
                    displayQueue();
                    variable.x++;
//                    continue;
                }

            } else if (queueNO == 2) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger02[indexno] = "Empty";
                passenger.RLiters2[indexno] = 0;

                if (Stock.Queue02[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue02[(indexno)] + " Removed Successfully");
//                    Stock.Queue02[(indexno)] = "Empty";
                    displayQueue();
                    Stock.Queue02[indexno] = variable.queue[variable.x];
                    deQueue(variable.queue[variable.x]);
                    displayQueue();
                    variable.x++;
//                    continue;
                }

            } else if (queueNO == 3) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger03[indexno] = "Empty";
                passenger.RLiters3[indexno] = 0;

                if (Stock.Queue03[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue03[(indexno)] + " Removed Successfully");
//                    Stock.Queue03[(indexno)] = "Empty";
                    displayQueue();
                    Stock.Queue03[indexno] = variable.queue[variable.x];
                    deQueue(variable.queue[variable.x]);
                    displayQueue();
                    variable.x++;
//                    continue;
                }

            } else if (queueNO == 4) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger04[indexno] = "Empty";
                passenger.RLiters4[indexno] = 0;

                if (Stock.Queue04[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue04[(indexno)] + " Removed Successfully");
//                    Stock.Queue04[(indexno)] = "Empty";
                    displayQueue();
                    Stock.Queue04[indexno] = variable.queue[variable.x];
                    deQueue(variable.queue[variable.x]);
                    displayQueue();
                    variable.x++;
//                    continue;
                }

            } else if (queueNO == 5) {
                Scanner k = new Scanner(System.in);
                System.out.print("Input Position of the customer You Want to Remove :");
                int indexno = k.nextInt() - 1;
                passenger.Passenger05[indexno] = "Empty";
                passenger.RLiters5[indexno] = 0;

                if (Stock.Queue05[(indexno)].equals("EMPTY")) {
                    System.out.println("There's No Customer in That Position");
                } else {
                    System.out.println("\nCustomer " + Stock.Queue05[(indexno)] + " Removed Successfully");
                    displayQueue();
                    Stock.Queue05[indexno] = variable.queue[variable.x];
                    deQueue(variable.queue[variable.x]);
                    displayQueue();
                    variable.x++;
//                    continue;
                }

            } else {
                System.out.println("Queue does not exists");
            }
        //Exception handler
        } catch (Exception e) {
            System.out.println("An Error Occurred");
        }
//        break;

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
