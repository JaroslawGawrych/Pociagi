import TrainCars.Traincar;

import java.util.ArrayList;
import java.util.Scanner;

public class LocomotiveResources {
    public static ArrayList<Locomotive > locomotives = new ArrayList<>();
    public static void print(){
        for (Locomotive l :
                locomotives) {
            System.out.println(l);
        }
    }
    public static void Locomotivestuff() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Name of Locomotive :");
            String nameOfLocomotive = sc.next();

        System.out.println("maximum number of TrainCars :");
        int maxTraincarNumber = sc.nextInt();

        System.out.println("maximum weight of Traincars :");
        double maxWeightOfTraincars = sc.nextDouble();


        System.out.println("maximum number of Traincars requiring connection to the electrical network :");
        int maxNumbWithEle = sc.nextInt();

//        locomotives.add(new Locomotive(nameOfLocomotive, maxTraincarNumber, maxWeightOfTraincars, maxNumbWithEle));
//        @TODO dodac tutaj pytanie o stacje poczatkowa, koncowa, i maciezysta, i dodac do konstruktora

    }
}
