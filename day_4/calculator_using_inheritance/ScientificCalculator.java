package calculator_using_inheritance;

public class ScientificCalculator extends AdvancedCalculator{
    // sin() method
    protected double sin(double num){
        return Math.sin(num);
    }

    // cos() method
    protected double cos(double num){
        return Math.cos(num);
    }

    // tan() method
    protected double tan(double num){
        return Math.tan(num);
    }

    // log() method
    protected double log(double num){
        return Math.log(num);
    }

    // exp() method
    protected double exp(double num){
        return Math.exp(num);
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