import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int number = input.nextInt();

        if(powerOfTwo(number)){
            System.out.println("Given Number is a 'Power of Two'");
        }else{
            System.out.println("Given Number is not a 'Power of Two'");
        }

        System.out.println(powerOfTwo(number));
        // for(int i=1; i<=1000; i++){
        //     System.out.println(i+"  -->  "+powerOfTwo(i));
        // }
    }

    public static boolean powerOfTwo(int number){
        if(number == 1) return true;
        if(number %2 == 1) return false;
        return powerOfTwo(number/2);
    }
}
