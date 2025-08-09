import java.util.Scanner;

/*
 3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
 */

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Range of the Fibonacci Series : ");
        int count = scan.nextInt();

        scan.close();

        int[] fibonacciArray = fibonacci(count);

        printArray(fibonacciArray);

    }
    
    public static int[] fibonacci(int count){
        int[] array = new int[count];
        
        array[0] = 0;
        array[1] = 1;

        for(int i=2; i<count; i++){
            array[i] = array[i-1]+array[i-2];
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.print("[ ");
        for(int index=0; index<array.length; index++){
            System.out.print(array[index]+", ");
        }
        System.out.print("]");
    }
}
