import TrainCars.FreightTraincar;
import TrainCars.Traincar;

/**
 * todo
 *  1. zrobić wyjątki odpowiednio te które są wymagane
 *  2. sprawdzic czy wszystkie wagony maja odpowiednie metody, pola, konstruktory i toString()
 *  3. skończyć menu!!
 *    Trip trip = new Trip(l1);
 *         trip.printRoute();
 *         to wrzucic do switcha w przypadku wybrania opcji rozpocznij podroz
 *         i usunąć connections between stations
 *
 */

public class Main {
    public static void main(String[] args) {
//        MenuPrint.printingMenu();
        Station station1 = new Station("aaa");
        Station station2 = new Station("bbb", station1, 5.5);
        Station station3 = new Station("ccc", station2, 7.1);
        Station station4 = new Station("ddd", station2, 2.9);
        Station station5 = new Station("eee", station4, 3.9);

        Traincar t1 = new FreightTraincar("t1", 200,3,5,5);
        Traincar t2 = new FreightTraincar("t2", 200,3,5,5);
        Traincar t3 = new FreightTraincar("t3", 200,3,5,5);
        Traincar t4 = new FreightTraincar("t4", 200,3,5,5);

        Locomotive l1 = new Locomotive("loco", 1,400, 3,station1,station4,station3);
        Locomotive l2 = new Locomotive("pociag", 4,1200, 3, station5, station1, station5);

        l1.buildTrain(t1);
        l1.buildTrain(t2);
        l1.buildTrain(t3);
        l1.buildTrain(t4);

        l2.buildTrain(t1);
        l2.buildTrain(t2);
        l2.buildTrain(t3);
        l2.buildTrain(t4);

        Trip trip = new Trip(l1);
        trip.printRoute();
        Trip trip2 = new Trip(l2);
        trip2.printRoute();

        trip2.findPath();
        trip2.printRoute();
        trip.start();
        trip2.start();


    }
}
