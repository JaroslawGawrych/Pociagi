
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Station {
    public String name;
    public static ArrayList<Station> allStations = new ArrayList<>();
    public ArrayList<Station> connections = new ArrayList<>();
    public ArrayList<Double> distances = new ArrayList<>();
    public Station(String name, Station station, Double distance){
        this.name = name;
        connections.add(station);
        distances.add(distance);
        station.connections.add(this);
        station.distances.add(distance);
        allStations.add(this);
    }

    public Station(String name){
        this.name = name;
        allStations.add(this);
    }
    @Override
    public String toString() {
        return name;
    }
}
