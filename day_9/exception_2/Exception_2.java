package day_9.exception_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 2. Demonstrate multiple catch blocks: accept two numbers as strings, 
 then convert them to integers, and perform division, and catch the following exceptions: 
 InputMismatchException, NumberFormatException, ArithmeticException and Exception.
 */

public class Exception_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try{
            System.out.print("\nEnter first Number : ");
            String str1 = scan.nextLine();
            System.out.print("\nEnter second Number : ");
            String str2 = scan.nextLine();

            System.out.println();

            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            System.out.println("\n\t 'num1/num2' : "+ num1/num2 +"\n\n");
            
        }catch(InputMismatchException ex){
            ex.printStackTrace();
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }catch(ArithmeticException ex){
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("\n Exception Handled Successfully! \n");
    }
}
