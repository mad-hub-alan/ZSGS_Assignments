package calculator_using_inheritance;

public class BasicCalculator {

    // add() method
    protected long add(int num1, int num2){
        return num1+num2;
    }
    // add() method (overloaded)
    protected double add(double num1, double num2){
        return num1+num2;
    }
    // subtract() method
    protected long subtract(int num1, int num2){
        return num1-num2;
    }
    // subtract() method (overloaded)
    protected double subtract(double num1, double num2){
        return num1-num2;
    }
    // multiply() method
    protected long multiply(int num1, int num2){
        return num1*num2;
    }
    // multiply() method (overloaded)
    protected double multiply(double num1, double num2){
        return num1*num2;
    }
    // divide() method
    protected long divide(int divident, int divisor){
        return divident/divisor;
    }
    // divide() method (overloaded)
    protected long divide(double divident, double divisor){
        return (long)(divident/divisor);
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