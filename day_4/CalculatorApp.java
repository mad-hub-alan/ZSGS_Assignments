import calculator_using_inheritance.BasicCalculator;

import java.util.Scanner;

import calculator_using_inheritance.AdvancedCalculator;
import calculator_using_inheritance.ScientificCalculator;


public class CalculatorApp {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        AdvancedCalculator ac = new AdvancedCalculator();
        ScientificCalculator sc = new ScientificCalculator();

        printGreetings();
    }

    public static void showMenu(){
        System.out.println("Three Types of Calculators Available! \n \t\t Which one You want to Use ?");
        System.out.println("1) Basic Calculator");
        System.out.println("1) Advanced Calculator");
        System.out.println("1) Scientific Calculator");
        System.out.println();
        System.out.println("Choose your Option : ");

        int calOption = input.nextInt();

        if(calOption == 1){
            BasicCalculator bc  = new BasicCalculator();

            System.out.println("Operations Available : ");
            System.out.println("1) 'add' whole numbers");
            System.out.println("2) 'add' fraction numbers");
            System.out.println("3) 'subtract' whole numbers");
            System.out.println("2) 'subtract' fraction numbers");
            System.out.println("1) 'multiply' whole numbers");
            System.out.println("2) 'multiply' fraction numbers");
            System.out.println("1) 'divide' whole numbers");
            System.out.println("2) 'divide' fraction numbers");

            System.out.println("Choose any Operation : ");
            int opOption = input.nextInt();

            switch(opOption){
                case 1 :
                    System.out.println("Enter First Number :");
                    int num1 = input.nextInt();
                    System.out.println("Enter Second Number :");
                    int num2 = input.nextInt();
                    System.out.println("Answer : ");
                    break;
            }
        }
    }

    public static void printGreetings(){
        System.out.println("------ Welcome to Calculator Application ! ------");
    }
}
