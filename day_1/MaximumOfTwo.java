import java.util.Scanner;

public class MaximumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter First Number :");
        int firstNumber = in.nextInt(); 
        System.out.println("Enter Second Number :");
        int secondNumber = in.nextInt();

        int greatestNumber = firstNumber > secondNumber ? firstNumber : secondNumber; //check

        System.out.println("Maximum Number : "+greatestNumber);

        in.close();
    }
}
