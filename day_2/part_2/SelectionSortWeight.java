import java.util.Arrays;
import java.util.Scanner;

/*
 7. Write a program to input and store the weight of ten people. 
 Sort and display them in descending order using the Selection sort technique.
 */

public class SelectionSortWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] weights = new int[10];

        for(int i=0; i<weights.length; i++){
            System.out.println("Enter '"+(i+1)+"' Weight : ");
            weights[i] = input.nextInt();
        }

        System.out.println("Array Before Sort : "+Arrays.toString(weights));

        selectionSort(weights);

        System.out.println("Array After Sort : "+Arrays.toString(weights));

        input.close();
    }

    public static void selectionSort(int[] array){
        
        for(int i=0; i<array.length-1; i++){
            int maxIndex = i; // maximum index in each iteration
            for(int j=i+1; j<array.length; j++){
                if(array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }
            // swapping 
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }
}


