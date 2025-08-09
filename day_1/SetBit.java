import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int number = input.nextInt();

        System.out.println(findSetBit(number));

        input.close();
    }

    public static String findSetBit(int number){
        if(number == 0) return "No Set Bit exist. Because Number is Zero!";

        int count = 1; 

        while(true){
            if((number & 1) == 1) return "Set Bit of the given number is "+"'"+count+"'";
            number = number >> 1; // eliminating last bit
            count++; // increment count
        }
    }
}
