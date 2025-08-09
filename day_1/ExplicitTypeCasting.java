public class ExplicitTypeCasting {
    public static void main(String[] args) {

        int intNumber = 44;  // integer number
        System.out.println("Given int Number"+intNumber);

        double doubleNumber = intNumber; // implicit type casting (int -> double)


        short shortNumber = (short) intNumber; // Explicit type casting (int -> short)
        byte byteNumber = (byte) intNumber; // Explicit type casting (int -> short)
        char charNumber = (char) intNumber; // Explicit type casting (int -> short)

        System.out.println("Short : "+shortNumber);
        System.out.println("Byte : "+byteNumber);
        System.out.println("Char : "+charNumber);
    }
}
