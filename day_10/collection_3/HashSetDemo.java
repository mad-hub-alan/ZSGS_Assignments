package day_10.collection_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import javax.xml.transform.stream.StreamSource;

/*
 3. Write a Java program to,
    a. append the specified element to the end of a hash set.
    b. iterate through all elements in a hash list.
    c. get the number of elements in a hash set.
    d. empty the hash set.
    e. test a hash set is empty or not.
    f. clone a hash set to another hash set.
    g. convert a hash set to an array.
    h. convert a hash set to a tree set.
    i. convert a hash set to a List/ArrayList.
    j. compare two hash set.
 */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // adding elements to HashSet
        set.add("Bob");
        set.add("Alice");
        set.add("John");
        set.add("Maddy");
        System.out.println("set : "+set);

        // append specified element to the end of a hash set
        System.out.println("\n------------------------------------1-----------------------------------\n");
        System.out.println("Append last : ");
        set.add("Patrick");
        System.out.println("set : "+set);
        
        
        // iterate through all elements
        System.out.println("\n------------------------------------2-----------------------------------\n");
        System.out.println("Iterate the set : ");
        for(String s : set){
            System.out.print(s+", ");
        }


        // get the number of elements
        System.out.println("\n------------------------------------3-----------------------------------\n");
        System.out.println("Number of elements in the set : "+set.size());
        
        
        // empty the hash set
        System.out.println("\n------------------------------------4-----------------------------------\n");
        set.clear(); // clears set
        System.out.println("Empty tthe HashSet : ");
        System.out.println("set : "+set);
        
        // test a hash set is empty or not
        System.out.println("\n------------------------------------5-----------------------------------\n");
        System.out.println("Checking set is empty or not?");
        System.out.println("Is set is empty : "+set.isEmpty());


        set.add("Bob");
        set.add("Alice");
        set.add("John");
        set.add("Maddy");


        // clone a hashset
        System.out.println("\n------------------------------------6-----------------------------------\n");
        System.out.println("Cloning a HashSet : ");
        
        HashSet<String> clonedSet = (HashSet) set.clone();
        
        System.out.println("    set    : "+set);
        System.out.println("cloned set : "+clonedSet);
        
        
        // convert a hash set to an array
        System.out.println("\n------------------------------------7-----------------------------------\n");
        System.out.println("Converting set to Array : ");
        Object[] array = set.toArray();
        System.out.println("Converted Array : "+Arrays.toString(array));



        // convert a HashSet to TreeSet
        System.out.println("\n------------------------------------8-----------------------------------\n");
        System.out.println("Converting HashSet to TreeSet : ");
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Converted TreeSet : "+treeSet);



        // convert a HashSet to ArrayList
        System.out.println("\n------------------------------------9-----------------------------------\n");
        System.out.println("Converting HashSet to ArrayList : ");
        ArrayList<String> list = new ArrayList<>(set);
        System.out.println("Converted ArrayList : "+list);
        
        
        // comparing two HashSets
        System.out.println("\n------------------------------------10-----------------------------------\n");
        System.out.println("Comparing Two HashSets : ");
        System.out.println("'set' and 'clonedSet' are Same or not? : "+set.equals(clonedSet));
    }
}
