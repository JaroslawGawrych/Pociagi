package TrainCars;

public abstract class Traincar {
    private String nameofTraincar;
    public long weightofTraincar;
    private double capacityofTraincar;

    private static int number = 0;

    private int id;

    public Traincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar) {
        this.nameofTraincar = nameofTraincar;
        this.weightofTraincar = weightofTraincar;
        this.capacityofTraincar = capacityofTraincar;
        id = number;
        number++;
    }

    @Override
    public String toString() {
        return this.getClass() +
                ": nameofTraincar='" + nameofTraincar + '\'' +
                ", weightofTraincar=" + weightofTraincar +
                ", capacityofTraincar=" + capacityofTraincar +
                ", id=" + id;
    }
}

