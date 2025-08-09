package pattern_printing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter No.Of Rows Of Pascal's Triangle : ");
        int rows = scan.nextInt();

        List<List<Integer>> pascalsTriangle = makePascalTriangle(rows); // construct and recieve Pascal Triangel

        printPascalTriangle(pascalsTriangle); // Print Pascal Triangle Pattern

        scan.close();
    }

    // Pattern Logic
    public static List<List<Integer>> makePascalTriangle(int rows){
        List<List<Integer>> pascalTriangle = new ArrayList<>();
            int row = 0;
            do{
                pascalTriangle.add(new ArrayList<>());
                int col = 0;
            do{
                if(col == 0 || col == row){
                    pascalTriangle.get(row).add(1);
                }else{
                    pascalTriangle.get(row).add(pascalTriangle.get(row-1).get(col) + pascalTriangle.get(row-1).get(col-1));
                }
                col++;
            }while(col <= row);
            row++;
        }while(row < rows);

        return pascalTriangle;
    }

    public static void printPascalTriangle(List<List<Integer>> pascalsTriangle){
        // System.out.println(pascalsTriangle);

        int row = 0; // Main Row

        do{                         // outer loop for maintain row 
            int spaceCol = 0;
            do{                     // loop for print spaces
                System.out.print("  ");
                spaceCol++;
            }while(spaceCol <= (2 * (pascalsTriangle.size()/2))-row); 

            int pascalCol = 0;
            do{
                System.out.print(pascalsTriangle.get(row).get(pascalCol)+"   ");
                pascalCol++;
            }while(pascalCol <= row); 

            System.out.println();   // to move next row

            row++;
        }while(row < pascalsTriangle.size());
    }
}