package TrainCars;

import TrainCars.Electricalnetwork;
import TrainCars.Traincar;

import java.util.Scanner;

public class RestaurantTraincar extends Traincar implements Electricalnetwork {
    private int numberofCooks;
    private int numberofTables;


    public RestaurantTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofCooks, int numberofTables) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar);
        this.numberofCooks = numberofCooks;
        this.numberofTables = numberofTables;

    }

    public static int generateNumberofcooks() {

        return  (int) (Math.random() * 10);
    }


    // Number of cooks must be thesame asnumber of tables
        //zrobic tak aby math randomowalo najpierw numer kucharzy i potem tzeba wpisac numer stolika taki sam jak numer kucharzy


    @Override
    public String toString() {
        return super.toString() +
                ", numberofCooks=" + numberofCooks +
                ", numberofTables=" + numberofTables ;
    }




}
