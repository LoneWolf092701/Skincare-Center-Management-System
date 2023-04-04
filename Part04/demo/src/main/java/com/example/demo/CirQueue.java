package Part03;
import java.io.*;
import java.util.*;
import Part03.*;


//Draft circular queue (not in use)

public class CirQueue {
    // Defining the size of Circular Queue
//    int static SIZE = 6;
    static int front;
    static int rear;
    static String[] queue = new String[6];

    //creating the constructor of the above class
    CirQueue() {
        front = -1;
        rear = -1;
    }

    // Implementing the 2 scenarios to check if the queue is full or not
    static boolean isFullQueue() {
        if (front == 0 && rear == 6 - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty or not
    static boolean isEmptyQueue() {
        if (front == -1)
            return true;
        else
            return false;
    }

    // Adding an element in the queue
    static void enQueue(String value) {
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
    static void deQueue(String value) {
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
    static void displayQueue() {
        int i;
        if (isEmptyQueue()) {
            System.out.println("\nSorry!! The Waiting Queue is Empty...");
        } else {
//            System.out.println("Customer in Front :  " + front);
            System.out.println("\nCustomers of the Waiting Queue :");
            for (i = front; i != rear; i = (i + 1) % 6)
                System.out.print(queue[i] + " ");
            System.out.println(queue[i]);
//            System.out.println("Last Customer : " + rear);
        }
    }

    // Main function to drive the code
    public CirQueue(String[] args) {
        // creating the object of the class to call the methods
        if ((variable.a >= 6) && (variable.b >= 6) && (variable.c >= 6) && (variable.d >= 6) && (variable.e >= 6)) {
            Scanner cq = new Scanner(System.in);
            System.out.print("\nAll Queue is Full, do you want to add Customer to Waiting Queue? : ");
            String cqq = cq.next().toUpperCase();
            if(cqq.equalsIgnoreCase("Y")) {
                Scanner how = new Scanner(System.in);
                System.out.print("\nHow many customers you want to add to waiting queue? : ");
                int many = how.nextInt();
                CirQueue que = new CirQueue();

/*
                    if (many < 6) {
                        for (; variable.cirqueue <= many; ) {
*/
                Scanner n = new Scanner(System.in);
                System.out.print("\nInput customer name :");
                que.enQueue(n.next());
//                        }
//                    } else {
                System.out.println("\nOnly 6 Customers can be in Waiting Queue");
//                    }

                displayQueue();
            }
        }

    }

}


