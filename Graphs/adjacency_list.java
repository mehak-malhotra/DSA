import java.util.*;

class Pair <K, V>{
    K key;
    V value;

    Pair(K key, V value){
        this.key= key;
        this.value= value;
    }
}

public class adjacency_list {
    static ArrayList <ArrayList<Pair <Integer, Integer>>> arr= new ArrayList<>();
    public static void main(String[] args) {
        int n=4;

        for(int i=0; i<n; i++){
            arr.add(new ArrayList<>());
        }

        arr.get(0).add(new Pair<>(1, 1440));
        arr.get(0).add(new Pair<>(3, 1530));
        arr.get(1).add(new Pair<>(0, 1440));
        arr.get(1).add(new Pair<>(2, 1230));
        arr.get(2).add(new Pair<>(1, 1230));
        arr.get(2).add(new Pair<>(3, 1650));
        arr.get(3).add(new Pair<>(0, 1530));
        arr.get(3).add(new Pair<>(2, 1650));
    }

    static void addNode(){
        arr.add(new ArrayList<>());
    }

    static void addEdge(int s, int d, int dist){
        arr.get(s).add(new Pair<>(d, dist));
        arr.get(d).add(new Pair<>(s, dist));
    }
}
