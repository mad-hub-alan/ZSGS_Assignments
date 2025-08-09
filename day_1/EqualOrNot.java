import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter First Number :");
        int firstNumber = scan.nextInt(); 
        System.out.println("Enter Second Number :");
        int secondNumber = scan.nextInt();

        int result = firstNumber ^ secondNumber; // if two numbers are equal xor operation will return Zero.

        switch (result) {
            case 0:
                System.out.println("Given Two Numbers are Equal");
                break;
            default:
                System.out.println("Given Two Numbers are Not-Equal!");
                break;
        }
        scan.close();
    }
}
