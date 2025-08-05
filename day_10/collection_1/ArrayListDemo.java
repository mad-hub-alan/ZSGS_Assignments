package day_10.collection_1;

import java.util.ArrayList;
import java.util.Collections;


/*
 1. Write a Java program
    a. to create a new array colours, add some colours (string) and print out the collection.
    b. to iterate through all elements in an array colours.
    c. to insert an element into the array colours at the first position.
    d. to retrieve an element (at a specified index) from a given array colours.
    e. to update specific array element by given element.
    f. to remove the third element from an array colours.
    g. to search an element in an array colours.
    h. to sort a given array colours.
    i. to copy one array colours into another.
    j. to shuffle elements in an array colours.
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>(); // creating a Arraycolours instance

        // 1. add colours and print
        System.out.println("------------------1------------------");
        colours.add("Black");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Red");
        colours.add("Gray");
        colours.add("Blue");
        colours.add("Pink");
        
        System.out.println(colours);
        
        // iterate colours
        System.out.println("------------------2------------------");
        for(String colour : colours){
            System.out.println(colour);
        }
        
        // insert first
        System.out.println("------------------3------------------\n Clolor added at first index!");
        colours.add(0,"White");
        
        // retrieve an element
        System.out.println("------------------4------------------");
        System.out.println("Colour at index '0' : "+colours.get(0));
        
        // update specific index
        System.out.println("------------------5------------------ \n 7th index Updated!");
        colours.set(7, "Sky Blue");
        
        // remove 3rd element
        System.out.println("------------------6------------------ \n 3rd element removed!");
        colours.remove(2); // removes the element at 2nd index(3rd element)
        
        // search an element
        System.out.println("------------------7------------------");
        System.out.println("Index of 'Red' : "+colours.indexOf("Red"));
        
        // sort the list
        System.out.println("------------------8------------------");
        Collections.sort(colours);
        System.out.println("Sorted list : "+colours);
        
        // copy arraylist
        System.out.println("------------------9------------------");
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(colours);
        System.out.println("Copied List : "+newList);
        
        // shuffle elements
        System.out.println("------------------9------------------");
        Collections.shuffle(newList);
        System.out.println("Shuffled List : "+newList);

    }
}
