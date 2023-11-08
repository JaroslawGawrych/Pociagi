package TrainCars;

import java.sql.SQLOutput;

public interface Electricalnetwork {
    int electricvoltagemin = 24;
    int electricvoltagemax = 110;

    public default void ElectricalNet() {
        int a = (int)(Math.random()*110);
        if(a>54){

            System.out.println("Electrical voltage max = "+electricvoltagemax+"V");
        }else{

            System.out.println("Electrical voltage min = "+electricvoltagemin+"V");
        }

    }


}
