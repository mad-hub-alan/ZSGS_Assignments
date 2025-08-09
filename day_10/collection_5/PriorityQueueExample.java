package day_10.collection_5;

import java.util.Arrays;

/*
 5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
 */

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------1------------------------------------\n");
        System.out.println("Creating a PriorityQueue, adding colours and print it. \n");
        // creating Priority Queue
        PriorityQueue<String> colours = new PriorityQueue<>();
        
        // adding colours
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("White");
        colours.add("Black");
        colours.add("Pink");
        colours.add("Orange");
        
        // printing Priority Queue
        System.out.println("colours : "+ colours);
        
        
        // iterate through all elements in priority queue
        System.out.println("\n--------------------------------2------------------------------------\n");
        System.out.println("Iterating Priority Queue : \n");
        for(String colour : colours){
            System.out.print(colour+", ");
        }
        
        
        // add all the elements of a priority queue to another priority queue
        System.out.println("\n--------------------------------3------------------------------------\n");
        System.out.println("Add all elements to new Priority Queue : \n");
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.addAll(colours);
        System.out.println("queue : "+queue);
        
        
        // insert a given element into a priority queue
        System.out.println("\n--------------------------------4------------------------------------\n");
        System.out.println("Insert an element to the Queue : \n");
        colours.add("Brown");
        System.out.println("colours queue after added 'Brown' : "+colours);
        
        
        
        // remove all the elements from a priority queue
        System.out.println("\n--------------------------------5------------------------------------\n");
        System.out.println("Remove all elements from a Queue : \n");
        queue.clear();
        System.out.println("queue : "+queue);
        
        
        
        // count the number of elements in a priority queue
        System.out.println("\n--------------------------------6------------------------------------\n");
        System.out.println("Element Count of the Queue : \n");
        System.out.println("Number of Elements : "+colours.size());
        
        
        // compare two priority queues
        System.out.println("\n--------------------------------7------------------------------------\n");
        System.out.println("Comparing two Queues : \n");
        System.out.println("Is 'colours' and 'queue' are same? : "+colours.equals(queue));
        
        
        
        // retrieve the first element of the priority queue.
        System.out.println("\n--------------------------------8------------------------------------\n");
        System.out.println("Retrieving First Element of Queue : \n");
        System.out.println("First Element : "+colours.peek());
        
        
        
        // retrieve and remove the first element
        System.out.println("\n--------------------------------9------------------------------------\n");
        System.out.println("Retrieve and Remove First Element of Queue : \n");
        System.out.println("Removed Element : "+colours.poll());
        System.out.println(colours);
        
        
        
        // convert a priority queue to an array containing all of the elements of the queue
        System.out.println("\n--------------------------------10------------------------------------\n");
        System.out.println("Convertion of PriorityQueue to an Array : \n");
        
        Object[] array = colours.toArray();

        System.out.println(Arrays.toString(array));
    
        System.out.println();
    }
}
