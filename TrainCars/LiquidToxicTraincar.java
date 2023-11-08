package TrainCars;
public class LiquidToxicTraincar extends HeavyFreightTraincar implements ToxicHolder, LiquidHolder{//NA KONIEC

    private int maxammountofToxicliqd;
    private int ammountofToxicliqd;

    public LiquidToxicTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofSosbuttons, int numberofDoors, int maxammountofToxicliqd, int ammountofToxicliqd) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar, numberofSosbuttons, numberofDoors);
        this.maxammountofToxicliqd = maxammountofToxicliqd;
        this.ammountofToxicliqd = ammountofToxicliqd;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", maxammountofToxicliqd=" + maxammountofToxicliqd +
                ", ammountofToxicliqd=" + ammountofToxicliqd;
    }



}
