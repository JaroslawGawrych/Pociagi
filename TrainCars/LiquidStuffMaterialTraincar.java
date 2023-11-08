package TrainCars;


public class LiquidStuffMaterialTraincar extends FreightTraincar implements LiquidHolder {
    private int flammableLiquidamount;
    private int maxCapacityofLiquid;

    public LiquidStuffMaterialTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofCargoharness, int numberofFirealarms, int flammableLiquidamount, int maxCapacityofLiquid) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar, numberofCargoharness, numberofFirealarms);
        this.flammableLiquidamount = flammableLiquidamount;
        this.maxCapacityofLiquid = maxCapacityofLiquid;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", flammableLiquidamount=" + flammableLiquidamount +
                ", maxCapacityofLiquid=" + maxCapacityofLiquid ;
    }
}
