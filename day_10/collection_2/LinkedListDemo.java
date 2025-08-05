package day_10.collection_2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
 */

public class LinkedListDemo {
    public static void main(String[] args) {

        // creating linkedlist
        LinkedList<Integer> list = new LinkedList<>();

        // adding to list
        System.out.println("\nAdding elements to linkedlist : \n");
        list.add(10);
        list.add(44);
        list.add(8);
        list.add(22);
        list.add(100);
        list.add(25);
        list.add(99);
        System.out.println("list"+list);

        //adding last to the list
        System.out.println("\n------------------------------1------------------------------\n");
        System.out.println("element added to the end of the list!");
        list.addLast(143);
        System.out.println(list);
        
        // iterate the list
        System.out.println("\n------------------------------2------------------------------\n");
        System.out.println("list iteration : ");
        for(Integer i : list){
            System.out.print(i+", ");
        }
        
        // iterate from specific position
        System.out.println("\n------------------------------3------------------------------\n");
        int index = 4;
        Iterator<Integer> iter = list.listIterator(index);
        System.out.println("Iterate from '4th' index of the list : ");
        while(iter.hasNext()){
            System.out.print(iter.next()+", ");
        }
        
        // iterate list in descending order
        System.out.println("\n------------------------------4------------------------------\n");
        
        Iterator<Integer> it = list.descendingIterator();
        System.out.println("Iterating list in Descending order : ");
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }


        // inserting an element at specified position
        System.out.println("\n------------------------------5------------------------------\n");
        System.out.println("Inserting '200' at '5th' position : ");
        list.set(4, 200);
        System.out.println("list"+list);
        
        
        //insert elements first and last of the list
        System.out.println("\n------------------------------6------------------------------\n");
        System.out.println("insert elements at first and last of the list : ");

        LinkedList<Integer> elements = new LinkedList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        list.addAll(0,elements);
        list.addAll(list.size(),elements);
        System.out.println("list : "+list);
        
        
        // insert at front
        System.out.println("\n------------------------------7------------------------------\n");
        System.out.println("Insert '999' at front : ");
        list.addFirst(999);
        System.out.println(list);


        // insert at last
        System.out.println("\n------------------------------8------------------------------\n");
        System.out.println("Insert '111' at last : ");
        list.addLast(111);
        System.out.println(list);
        
        
        // insert some elements at the specified position
        System.out.println("\n------------------------------9------------------------------\n");
        System.out.println("Adding elements at '10th' position : ");
        LinkedList<Integer> newList = new LinkedList<>();
        newList.add(0);
        newList.add(0);
        newList.add(0);
        newList.add(0);
        
        int position = 10;
        list.addAll(position-1, newList);
        
        System.out.println(list);
        
        
        // first and last occurrence of the specified element
        System.out.println("\n------------------------------10------------------------------\n");
        System.out.println("First and last occurence of an element : ");
        System.out.println("First occurence of '1' : "+list.indexOf(1));
        System.out.println("Last occurence of '1' : "+list.lastIndexOf(1));
        
    }
}
