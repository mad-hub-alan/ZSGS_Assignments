package day_10.collection_4;

import java.util.TreeSet;

import java.util.Iterator;

/*
 4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
 */

public class TreeSetDemo {
    public static void main(String[] args) {

        System.out.println("\n---------------------------------1------------------------------------\n");
        System.out.println("Creating treeSet, adding colours and printing it : \n");
        //create TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        
        //adding colours
        treeSet.add("Yellow");
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");
        treeSet.add("Black");
        treeSet.add("White");
        
        // printing treeSet
        System.out.println("TreeSet : "+treeSet);
        
        
        // iterate through all elements in a tree set
        System.out.println("\n---------------------------------2------------------------------------\n");
        System.out.println("Iterate through treeSet : \n");
        for(String colour : treeSet){
            System.out.print(colour+", ");
        }

        // add all the elements of a specified tree set to another tree set
        System.out.println("\n---------------------------------3------------------------------------\n");
        System.out.println("Add all elements to another treeSet : \n");
        TreeSet<String> anotherTreeSet = new TreeSet<>();
        anotherTreeSet.addAll(treeSet);
        System.out.println("Another Tree Set : "+anotherTreeSet);
        
        
        // create a reverse order view of the elements contained in a given tree set
        System.out.println("\n---------------------------------4------------------------------------\n");
        System.out.println("Reverse Order of the treeSet : \n");
        
        Iterator<String> iter = treeSet.descendingIterator(); 
        
        while(iter.hasNext()){
            System.out.print(iter.next()+", ");
        }
        
        
        // get the first and last elements in a tree set
        System.out.println("\n---------------------------------5------------------------------------\n");
        System.out.println("First element of treeSet : "+treeSet.getFirst());
        System.out.println("Last element of treeSet : "+treeSet.getLast());
        
        
        // clone a tree set list to another tree set
        System.out.println("\n---------------------------------6------------------------------------\n");
        System.out.println("Cloning the treeSet : \n");
        TreeSet<String> clonedTreeSet = (TreeSet)treeSet.clone();  
        System.out.println("Cloned TreeSet : "+clonedTreeSet);
        
        
        // get the number of elements in a tree set
        System.out.println("\n---------------------------------7------------------------------------\n");
        System.out.println("Number of elements in the treeSet : "+treeSet.size());
        

        // compare two tree sets
        System.out.println("\n---------------------------------8------------------------------------\n");
        System.out.println("Comparing two treeSets : \n");
        System.out.println("Whether 'treeSet' and 'clonedTreeSet' are same? : "+treeSet.equals(clonedTreeSet));


        System.out.println("\n--------------------------------------------------------------------------------------------------\n");

        // creating treeSet 
        TreeSet<Integer> numbers = new TreeSet<>();

        // adding numbers to the treeSet
        numbers.add(20);
        numbers.add(3);
        numbers.add(44);
        numbers.add(6);
        numbers.add(13);
        numbers.add(99);
        numbers.add(6);
        numbers.add(50);
        numbers.add(90);
        numbers.add(2);
        numbers.add(4);
        numbers.add(0);
        numbers.add(7);


        // find the numbers less than 7 in a tree set
        System.out.println("\n---------------------------------9------------------------------------\n");
        System.out.println("Numbers less than '7' in treeSet : "+numbers.headSet(7));
        
        
        // get the element in a tree set which is greater than or equal to the given element
        System.out.println("\n---------------------------------10------------------------------------\n");
        System.out.println("Numbers greater than or equal to '55' in treeSet : "+numbers.ceiling(55));
        
        
        // get the element in a tree set which is less than or equal to the given element
        System.out.println("\n---------------------------------11------------------------------------\n");
        System.out.println("Numbers less than or equal to '40' in treeSet : "+numbers.floor(40));
        
        
        // get the element in a tree set which is strictly greater than or equal to the given element
        System.out.println("\n---------------------------------12------------------------------------\n");
        System.out.println("Numbers strictly greater than or equal to '39' in treeSet : "+numbers.higher(39));
        
        
        // get the element in a tree set which is strictly greater than or equal to the given element
        System.out.println("\n---------------------------------13------------------------------------\n");
        System.out.println("Numbers strictly lesser than or equal to '100' in treeSet : "+numbers.lower(100));
        

        // retrieve and remove the first element of a tree set
        System.out.println("\n---------------------------------14------------------------------------\n");
        System.out.println("Retrieve and remove the first element of a tree set : \n");
        System.out.println("First Element of treeSet : "+numbers.pollFirst());
        
        
        // retrieve and remove the last element of a tree set
        System.out.println("\n---------------------------------15------------------------------------\n");
        System.out.println("Retrieve and remove the last element of a tree set : \n");
        System.out.println("Last Element of treeSet : "+numbers.pollLast());


        // remove a given element from a tree set
        System.out.println("\n---------------------------------16------------------------------------\n");
        System.out.println("Remove a given element from a tree set : \n");
        System.out.println("Element '44' Removed from treeSet or not? : "+numbers.remove(44));
        

    }
}
