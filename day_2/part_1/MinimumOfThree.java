import java.util.Scanner;

public class MinimumOfThree{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = input.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = input.nextInt();

        input.close();
        
        System.out.println(minOfThree(num1, num2, num3));
    }

    public static int minOfThree(int num1,int num2,int num3){
        int min = Integer.MAX_VALUE;
        if((num1 < num2) && (num1 < num3)){
            min = num1;
        }else if((num2 < num3)){
            min = num2;
        }else{
            min = num3;
        }
        return min;
    }
}