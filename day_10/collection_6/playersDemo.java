package day_10.collection_6;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeMap;

/*
 6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
 */

public class playersDemo {
    public static void main(String[] args) {
        
        // creating players
        TreeMap<Integer,String> players = new TreeMap<>();

        // associate key-value pairs
        System.out.println("\n----------------------------------1---------------------------------\n");
        players.put(18,"Virat Kohli");
        players.put(63,"Jasprit Bumrah");
        players.put(17,"AB Devilliers");
        players.put(4,"Viv Richards");
        players.put(66,"Joe Root");
        players.put(10,"Sachin Tendulkar");
        players.put(1,"KL Rahul");
        
        System.out.println("players : "+players);


        // copy a Tree Map content to another Tree Map.
        System.out.println("\n----------------------------------2---------------------------------\n");
        System.out.println("Copying players : \n");
        TreeMap<Integer,String> copiedMap = new TreeMap<>();
        copiedMap.putAll(players);
        System.out.println("copiedMap : "+copiedMap);
        
        
        // search a key in a Tree Map        
        System.out.println("\n----------------------------------3---------------------------------\n");
        System.out.println("Search a key in a Tree Map : \n");
        System.out.println("Contains key '4'? : "+players.containsKey(4));
        


        
        // search a value in a Tree Map 
        System.out.println("\n----------------------------------4---------------------------------\n");
        System.out.println("Search a Value in a Tree Map : \n");
        System.out.println("Contains Value 'Jasprit Bumrah'? : "+players.containsValue("Jasprit Bumrah"));
        
        
        
        
        // get all keys from the given a Tree Map
        System.out.println("\n----------------------------------5---------------------------------\n");
        System.out.println("Get all keys from the given a Tree Map : \n");
        System.out.println("Keys in players : "+players.keySet());
        
        
        // copying players 
        TreeMap<Integer,String> tempTreeMap = new TreeMap<>();
        tempTreeMap.putAll(players);
        
        
        
        // delete all elements from a given Tree Map
        System.out.println("\n----------------------------------6---------------------------------\n");
        System.out.println("Delete all elements from a given Tree Map : \n");
        tempTreeMap.clear();
        System.out.println("tempTreeMap : "+tempTreeMap);
        
        
        
        // sort keys in Tree Map by using comparator
        System.out.println("\n----------------------------------7---------------------------------\n");
        System.out.println("Sort keys in Tree Map by using comparator : \n");
        
        TreeMap<Integer,String> sortedTreeMap = new TreeMap<Integer,String>(Comparator.reverseOrder());
        sortedTreeMap.putAll(players);
        System.out.println("sortedTreeMap : "+sortedTreeMap);
        
        
        
        // get a key-value mapping associated with the greatest key and the least key in a map
        System.out.println("\n----------------------------------8---------------------------------\n");
        System.out.println("Get greatest and least key of sortedTreeMap : \n");
        System.out.println("Greatest key : "+sortedTreeMap.firstKey());
        System.out.println("Least key : "+sortedTreeMap.lastKey());
        
        
        
        //  get the first (lowest) key and the last (highest) key currently in a map
        System.out.println("\n----------------------------------9---------------------------------\n");
        System.out.println("Get lowest and highest key of players : \n");
        System.out.println("lowest key : "+players.firstKey());
        System.out.println("highest key : "+players.lastKey());
        
        
        
        //  get a reverse order view of the keys contained in a given map
        System.out.println("\n----------------------------------10---------------------------------\n");
        System.out.println("Reverse order view of the keys of 'players' : \n");

        NavigableSet<Integer> reversedKeySet = players.descendingKeySet();

        System.out.println("Reversed keySet : "+reversedKeySet);

    }
}
