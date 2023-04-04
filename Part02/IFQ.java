package Part02;

public class IFQ {
    public IFQ(String[] args){
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
    }
}
