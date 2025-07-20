import java.util.Arrays;
import java.util.Scanner;

/*
 4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) 
 as function arguments. The function calculates sum of only single digit and 
 sum of only double digit elements from the array. Design a main() function to 
 input size of the array ‘len' and single dimensional array of size 'len', and
  print the required result by invoking the function print( ).
 */

public class SingleDoubleDigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int length = input.nextInt();

        int[] array = new int[length];

        for(int index=0; index <array.length; index++){
            System.out.println("Enter '"+(index+1)+"' Element : ");
            array[index] = input.nextInt();
        }

        input.close();

        print(array, length);
    }

    public static void print(int[] array, int length){
        System.out.println(Arrays.toString(array));
        System.out.println(length);
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for(int index=0; index < length; index++){
            if(array[index] > 99) continue;
            if(array[index] >= 0 && array[index] <=9){
                singleDigitSum += array[index];
            }else if(array[index] >= 10 && array[index] <= 99){
                doubleDigitSum += array[index];
            }
        }
        System.out.println("Single Digit Sum : "+singleDigitSum);
        System.out.println("Double Digit Sum : "+doubleDigitSum);
    }
}
