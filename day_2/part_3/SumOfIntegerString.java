import java.util.Scanner;

/*
 6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
 */

public class SumOfIntegerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First number as String : ");
        String stringNum1 = input.nextLine();
        System.out.println("Enter Second number as String : ");
        String stringNum2 = input.nextLine();

        String sumString = sumOfIntegerString(stringNum1,stringNum2);

        System.out.println("Sum of Two Given Number Strings : "+sumString);

        input.close();
    }   

    public static String sumOfIntegerString(String str1, String str2){
        int num1 = 0;
        int num2 = 0;

        int digitValue = 1;

        for(int i=str1.length()-1; i>=0; i--){
            num1 += ((str1.charAt(i)-'0') * digitValue);
            digitValue = digitValue*10;
        }
        System.out.println(num1);
        digitValue = 1;
        
        for(int i=str2.length()-1; i>=0; i--){
            num2 += ((str2.charAt(i)-'0') * digitValue);
            digitValue = digitValue*10;
        }
        System.out.println(num2);

        return ""+(num1+num2);
    }
}
