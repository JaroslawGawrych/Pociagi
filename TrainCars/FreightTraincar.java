package TrainCars;

import java.util.Scanner;

public class FreightTraincar extends Traincar {
    private int numberofCargoharness;
    private int numberofFirealarms;

    public FreightTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofCargoharness, int numberofFirealarms) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar);
        this.numberofCargoharness = numberofCargoharness;
        this.numberofFirealarms = numberofFirealarms;

    }

    @Override
    public String toString() {
        return  super.toString() +
                ", numberofCargoharness=" + numberofCargoharness +
                ", numberofFirealarms=" + numberofFirealarms;
    }
//    public static FreightTraincar FreightCalculations() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("name of Freight traincar :");
//        String nameofTraincar = sc.next();
//
//        System.out.println("Weight of traincar :");
//        long weightofTraincar= sc.nextLong();
//
//        System.out.println("Capacity of traincar :");
//        double capacityofTraincar= sc.nextDouble();
//
//        System.out.println("Number of cargo harness :");
//        int numberofCargoharness = sc.nextInt();
//
//        System.out.println("Number of fire alarms :");
//        int numberofFirealarms = sc.nextInt();
//
//        System.out.println();
//        FreightTraincar frghtTraincar = new FreightTraincar(nameofTraincar,weightofTraincar,capacityofTraincar,numberofCargoharness,numberofFirealarms);
//        System.out.println(frghtTraincar.toString());
//
//        return frghtTraincar;
//    }
}
