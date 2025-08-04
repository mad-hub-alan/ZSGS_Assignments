package user_defined_packages;

// ----------import statements---------
import user_defined_packages.arithmetic.Mathematic;
import user_defined_packages.stringutils.StringUtility;

public class PackagesDemo {
    public static void main(String[] args) {

        System.out.println("-------------Mathematic Class Demo-------------\n");
        // Mathematic.add()
        System.out.println("add() : "+Mathematic.add(44, 33));
        // Mathematic.subtract()
        System.out.println("subtract() : "+Mathematic.subtract(44, 33));
        // Mathematic.multiply()
        System.out.println("multiply() : "+Mathematic.multiply(44, 33));
        // Mathematic.divide()
        System.out.println("divide() : "+Mathematic.divide(44, 10));
        // Mathematic.modulo()
        System.out.println("modulo() : "+Mathematic.modulo(44, 33));

        System.out.println("\n ------------StringUtil Class Demo-------------\n");

        String myStr1 = "MADHUBALAN";
        String myStr2 = "Pavoorchatram";

        // StringUtility.length()
        System.out.println("length() : "+StringUtility.length(myStr2));

        // StringUtility.concat()
        System.out.println("concat() : "+StringUtility.concat(myStr1,myStr2));

        // StringUtility.reverse()
        System.out.println("reverse() : "+StringUtility.reverse(myStr1));

        System.out.println();
    }
}