package day_11.file_handling_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendTextToFile {
    
    static Scanner scanner = new Scanner(System.in);
    // static BufferedReader reader;
    static File document;
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("1. Create a file");
        System.out.println("2. Write to the file");
        System.out.println("3. Read from a file");
        System.out.println("4. Append to the file");
        System.out.println("5. Exit!");

        System.out.print("\n Enter your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch(choice){
            case 1 :
                System.out.print("Enter the File Name to be created : ");
                String fileName = scanner.nextLine();
                document = createFile(fileName);
                break;
            case 2 :
                System.out.println("Enter content to write to the File : ");
                String text = scanner.nextLine();
                writeToTheFile(text);
                break;
            case 3 :
                readFromTheFile(document);
                break;
            case 4 :
                System.out.println("Enter content to Append to the File : ");
                String content = scanner.nextLine();
                appendToTheFile(content);
                break;
            case 5 :
                return;

            }
        menu();
    }

    // method to create File
    public static File createFile(String fileName){
        File file = new File("resources\\"+fileName+".txt");

        if(file.exists()){
            System.out.println("\n File Already Exist! \n");
        }else{
            try {
                file.createNewFile();
                System.out.println("\n'"+file.getName()+"' File Created! \n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    // method to read from a file
    public static void readFromTheFile(File document){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(document));
            String line;
            System.out.println("\n-----------------FILE-------------------\n");
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("\n----------------------------------------\n");
            reader.close();

        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }

    // method to append content to the File
    public static void writeToTheFile(String content){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(document));
            writer.write(content);
            writer.flush();
            writer.close();
            System.out.println("\n Data writed Successfully! \n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } 

    // method to append content to the File
    public static void appendToTheFile(String content){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(document,true));
            writer.write("\n"+content);
            writer.flush();
            writer.close();
            System.out.println("\n File After Append : ");
            readFromTheFile(document);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } 

}
