package TrainCars;


public class GasTraincar extends FreightTraincar {
    private double toxicGasBottleAmmount;
    private int ventAmmount;


    public GasTraincar(String nameofTraincar, long weightofTraincar, double capacityofTraincar, int numberofCargoharness, int numberofFirealarms) {
        super(nameofTraincar, weightofTraincar, capacityofTraincar, numberofCargoharness, numberofFirealarms);
        this.toxicGasBottleAmmount = generateNumberofToxicBottles();
        this.ventAmmount = generateNumberofvents();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", toxicGasBottleAmmount=" + toxicGasBottleAmmount +
                ", ventAmmount=" + ventAmmount ;
    }

//    public static GasTraincar GasCalculatons() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Name of Gas traincar :");
//        String nameofTraincar = sc.next();
//
//        System.out.println("Weight of Gas traincar :");
//        long weightofTraincar= sc.nextLong();
//
//        System.out.println("Capacity of Gas traincar :");
//        double capacityofTraincar= sc.nextDouble();
//
//        System.out.println("Number of Cargoharness :");
//        int numberofCargoharness = sc.nextInt();
//
//        System.out.println("Number of Firealarms :");
//        int numberofFirealarms= sc.nextInt();
//
//        double toxicGasBottleAmmount;
//
//
//        int ventAmmount;
//
//        GasTraincar gasTraincar = new GasTraincar(nameofTraincar,weightofTraincar,capacityofTraincar,numberofCargoharness,numberofFirealarms);
//        System.out.println(gasTraincar.toString());
//
//        return gasTraincar;
//    }
    public int generateNumberofvents() {

        int number;
        number = (int)(Math.random()*10);

        return number;

    }
    public int generateNumberofToxicBottles() {

        int number;
        number = (int)(Math.random()*600);

        return number;

    }


}
