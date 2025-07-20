import java.util.Scanner;

/*
 2. Write a program to take in 10 values and print only those numbers which are prime.
 */


public class PrimesInArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getArray();
        printPrimesInArray(array);
        input.close();
    }

    public static void printPrimesInArray(int[] array){
        System.out.print("Primes in the Array : [ ");
        for(int index=0; index<array.length; index++){
            if(array[index] < 2) continue;
            boolean flag = true;
            for(int num = 2; num <= Math.sqrt(array[index]); num++){
                if(array[index] % num == 0) flag = false;
            }
            if(flag) System.out.print(array[index]+", ");
        }
        System.out.print("]");
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
}


