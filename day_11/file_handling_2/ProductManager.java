package day_11.file_handling_2;

import java.io.*;
import java.util.*;

public class ProductManager {

    public static void copyTxtToCsv(Scanner sc) {
        try {
            System.out.print("Enter source TXT file name: ");
            String source = sc.nextLine();
            File txtFile = new File("day_11\\file_handling_2\\resources\\"+source+".txt");

            if(txtFile.exists()){

                System.out.print("Enter destination CSV file name: ");
                String csv = sc.nextLine();
                File csvFile = new File("day_11\\file_handling_2\\resources\\"+csv+".csv");
    
                BufferedReader reader = new BufferedReader(new FileReader(txtFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile));
    
                writer.write("ID,Name,Price");
                writer.newLine();
    
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
    
                reader.close();
                writer.close();
    
                System.out.println("\n\n Data copied from TXT to CSV successfully! \n");
            }else{
                System.out.println("\n No such file named "+txtFile.getName()+"! \n");
            }

        } catch (IOException e) {
            System.out.println("Error copying to CSV: " + e.getMessage());
        }
    }
}

