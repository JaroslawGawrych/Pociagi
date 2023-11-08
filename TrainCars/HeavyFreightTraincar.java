package TrainCars;

public class HeavyFreightTraincar extends Traincar {
    private int numberofSosbuttons;
    private int numberofDoors;


    public HeavyFreightTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofSosbuttons, int numberofDoors) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar);
        this.numberofSosbuttons = numberofSosbuttons;
        this.numberofDoors = numberofDoors;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", numberofSosbuttons=" + numberofSosbuttons +
                ", numberofDoors=" + numberofDoors;
    }

    public int generateNumberofSosButton() {

    int number;
    number = (int)(Math.random()*5);

    return number;

    }

    public int generateNumberofSosDoors() {

        int number;
        number = (int)(Math.random()*4);

        return number;

    }

}
