package day_9.exception_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 9. Create a method to read a file from disk. 
 Handle FileNotFoundException and IOException using try-catch-finally.
 */

public class Exception_9 {
    public static void main(String[] args) {
        File file = new File("D:/ZSGS/ZSGS_Assignments/day_9/exception_8/Exception_8.java"); //File instance
        Scanner scan = null;
        try{
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine()); // printing file line by line!
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }finally{
            scan.close();   // closing Scanner instance!
        }
    }
}
