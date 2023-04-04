package Part03;
import Part03.Stock;
import Part03.FuelStock;
import java.util.*;

public class AFS {
    public static int addfuel;
    public AFS(String[] args){
        //Adding fuel stock
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Fuel Stock (in Liters) you want to add :");
        addfuel = a.nextInt();
        FuelStock.totalfuel = FuelStock.totalfuel + addfuel;
        System.out.println("Remaining Total Fuel (in Liters) is :" + FuelStock.totalfuel);

    }
}
