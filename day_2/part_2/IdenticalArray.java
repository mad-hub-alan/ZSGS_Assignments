import java.util.Scanner;

public class IdenticalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the length of the First Array : ");
        int lengthArray1 = input.nextInt();
        
        char[] array1 = new char[lengthArray1];
        
        for(int i=0; i<lengthArray1; i++){
            System.out.println("Enter '"+(i+1)+"' Element :");
            array1[i] = input.next().charAt(0);
        }
        
        System.out.println("Enter the length of the Second Array : ");
        int lengthArray2 = input.nextInt();
        
        char[] array2 = new char[lengthArray2];

        for(int i=0; i<lengthArray2; i++){
            System.out.println("Enter '"+(i+1)+"' Element :");
            array2[i] = input.next().charAt(0);
        }

        if(checkIdenticalArray(array1, array2)){
            System.out.println("Given Two Arrays are Identical");
        }else{
            System.out.println("Given Two Arrays are not Identical !");
        }

        input.close();
    }

    public static boolean checkIdenticalArray(char[]array1, char[] array2){
        if(array1.length != array2.length) return false;

        for(int i=0; i<array2.length; i++){
            if(array1[i] != array2[i]) return false;
        }
        return true;
    }
}
