package day_11.file_handling_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileOperations {


    public static void readFile(Scanner sc){
        System.out.print("Enter file name with Extention to read : ");
        String fileName = sc.nextLine();

        File file = new File("day_11\\file_handling_2\\resources\\"+fileName);

        if(file.exists()){
            System.out.println("----------------------Reading "+file.getName()+"--------------------------");
            // Path path = Paths.get("day_11\\file_handling_2\\resources\\"+fileName);
            // try {
            //     Files.readAllLines(path);
            // } catch (IOException ex) {
            //     ex.printStackTrace();
            // }

            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }else{
            System.out.println("\n No such file named "+file.getName()+"! \n");
        }
    }

    public static void writeUserInputToFile(Scanner sc) {
        try {
            System.out.print("\n Enter the destination file name: ");
            String fileName = sc.nextLine();
            File file = new File("day_11\\file_handling_2\\resources\\"+fileName+"txt"); // genetate a text file
            System.out.println("Enter the content (type '_exit_' to finish) : ");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            String line;
            while (!(line = sc.nextLine()).equalsIgnoreCase("_exit_")) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
            writer.close();
            System.out.println("\n Content written successfully.");

        } catch (IOException e) {
            System.out.println("\n Error writing to file: " + e.getMessage());
        }
    }

    public static void copyFileContent(Scanner sc) {
        try {
            System.out.print("Enter source file name : ");
            String source = sc.nextLine();
            System.out.print("Enter destination file name : ");
            String dest = sc.nextLine();
            
            File sourceFile = new File("day_11\\file_handling_2\\resources\\"+source+".txt");
            File destFile = new File("day_11\\file_handling_2\\resources\\"+dest+".txt");
            
            BufferedReader reader = null;

            if(sourceFile.exists()){
                reader = new BufferedReader(new FileReader(sourceFile));
            }else{
                sourceFile.createNewFile();
                System.out.println(sourceFile.getName()+" File created Succesfully! Now Put some Content in it! \n\n");
                System.out.println("Enter Content text : ");
                String content = sc.nextLine();
                BufferedWriter buffWriter = new BufferedWriter(new FileWriter(sourceFile));
                buffWriter.write(content);
                // buffWriter.flush();
                buffWriter.close();
            }

            reader = new BufferedReader(new FileReader(sourceFile));
            // destFile.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(destFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("\n File copied successfully! \n");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    public static void modifyFileContent(Scanner sc) {
        try {
            System.out.print("Enter file name to modify: ");
            String source = sc.nextLine();
            File file = new File("day_11\\file_handling_2\\resources\\"+source+".txt");

            if(file.exists()){

                BufferedReader reader = new BufferedReader(new FileReader(file));
                List<String> lines = new ArrayList<>();
                String line;

                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }

                reader.close();

                System.out.println("\n\n Original content:");
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println((i + 1) + ": " + lines.get(i));
                }

                System.out.print("\n\n Enter line number to modify: ");
                int lineNumber = sc.nextInt();
                sc.nextLine(); // consume newline
                if (lineNumber < 1 || lineNumber > lines.size()) {
                    System.out.println("\n Invalid line number.");
                    return;
                }

                System.out.print("\n Enter new content: ");
                String newContent = sc.nextLine();
                lines.set(lineNumber - 1, newContent);

                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                for (String updatedLine : lines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
                writer.close();

                System.out.println("\n File updated successfully! \n");
            }else{
                System.out.println("\n No such file named "+file.getName()+"! \n");
            }
        } catch (IOException e) {
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }

    public static void searchWordInFile(Scanner sc) {
        try {
            System.out.print("Enter file name: ");
            String source = sc.nextLine();
            File file = new File("day_11\\file_handling_2\\resources\\"+source+".txt");

            if(file.exists()){
                System.out.print("Enter word to search: ");
                String word = sc.nextLine();

                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                int count = 0;

                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String w : words) {
                        if (w.equalsIgnoreCase(word)) {
                            count++;
                        }
                    }
                }

                reader.close();

                System.out.println("\n The word '" + word + "' appeared " + count + " times! \n");
            }else{
                System.out.println("\n No such file named "+file.getName()+"! \n");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

