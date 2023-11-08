package TrainCars;



public class RefrigiratingTraincar extends Traincar implements Electricalnetwork {
    private int refrigiratorTemp;
    private int numberofRefrigirators;



    public RefrigiratingTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofRefrigirators) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar);
        this.refrigiratorTemp = generateTemp();
        this.numberofRefrigirators = numberofRefrigirators;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", refrigiratorTemp=" + refrigiratorTemp +
                ", numberofRefrigirators=" + numberofRefrigirators
                ;
    }

    public int generateTemp() {

        int number = 0;
        number = (int)(Math.random()*40);


        return number;

    }
}
