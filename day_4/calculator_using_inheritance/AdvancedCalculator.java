package calculator_using_inheritance;

public class AdvancedCalculator extends BasicCalculator{
    
    // power() method
    protected long power(int base, int exponent){
        long result = 1;

        for(int i=1; i<=exponent; i++){
            result *= base;
        }
        return result;
    }

    // modulus() method
    protected int modulus(int num1, int num2){
        return (num1-(num1/num2)*num2);
    }

    // absolute() method
    protected int absolute(int num){
        return num < 0 ? (-1 * num) : num;
    }

    // squareRoot() method
    protected double squareRoot(double num){
        double x = num;           // Initial guess
        double epsilon = 1e-10;      // Desired accuracy
        double root;

        while (true) {
            root = 0.5 * (x + num / x); // Newton-Raphson formula
            if (Math.abs(root - x) < epsilon) // Close enough
                break;
            x = root; // Update guess
        }
        return root;
    }

    protected double squareRootManual(double num){
        double perfectSquare = getPerfectSquare(num);
        System.out.println("In method....");
        System.out.println("PerfectSquare"+perfectSquare);
        double approximateDecimal = perfectSquare+((num - (perfectSquare*perfectSquare))/(perfectSquare*2));
        System.out.println("Approximate decimal"+approximateDecimal);

        double result = approximateDecimal + ((num - (approximateDecimal*approximateDecimal))/(2*approximateDecimal));
        return result;
    }

    public static double getPerfectSquare(double num){
        double perfect = 0;
        System.out.println("in perfect Square");
        for(int i=0; i<=num; i++){
            System.out.println(i*i);
            if(i*i <= num) perfect = i;
            else return perfect;
        }
        return -1;
    }
}



/*
 7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.
 */