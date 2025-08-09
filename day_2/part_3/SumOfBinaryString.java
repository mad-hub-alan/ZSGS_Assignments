import java.util.Scanner;

/*
 1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */

public class SumOfBinaryString{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Binary String : ");
        String binaryString1 = scan.nextLine();
        System.out.println("Enter Second Binary String : ");
        String binaryString2 = scan.nextLine();

        String sumOfBinary = binarySum(binaryString1,binaryString2);

        System.out.println("Binary Sum : '"+sumOfBinary+"'");

        scan.close();
    }

    public static String binarySum(String binary1, String binary2){
        int decimal1 = 0;
        int decimal2 = 0;
        int bitValue = 1;

        for(int i=binary1.length()-1; i>=0; i--){
            if(binary1.charAt(i) == '1') decimal1 += bitValue;
            bitValue *= 2;
        }

        bitValue = 1;

        for(int i=binary2.length()-1; i>=0; i--){
            if(binary2.charAt(i) == '1') decimal2 += bitValue;
            bitValue *= 2;
        }
        
        int decimalSum = decimal1 + decimal2;

        String binarySum = "";

        while(decimalSum > 0){
            binarySum = (decimalSum & 1) + binarySum;
            decimalSum = decimalSum >> 1;
        }
        return binarySum;
    }
}