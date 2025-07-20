import java.util.Scanner;

/*
 9. Write an array which takes in roll no and marks in 3 subjects for 10 students. 
 Format and Print the roll no, total marks and average for all students in a table form.
 */

public class StudentMarkSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] markList = new int[2][4];

        for(int i=0; i<markList.length; i++){
            System.out.println("* Enter Student '"+(i+1)+"' Details *");
            for(int j=0; j<markList[i].length; j++){
                if(j==0) System.out.println("Enter Student '"+(i+1)+"' Roll.No :");
                else System.out.println("Enter"+(j)+"Mark of Student '"+(i+1)+"'");
                markList[i][j] = scan.nextInt();
            }
        }
        scan.close();

        printStudentsMarkDetails(markList);
    }

    public static void printStudentsMarkDetails(int[][] list){
        System.out.println("-----------------------------------");
        System.out.println("Roll-Number   Total-Marks   Average");
        System.out.println("-----------------------------------");
    
        for(int i=0; i<list.length; i++){
            int total = list[i][1]+list[i][2]+list[i][3];
            double average = total/3;
            System.out.printf("%-10d        %d        %5.2f",list[i][0],total,average);
            System.out.println();
        }
        System.out.println("-----------------------------------");
    }
}
