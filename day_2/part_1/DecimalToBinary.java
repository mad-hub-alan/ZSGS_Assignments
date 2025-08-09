import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Decimal Number : ");
        int decimal = input.nextInt();

        input.close();

        System.out.println("Binary Representation of the Given Number : "+decimalToBinary(decimal, ""));
    }   
    
    public static String decimalToBinary(int decimal, String binary){
        if(decimal == 0) return binary;
        int bit =  (decimal & 1);
        binary = bit + binary;
        return decimalToBinary(decimal >> 1,binary);
    }
}


