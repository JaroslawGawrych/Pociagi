package TrainCars;

import java.util.Scanner;

public class ExplosivesTraincar extends HeavyFreightTraincar {
    private int ammountofTnt;
    private int ammountofCrates;//podane tnt musi sie miescic w pudlach np na 1 pudlo przypada 10 tnt

    public ExplosivesTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofSosbuttons, int numberofDoors, int ammountofTnt, int ammountofCrates) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar, numberofSosbuttons, numberofDoors);
        this.ammountofTnt = ammountofTnt;
        this.ammountofCrates = ammountofCrates;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ammountofTnt=" + ammountofTnt +
                ", ammountofCrates=" + ammountofCrates;
    }
    //    public static ExplosivesTraincar ExplosivesCalculations() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Name of Explosives traincar :");
//        String nameofTraincar = sc.next();
//
//        System.out.println("Weight of Explosives traincar :");
//        long weightofTraincar= sc.nextLong();
//
//
//        System.out.println("Capacity of Explosives traincar :");
//        double capacityofTraincar= sc.nextDouble();
//
//
//
//
//        int ammountofCrates;
//
//
//        int ammountofTnt;
//
//        do{
//            System.out.println("Amount of tnt :");
//            ammountofTnt=sc.nextInt();
//
//
//            System.out.println("Remember to put exact amount or more of Crates!");
//
//            System.out.println("Amount of Crates :");
//            ammountofCrates=sc.nextInt();
//
//
//
//        }while(ammountofCrates>ammountofTnt);
//
//
//        ExplosivesTraincar exploTraincar = new ExplosivesTraincar(nameofTraincar,weightofTraincar,capacityofTraincar,ammountofTnt,ammountofCrates);
//        System.out.println(exploTraincar.toString());
//
//        return exploTraincar;
//        }


    }


