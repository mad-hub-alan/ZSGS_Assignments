package pattern_printing;

import java.util.Scanner;

public class X_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number (Rows and Columns of the Pattern) : ");
        int range  = scan.nextInt();
        if(range %2 == 0){
            System.out.println("Please Enter Odd Number to print Pattern Correctly!");
            range = scan.nextInt();
        }
        scan.close();

        // Pattern Logic
        for(int row=0; row < range; row++){
            for(int col=0; col < range; col++){
                if((row == col) || (col == ((range-1)-row))) System.out.print("x ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}


/*
 
*        *
  *    *   
     *     
  *    *  
*        *

 */
