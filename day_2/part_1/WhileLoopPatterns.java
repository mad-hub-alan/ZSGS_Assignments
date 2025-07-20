import java.util.Scanner;

public class WhileLoopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which Pattern do you want to Print ?");
        System.out.println("->  Press '0' to Print Character Pattern");  // '0' for print char pattern
        System.out.println("->  Press '1' to Print Number Increment Pattern");  // '1' for print number pattern

        int userOption = input.nextInt();

        if(userOption == 0){
            System.out.println("Enter the Character to print : ");
            char character = input.next().charAt(0); 
            System.out.println("Enter How many rows to be print : ");
            int rowCount = input.nextInt();

            printCharPattern(character, rowCount); // Character pattern method call

        }else if(userOption == 1){
            System.out.println("Enter How many rows to be print : ");
            int rowCount = input.nextInt();

            printNumberIncrementPattern(rowCount); // Number increment pattern method call
        }else{
            System.out.println("Invalid Number ! Please Enter '0' or '1'.");
            WhileLoopPatterns.main(args);
        }
        input.close();
    }

    public static void printCharPattern(char c, int rowCount){
        System.out.println("Character Pattern");
    }
    
    public static void printNumberIncrementPattern(int rowCount){
        System.out.println("Number Pattern");
    }
}
