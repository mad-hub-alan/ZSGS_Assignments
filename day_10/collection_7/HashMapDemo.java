package day_10.collection_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 7. Write a Java program to,
    1. associate the specified value with the specified key in a HashMap.
    2. count the number of key-value (size) mappings in a map.
    3. copy all of the mappings from the specified map to another map.
    4. remove all of the mappings from a map.
    5. check whether a map contains key-value mappings (empty) or not.
    6. get a shallow copy of a HashMap instance.
    7. test if a map contains a mapping for the specified key.
    8. test if a map contains a mapping for the specified value.
    9. create a set view of the mappings contained in a map.
    10. get the value of a specified key in a map.
 */

public class HashMapDemo {
    public static void main(String[] args) {
        
        // creating HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();

        // associate key-value pairs
        System.out.println("\n----------------------------------1---------------------------------\n");
        hashMap.put(1,"Vagamon");
        hashMap.put(2,"Alleppey");
        hashMap.put(3,"Munnar");
        hashMap.put(4,"Varkala");
        hashMap.put(5,"Thekkady");
        hashMap.put(6,"Wayanad");
        
        System.out.println("hashMap : "+hashMap);
        

        // count the number of key-value (size) mappings in a map.
        System.out.println("\n----------------------------------2---------------------------------\n");
        System.out.println("Number of Key-Value pairs in 'hashMap' : "+hashMap.size());
        
        
        // copy all of the mappings to another map
        System.out.println("\n----------------------------------3---------------------------------\n");
        HashMap<Integer,String> copiedMap = new HashMap<>();
        copiedMap.putAll(hashMap);
        System.out.println("copiedMap : "+copiedMap);
        
        
        
        // remove all of the mappings from a map.
        System.out.println("\n----------------------------------4---------------------------------\n");
        System.out.println("Remove All Mappings from 'copiedMap' :");
        copiedMap.clear();
        System.out.println("copiedMap : "+copiedMap);
        
        
        
        // hashMap is empty or not?
        System.out.println("\n----------------------------------5---------------------------------\n");
        System.out.println("hashMap is Empty or not? : "+hashMap.isEmpty());
        System.out.println("copiedMap is Empty or not? : "+copiedMap.isEmpty());
        
        
        
        // get a shallow copy of a HashMap instance
        System.out.println("\n----------------------------------6---------------------------------\n");
        System.out.println("Get shallow copy of hashMap : ");
        HashMap<Integer,String> clonedMap = (HashMap<Integer,String>)hashMap.clone();
        
        System.out.println("HashCode of hashMap : "+hashMap.hashCode());
        System.out.println("hashMap : "+hashMap);
        System.out.println();
        System.out.println("HashCode of clonedMap : "+clonedMap.hashCode());
        System.out.println("clonedMap : "+clonedMap);
        
        
        
        // test if a map contains a mapping for the specified key
        System.out.println("\n----------------------------------7---------------------------------\n");
        System.out.println("Check if hashMap contains key '5' ? : "+hashMap.containsKey(5));
        System.out.println("Check if hashMap contains key '20' ? : "+hashMap.containsKey(20));
        
        
        
        // test if a map contains a mapping for the specified value
        System.out.println("\n----------------------------------8---------------------------------\n");
        System.out.println("Check if hashMap contains value 'Kochin' ? : "+hashMap.containsValue("Kochin"));
        System.out.println("Check if hashMap contains value 'Varkala' ? : "+hashMap.containsValue("Varkala"));
        
        

        // create a set view of the mappings contained in a map
        System.out.println("\n----------------------------------9---------------------------------\n");
        Set<Map.Entry<Integer,String>> entrySet  = hashMap.entrySet();
        System.out.println("Set view : "+entrySet);
        
        
        // get the value of a specified key in a map
        System.out.println("\n----------------------------------10---------------------------------\n");
        System.out.println("Value of key '4' : "+hashMap.get(4));
        System.out.println();
    }
}
