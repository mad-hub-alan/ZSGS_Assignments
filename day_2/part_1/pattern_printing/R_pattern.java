package pattern_printing;

import java.util.Scanner;

public class R_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number (Rows and Columns of the Pattern) : ");
        int range  = scan.nextInt();
    
        if(range < 5){
            System.out.println("Please Enter Higher Number than this to print Pattern Correctly!");
            range = scan.nextInt();
        }
        scan.close();

        // Pattern Logic
        int mid = (range/2)+1;  // for middle row printing(+1 because we start loop with '1')

        for(int row=1; row <= range; row++){
            for(int col=1; col <= range; col++){
                if(row == 1){
                    System.out.print("R ");
                }else if(col == 1){
                    System.out.print("R ");
                }else if(row == mid){
                    System.out.print("R ");
                }else if((row < mid) && (col == range)){
                    System.out.print("R ");
                }else if((row > mid) && (row == col)){
                    System.out.print("R ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
