package TrainCars;
public class ToxicTraincar extends Traincar implements ToxicHolder {


    private boolean isPersonelAllowed;
    private boolean isPackagewellPacked;

    public ToxicTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, boolean isPersonelAllowed, boolean isPackagewellPacked) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar);
        this.isPersonelAllowed = isPersonelAllowed;
        this.isPackagewellPacked = isPackagewellPacked;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", isPersonelAllowed=" + isPersonelAllowed +
                ", isPackagewellPacked=" + isPackagewellPacked;
    }
}

