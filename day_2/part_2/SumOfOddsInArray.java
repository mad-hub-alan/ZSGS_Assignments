import java.util.Scanner;

/*
 1. Write a program that creates an integer array of 10 elements, 
 accepts values of arrays and Find the sum of all odd numbers.
 */

public class SumOfOddsInArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getArray();
        int oddSum = getOddSum(array);

        System.out.println(oddSum);
        input.close();
    }

    public static int[] getArray(){
        int[] array = new int[10];

        for(int index=0; index < array.length; index++){
            System.out.print("Enter Element ");
            System.out.print(index+1 +" : ");
            array[index] = input.nextInt();
        }
        return array;
    }

    public static int getOddSum(int[] array){
        int oddSum = 0;

        for(int index=0; index < array.length; index++){
            if(array[index] %2 != 0) oddSum += array[index];
        }
        return oddSum;
    }
}
