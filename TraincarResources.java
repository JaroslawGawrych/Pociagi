import TrainCars.*;

import java.util.ArrayList;
import java.util.Scanner;

public class TraincarResources {
    public static ArrayList<Traincar> traincars = new ArrayList<>();

    public static void print(){
        for (Traincar t :
                traincars) {
            System.out.println(t);
        }
    }
    public static void Traincarstuff() {
            /*(bedzie 12 caseow bo jest 12 wagonow)case zrobic jaki chce wagon wybrac jak wybiore wagon to 2 elementy unikatowe z wagonu uzywam
         i dalej mam opcje dodania innych wagonów do lokomotywy na koniec dac to string zeby odczytalo wynik koncowy
         2. klasa locomotiveresources jedna bedzie odpowiadać jednemu rodzajowi wagonu dla kazdego rodzaju wagnou kolejny case i zrobic
         kroki jak w lokomotywie*/

        Scanner scanning = new Scanner(System.in);

        int x;
        boolean check = true;
        do {
            System.out.print("[頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁]\n" +
                    "[頁]*[1] Explosives TrainCar\t\t\t\t[頁]\n" +
                    "[頁]*[2] Freight TrainCar\t\t\t\t\t[頁]\n" +
                    "[頁]*[3] Gas TrainCars\t\t\t\t\t\t[頁]\n" +
                    "[頁]*[4] Heavy Freight TrainCar\t\t\t\t[頁]\n" +
                    "[頁]*[5] Liquid Stuff Material TrainCar\t\t[頁]\n" +
                    "[頁]*[6] Liquid Toxic TrainCar\t\t\t\t[頁]\n" +
                    "[頁]*[7] Mail TrainCar\t\t\t\t\t\t[頁]\n" +
                    "[頁]*[8] Passenger TrainCar\t\t\t\t\t[頁]\n" +
                    "[頁]*[9] Refrigirating TrainCar\t\t\t\t[頁]\n" +
                    "[頁]*[10] Restaurant TrainCar\t\t\t\t[頁]\n" +
                    "[頁]*[11] Toxic TrainCar \t\t\t\t\t[頁]\n" +
                    "[頁]*[12] Mail Lagguage TrainCar\t\t\t[頁]\n" +
                    "[頁]*[13] EXIT\t\t\t\t\t\t\t\t[頁]\n" +
                    "[頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁][頁]\n");
            System.out.println("Enter numer between 1-8");
            x = scanning.nextInt();
            switch (x) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("name: ");
                    String name = scanner.nextLine();

                    System.out.println("weight: ");
                    long weight = scanner.nextLong();

                    System.out.println("capacity: ");
                    double capacity = scanner.nextDouble();

                    System.out.println("sosbuttons: ");
                    int sosbuttons = scanner.nextInt();

                    System.out.println("doors: ");
                    int doors = scanner.nextInt();

                    System.out.println("tnt: ");
                    int tnt = scanner.nextInt();

                    System.out.println("crates: ");
                    int crates = scanner.nextInt();
                    while(crates<tnt) {
                        System.out.println("crates: ");
                        crates = scanner.nextInt();
                    }

                    Traincar tmp = new ExplosivesTraincar(name, weight, capacity, sosbuttons, doors, tnt, crates);
                    traincars.add(tmp);
                    print();
                    break;
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner2.nextLine();

                    System.out.println("weight: ");
                    weight = scanner2.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner2.nextDouble();

                    System.out.println("harness: ");
                    int harness = scanner2.nextInt();

                    System.out.println("alarms: ");
                    int alarms = scanner2.nextInt();

                    tmp = new FreightTraincar(name, weight, capacity, harness, alarms);
                    traincars.add(tmp);
                    print();
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner3.nextLine();

                    System.out.println("weight: ");
                    weight = scanner3.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner3.nextDouble();

                    System.out.println("harness: ");
                    harness = scanner3.nextInt();

                    System.out.println("alarms: ");
                    alarms = scanner3.nextInt();

                    tmp = new GasTraincar(name, weight, capacity, harness, alarms);
                    traincars.add(tmp);
                    print();
                    break;
                case 4:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner4.nextLine();

                    System.out.println("weight: ");
                    weight = scanner4.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner4.nextDouble();

                    System.out.println("sosbuttons: ");
                    sosbuttons = scanner4.nextInt();

                    System.out.println("doors: ");
                    doors = scanner4.nextInt();
                    tmp = new HeavyFreightTraincar(name, weight, capacity, sosbuttons, doors);
                    traincars.add(tmp);
                    print();
                    break;
                case 5:
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner5.nextLine();

                    System.out.println("weight: ");
                    weight = scanner5.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner5.nextDouble();

                    System.out.println("harness: ");
                    harness = scanner5.nextInt();

                    System.out.println("alarms: ");
                    alarms = scanner5.nextInt();
                    System.out.println("flammableAmount: ");
                    int flammableAmount = scanner5.nextInt();
                    System.out.println("maxCapacity: ");
                    int maxCapacity = scanner5.nextInt();

                    tmp = new LiquidStuffMaterialTraincar(name, weight, capacity, harness, alarms, flammableAmount, maxCapacity);
                    traincars.add(tmp);
                    print();
                    break;

                case 6:
                    Scanner scanner6 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner6.nextLine();

                    System.out.println("weight: ");
                    weight = scanner6.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner6.nextDouble();

                    System.out.println("harness: ");
                    harness = scanner6.nextInt();

                    System.out.println("alarms: ");
                    alarms = scanner6.nextInt();
                    System.out.println("maxToxic: ");
                    int maxToxic = scanner6.nextInt();
                    System.out.println("toxicAmount: ");
                    int toxicAmount = scanner6.nextInt();

                    tmp = new LiquidToxicTraincar(name, weight, capacity, harness, alarms, maxToxic, toxicAmount);
                    traincars.add(tmp);
                    print();
                    break;
                case 7:
                    Scanner scanner7 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner7.nextLine();

                    System.out.println("weight: ");
                    weight = scanner7.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner7.nextDouble();

                    System.out.println("packages: ");
                    int packages = scanner7.nextInt();

                    System.out.println("heavyPackages: ");
                    int heavyPackages = scanner7.nextInt();

                    tmp = new MailTraincar(name, weight, capacity, packages, heavyPackages);
                    traincars.add(tmp);
                    print();
                    break;
                case 8:
                    Scanner scanner8 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner8.nextLine();

                    System.out.println("weight: ");
                    weight = scanner8.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner8.nextDouble();

                    System.out.println("seats: ");
                    int seats = scanner8.nextInt();

                    System.out.println("passengers: ");
                    int passengers = scanner8.nextInt();

                    tmp = new PassengerTraincar(name, weight, capacity, seats, passengers);
                    traincars.add(tmp);
                    print();
                    break;
                case 9:
                    Scanner scanner9 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner9.nextLine();

                    System.out.println("weight: ");
                    weight = scanner9.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner9.nextDouble();

                    System.out.println("refrigirators: ");
                    int refrigirators = scanner9.nextInt();
                    tmp = new RefrigiratingTraincar(name, weight, capacity, refrigirators);
                    traincars.add(tmp);
                    print();
                    break;
                case 10:
                    Scanner scanner10 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner10.nextLine();

                    System.out.println("weight: ");
                    weight = scanner10.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner10.nextDouble();

                    int cooks = RestaurantTraincar.generateNumberofcooks();


                    System.out.println("tables: ");
                    int tables = scanner10.nextInt();
                    if(tables<cooks){
                        System.out.println("tables: ");
                        tables = scanner10.nextInt();
                    }

                    tmp = new RestaurantTraincar(name, weight, capacity,cooks, tables);
                    traincars.add(tmp);
                    print();
                    break;
                case 11:
                    Scanner scanner11 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner11.nextLine();

                    System.out.println("weight: ");
                    weight = scanner11.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner11.nextDouble();

                    System.out.println("personel allowed? (true/false): ");
                    boolean allowed = scanner11.nextBoolean();
                    System.out.println("well packed? (true/false): ");
                    boolean packed = scanner11.nextBoolean();
                    tmp = new ToxicTraincar(name, weight, capacity, allowed, packed);
                    traincars.add(tmp);
                    print();
                    break;
                case 12:
                    Scanner scanner12 = new Scanner(System.in);
                    System.out.println("name: ");
                    name = scanner12.nextLine();

                    System.out.println("weight: ");
                    weight = scanner12.nextLong();

                    System.out.println("capacity: ");
                    capacity = scanner12.nextDouble();
                    tmp = new MailLagguageTraincar(name, weight, capacity);
                    traincars.add(tmp);
                    print();
                    break;

                case 13:
                    MenuPrint.printingMenu();
                    check = false;
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }
        } while(check);

            scanning.close();

        }
    }

