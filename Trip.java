import java.util.*;

import static java.lang.Thread.sleep;

public class Trip {
    public Station start;
    public Station end;
    public Locomotive locomotive;

    public ArrayList<Station> route = new ArrayList<>();

    public Trip(Locomotive locomotive){
        start = locomotive.start;
        end = locomotive.end;
        this.locomotive = locomotive;
        findPath();
    }


    public void findPath() {
        Set<Station> visited = new HashSet<>();
        ArrayList<Station> path = new ArrayList<>();
        if (dfs(start, end, visited, path)) {
            route = path;
        }
    }

    private boolean dfs(Station station, Station end, Set<Station> visited, List<Station> path) {
        visited.add(station);
        path.add(station);
        if (station == end) {
            return true;
        }
        for (Station connection : station.connections) {
            if (!visited.contains(connection)) {
                if (dfs(connection, end, visited, path)) {
                    return true;
                }
            }
        }
        path.remove(path.size() - 1);
        return false;
    }
    public void printRoute(){
        for (Station s :
                route) {
            System.out.print(s + " ");
        }
        System.out.println();
    }




    public void start(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Trip.this.run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }


    public void run() throws InterruptedException {
        double dist = 0;
        for (int i = 1; i <route.size() ; i++) {
            Station tmp = route.get(i-1);
            for (int j = 0; j < tmp.connections.size(); j++) {
                if (route.get(i).name.equals(tmp.connections.get(j).name)) {
                    dist = tmp.distances.get(j);
                    break;
                }
            }
            double droga = 0;
            while (droga<dist) {
                System.out.println(locomotive.nameOfLocomotive + " " + (int)((droga/dist)*100) + "%");
                sleep(1000);
                droga+=locomotive.speed; //droga w metrach, predkosc w m/s
                locomotive.accel();
                System.out.println(locomotive.nameOfLocomotive + " " +locomotive.speed);


            }
            locomotive.speed = 1;
            System.out.println(locomotive.nameOfLocomotive + " 100% dojechała do: " + route.get(i));
            sleep(2000);


        }
        System.out.println("koniec trasy " + locomotive.nameOfLocomotive);
    }
}
