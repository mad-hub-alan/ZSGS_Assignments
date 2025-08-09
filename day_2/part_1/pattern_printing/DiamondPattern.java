package pattern_printing;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number (Rows and Columns of the Pattern) : ");
        int range  = scan.nextInt();
        if(range %2 == 0){
            System.out.println("Please Enter Odd Number to print Pattern Correctly!");
            range = scan.nextInt();
        }
        scan.close();

        if(range %2 == 0){
            System.out.println("See you later!");
            return;
        }

        // Pattern Logic

        int counter = 0;

        int mid = (range/2)+1;

        int row = 1;
        while(row <= mid){
            int sCol = mid;
            while(sCol >= row){
                System.out.print("  ");
                sCol--;
            }
            int col = 1;
            while(col <= row){
                System.out.print(++counter+"   ");
                col++;
            }
            System.out.println();
            row++;
        }
        row--;
        while(row <= range){

            int sCol = mid--;
            int col = 1;
            while(sCol < range){
                System.out.print("  ");
                sCol++;
            }
            while(col <= range-row){
                System.out.print(++counter+"   ");
                col++;
            }
            System.out.println();
            row++;
        }





    }
}
