import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Percentage : ");
        int percentage = input.nextInt();

        input.close();

        gradeByIf(percentage);
        gradeBySwitch(percentage);
    }

    public static void gradeByIf(int percentage){
        if((percentage >= 85) && (percentage <= 100)) System.out.println("Grade : 'A'");
        else if((percentage >= 70) && (percentage <= 84)) System.out.println("Grade : 'B'");
        else if((percentage >= 50) && (percentage <= 69)) System.out.println("Grade : 'C'");
        else System.out.println("Grade : Fail!");
    }

    public static void gradeBySwitch(int percentage){
        
        int value = percentage/10;
        if(percentage >= 80 && percentage <=84) value = 7;
        
        switch (value) {
            case 10:
            case 9:
            case 8: 
                System.out.println("Grade : 'A'");
                break;
            case 7:
                System.out.println("Grade : 'B'");
                break;
            case 6:
            case 5:
                System.out.println("Grade : 'C'");
                break;
            default:
                System.out.println("Grade : 'Fail!'");
                break;
        }
    }
}