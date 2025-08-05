package day_9.exception_1;

/* 1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
*/

public class Exception_1 {
    public static void main(String[] args) {
        
        int[] numbers = {10,4,5,0,144,44,444,6};

        try{
            int quotient = numbers[6] / numbers[3]; // dividing a number by '0'

            System.out.println(numbers[10]);   // accessing an index which doesn't exist in 'numbers' Array 

            System.out.println(quotient);


        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("\n Exception Handled Successfully! \n");
    }
}
