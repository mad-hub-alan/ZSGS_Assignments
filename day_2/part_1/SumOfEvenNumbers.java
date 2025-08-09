import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number(Limit) : ");
        int limit = scan.nextInt();

        scan.close();

        System.out.println(evenSum(limit));
    }

    public static int evenSum(int limit){
        int sum = 0;
        for(int number=1; number<=limit; number++){
            if(number %2 != 0) continue;    //skips odd numbers
            sum = sum + number;
        }
        return sum;
    }
}
