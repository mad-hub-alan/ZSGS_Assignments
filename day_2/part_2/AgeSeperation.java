import java.util.Scanner;

/*
 8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
 */

public class AgeSeperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ages = new int[10];

        for(int i=0; i<ages.length; i++){
            System.out.println("Enter '"+(i+1)+"' Age : ");
            ages[i] = scan.nextInt();
        }

        seperateAgeAndPrint(ages);

        scan.close();
    }

    public static void seperateAgeAndPrint(int[] array){
        int belowEighteen = 0;
        int eighteenToSixty = 0;
        int aboveSixty = 0;

        for(int i=0; i<array.length; i++){
            if(array[i] < 18) belowEighteen++;
            else if(array[i] >= 18 && array[i] <= 60) eighteenToSixty++;
            else if(array[i] > 60) aboveSixty++;
        }

        System.out.println("People Below 18 : "+belowEighteen);
        System.out.println("People 18 to 60 : "+eighteenToSixty);
        System.out.println("People Above 60 : "+aboveSixty);
    }
}
