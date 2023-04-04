package Part02;


public class VFQ {
    public VFQ(String[] args) {
        System.out.println("-----------------------------------------------------------");
        //Printing All Queues
        System.out.print("Queue 01 : ");
        //Using for loop to access all elements of the queue
        for(int i = 0; i < 6; i++) {
            //If queue element is "EMPTY" it will print " "
            if ((Stock.Queue01[i]).equals("EMPTY")) {
                System.out.print("");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue01[i] + " ");
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
            if ((Stock.Queue02[i]).equals("EMPTY")) {
                System.out.print("");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue02[i] + " ");
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
            if ((Stock.Queue03[i]).equals("EMPTY")) {
                System.out.print("");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue03[i] + " ");
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
            if ((Stock.Queue04[i]).equals("EMPTY")) {
                System.out.print("");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue04[i] + " ");
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
            if ((Stock.Queue05[i]).equals("EMPTY")) {
                System.out.print("");
                //otherwise it'll print queue elements
            } else {
                System.out.print(Stock.Queue05[i] + " ");
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
    }

}
