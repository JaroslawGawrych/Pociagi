package TrainCars;

import TrainCars.Traincar;

import java.util.Scanner;

public class MailTraincar extends Traincar implements Electricalnetwork, MailHolder {
    private int numberofPackages;
    private int numberofHeavyPackages;

    public MailTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofPackages, int numberofHeavyPackages) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar);
        this.numberofPackages = numberofPackages;
        this.numberofHeavyPackages = numberofHeavyPackages;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberofPackages=" + numberofPackages +
                ", numberofHeavyPackages=" + numberofHeavyPackages;
    }

//    public static MailTraincar MailCalculations() {
//
//        Electricalnetwork.ElectricalNet();
//
//        System.out.println("\n");
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Name of Mail traincar :");
//        String nameofTraincar = sc.next();
//
//        System.out.println("Weight of Mail traincar :");
//        long weightofTraincar= sc.nextLong();
//
//        System.out.println("Capacity of Mail traincar :");
//        int capacityofTraincar= sc.nextInt();
//
//        int numberofHeavyPackages;
//
//        int numberofPackages;
//
//        int number;
//        do{
//            System.out.println("Number of Heavy Packages :");
//            numberofHeavyPackages=sc.nextInt();
//
//
//            System.out.println("Number of Packages :");
//            numberofPackages=sc.nextInt();
//
//            number = numberofHeavyPackages+numberofPackages;
//
//            System.out.println("Capacity must be greater than Complex of packages!");
//
//        }while(number < capacityofTraincar);//DO POPRAWY !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//        MailTraincar mailTraincar = new MailTraincar(nameofTraincar,weightofTraincar,capacityofTraincar,numberofPackages,numberofHeavyPackages);
//        System.out.println(mailTraincar.toString());
//    return mailTraincar;
//    }

}
