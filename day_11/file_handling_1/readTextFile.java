package day_11.file_handling_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 1. Write a Java program to read the contents of a text file and display it on the console.
 */

public class readTextFile {
    public static void main(String[] args) {

        // creating file instance
        File myDocument = new File("day_11\\file_handling_1\\about_zoho_corp.txt");
        
        try{
            // put my file into scanner
            BufferedReader reader = new BufferedReader(new FileReader(myDocument));

            String line;

            while((line = reader.readLine()) != null){
                // if reader has next line, print one by one
                System.out.println(line);
            }
            reader.close();
        }
        
        catch(FileNotFoundException ex){
            System.out.println("Exception Occurred!");
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
