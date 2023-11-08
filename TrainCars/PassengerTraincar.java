package TrainCars;
import java.util.Scanner;

public class PassengerTraincar extends Traincar implements Electricalnetwork {
    private int numberofSeats;
    private int numberofPassengers;


    public PassengerTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofSeats, int numberofPassengers) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar);
        this.numberofSeats = numberofSeats;
        this.numberofPassengers = numberofPassengers;
    }

    public int addPass(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter amount of Passengers :");
        numberofPassengers = sc.nextInt();
        if(numberofPassengers<=numberofSeats){
            return numberofPassengers;
        }else{
            System.out.println("Insert exact amount or more passengers!!!");
            return addPass();
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", numberofSeats=" + numberofSeats +
                ", numberofPassengers=" + numberofPassengers;
    }

//    public void Passengercalculations(){
//
//        this.ElectricalNet();
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Name of Passenger traincar :");
//        String nameofTraincar = sc.next();
//
//        System.out.println("Weight of Passenger traincar :");
//        long weightofTraincar= sc.nextLong();
//
//        System.out.println("Capacity of Passenger traincar :");
//        int capacityofTraincar= sc.nextInt();
//
//        System.out.println("enter amount of Seats :");
//        int numberofSeats = sc.nextInt();
//
//        this.toString();
//    }

}
