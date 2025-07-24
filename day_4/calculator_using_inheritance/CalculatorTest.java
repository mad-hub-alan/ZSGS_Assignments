package calculator_using_inheritance;

public class CalculatorTest {
    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        AdvancedCalculator ac = new AdvancedCalculator();

        System.out.println(bc.add(Integer.MAX_VALUE, Integer.MAX_VALUE));
        // System.out.println(bc.divide(58, 3));
        System.out.println(ac.divide(58, 3.0));
    }
}
