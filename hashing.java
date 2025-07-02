import java.util.*;
public class hashing {
    public static void main(String[] args) {
        int[] arr= {10,5,10,15,10,5};
        Hash1 hs= new Hash1();
        hs.freq(arr);
    }
}

class Hash1{
    // Given an array, we have to found the number of occurrences of each element in the array.
    void freq(int[] arr){
        HashMap <Integer, Integer> map= new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int key= arr[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // method 1
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // method 2
        for(var entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
