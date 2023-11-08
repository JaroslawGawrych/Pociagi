import TrainCars.Traincar;

import java.util.ArrayList;

public class Locomotive {
    public String nameOfLocomotive;
    private int maxTraincarNumber;

    public double speed ;
    public ArrayList<Traincar> traincars = new ArrayList<>();
    private double maxWeightOfTraincars;
    private int maxNumbWithEle;
    public double wagaAktualna;
    public static int num = 0;
    public int id ;

    public Station start;
    public Station end;
    public Station mother;
    public Locomotive(String nameOfLocomotive, int maxTraincarNumber, double maxWeightOfTraincars, int maxNumbWithEle, Station start, Station end, Station mother) {
        this.nameOfLocomotive = nameOfLocomotive;
        this.maxTraincarNumber = maxTraincarNumber;
        this.maxWeightOfTraincars = maxWeightOfTraincars;
        this.maxNumbWithEle = maxNumbWithEle;
        this.start = start;
        this.end = end;
        this.mother = mother;
        speed = 1;
        traincars = new ArrayList<>();
        id = num;
        num++;
    }

    public void buildTrain(Traincar traincar) {

        boolean check = true;

        if(traincars.size()+1 > maxTraincarNumber)

            try {
                throw new TooManyTraincars("za dużo wagonów!");
            } catch (TooManyTraincars e) {
//                throw new RuntimeException(e);
                check = false;
                System.out.println(e.getMessage());
//                MenuPrint.printingMenu();//wyswietla menu glowne
                // @todo tutaj piszesz co jesli jest błąd (cos w stylu powrot do menu głównego)
            }
        if(wagaAktualna+traincar.weightofTraincar>maxWeightOfTraincars){
            try {
                throw new TooHeavy("za ciężki");
            } catch (TooHeavy e) {
//                throw new RuntimeException(e);
                check = false;
                System.out.println(e.getMessage());
//                MenuPrint.printingMenu();//wyswietla menu glowne
                // @todo tutaj piszesz co jesli jest błąd (cos w stylu powrot do menu głównego)
            }
        }
// @todo tu napisz kod błędu, że za dużo elektrycznych wagonów
        if(check) {
            traincars.add(traincar);
            wagaAktualna+= traincar.weightofTraincar;
        //@todo zrobi pole aktualne elektryczne i dodac 1 do nich
        }


    }

    public void accel(){
        //losuje czy przyspiesza czy zwalnia
        int rand = (int)(Math.random()*10);
        if(rand%2 == 0)
            speed*=1.03;
        else
            speed/=1.03;
    }


    @Override
    public String toString() {
        return "Locomotive{" +
                "nameOfLocomotive='" + nameOfLocomotive + '\'' +
                ", maxTraincarNumber=" + maxTraincarNumber +
                ", speed=" + speed +
                ", traincars=" + traincars +
                ", maxWeightOfTraincars=" + maxWeightOfTraincars +
                ", maxNumbWithEle=" + maxNumbWithEle +
                ", id=" + id +
                ", start=" + start +
                ", end=" + end +
                ", mother=" + mother +
                '}';
    }
}
