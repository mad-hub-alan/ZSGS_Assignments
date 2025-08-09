package calculator_using_inheritance;

public class CalculatorTest {
    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator(); // BasicCalculator instance
        AdvancedCalculator ac = new AdvancedCalculator();   // BasicCalculator instance

        // calling add() method from it's own class
        System.out.println("add() : "+bc.add(155, 654));

        // calling divide() method from it's own class
        System.out.println("divide() : "+bc.divide(58, 3)); 

        // calling overloaded divide() method from it's own class
        System.out.println("overloaded divide() : "+bc.divide(58, 3.0)); 
        
        // calling overloaded multiply() method from AdvancedCalculator class
        System.out.println("multiply"+ac.multiply(333.0, 99.0));


        // calling power() method from it's own class
        System.out.println("power() : "+ac.power(4, 3));

        // calling modulus() method from it's own class
        System.out.println("modulus() : "+ac.modulus(99, 8));

        // calling absolute() method from it's own class
        System.out.println("absolute() : "+ac.absolute(-85));  // -85 -> 85

        System.out.println(Integer.MAX_VALUE);
        // calling squareRoot() method from it's own class
        System.out.println("squareRoot() : "+ac.squareRoot(31));
        
        // calling squareRootManual() method from it's own class
        System.out.println("squareRoot() : "+ac.squareRootManual(31));  


        System.out.println(Math.exp(100));
    }
}
