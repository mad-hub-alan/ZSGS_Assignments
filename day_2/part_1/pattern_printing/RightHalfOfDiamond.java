package pattern_printing;

import java.util.Scanner;

class RightHalfOfDiamond{
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
        int mid = (range/2)+1;  // dividing triangle into two 

        int row = 1;
        while(row <= mid){
            int col = 1;
            while((col <= row)){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
        row = mid-1;
        while(row >= 1){
            int col = 1;
            while(col <= row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row--;
        }
    }
}



/*

    *
    * * 
    * * *
    * *
    *

 */