package day_11.file_handling_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 3. Write a Java program that reads a file and prints the number of lines, words, and characters.
 */

public class CountFileContents {
    public static void main(String[] args) {
        
        //creating file instance
        File myFile = new File("day_11\\file_handling_3\\about_zoho_corp.txt");

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;


        try{
            Scanner scanner = new Scanner(myFile);


            while(scanner.hasNext()){
                lineCount++; // incrementing line count

                String currentLine = scanner.nextLine(); // gettig current line from scanner

                characterCount += currentLine.length(); // incrementing characterCount

                String[] words = currentLine.split("\\s+"); // splitting words from currentLine
                wordCount += words.length;

            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("-----------------------------");
        System.out.println("Line Count      : "+lineCount);
        System.out.println("Word Count      : "+wordCount);
        System.out.println("Character Count : "+characterCount);
        System.out.println("-----------------------------");

    }
}
