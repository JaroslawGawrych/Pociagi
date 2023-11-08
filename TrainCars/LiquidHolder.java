package TrainCars;

import java.util.Scanner;

public interface LiquidHolder {
    public default void todo(){
        System.out.println("liquid");
    }
//    public static LiquidStuffMaterialTraincar LiquidCalculations() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Name of Liquid stuff traincar :");
//        String nameofTraincar = sc.next();
//
//        System.out.println("Weight of liquid stuff traincar :");
//        long weightofTraincar= sc.nextLong();
//
//
//        System.out.println("Capacity of liquid stuff traincar :");
//        double capacityofTraincar= sc.nextDouble();
//
//        int maxCapacityofLiquid;
//
//        int flammableLiquidamount;
//
//
//
//
//        do{
//            System.out.println("Amount of flammable liquid :");
//            flammableLiquidamount=sc.nextInt();
//
//
//            System.out.println("Capacity of liquid must be bigger than amount!");
//
//            System.out.println("Capacity of liquid :");
//            maxCapacityofLiquid=sc.nextInt();
//
//
//
//        }while(flammableLiquidamount<maxCapacityofLiquid);
//
//
//        return liqstuffTraincar;
//    }
}
