package day_8.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparatorDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<CricketBall> balls = new ArrayList<>(); // ArrayList for hold CricketBall instances

        System.out.println("How much instances you want to create?");
        int insatnces = scan.nextInt();
        scan.nextLine();

        // creating CricketBall instances and populating arraylist
        for(int i=1; i<=insatnces; i++){
            System.out.println("\nCount : "+i);
            System.out.print("Enter Ball Brand : ");
            String brand = scan.nextLine();
            System.out.println("1.RedBall     2.WhiteBall     3.PinkBall");
            System.out.print("Choose ball Type : ");
            int type = scan.nextInt();
            scan.nextLine();
            System.out.print("\nEnter Ball Weight : ");
            double weight = scan.nextDouble();
            System.out.print("\nEnter Ball Price : ");
            double price = scan.nextDouble();
            scan.nextLine();
            balls.add(new CricketBall(brand,type, weight, price));
        }
        
        // printing CricketBall instances before sort
        System.out.println("\n --------------------------Balls Before Sort--------------------------- \n");
        for(CricketBall cb : balls){
            System.out.println(cb);
        }
        
        System.out.println("-----------Available Sorting Options------------\n");
        System.out.println("1. Sort by 'Price'(Ascending)");
        System.out.println("2. Sort by 'Price'(Descending)");
        System.out.println("3. Sort by 'Weight'(Ascending)");
        System.out.println("4. Sort by 'Weight'(Descending)\n");
        
        System.out.print("Select Sorting Option : ");
        int sortOption = scan.nextInt();
        
        switch (sortOption) {
            case 1:
            System.out.println("You have selected Sort by 'Price'(Ascending)");
            Collections.sort(balls, new PriceComparator());
            break;
            case 2:
            System.out.println("You have selected Sort by 'Price'(Descending)");
            Collections.sort(balls, new PriceComparatorReverse());
            break;
            case 3:
            System.out.println("You have selected Sort by 'Weight'(Ascending)");
            Collections.sort(balls, new WeightComparator());
            break;
            case 4:
            System.out.println("You have selected Sort by 'Weight'(Descending)");
            Collections.sort(balls, new WeightComparatorReverse());
            break;
            
            default:
            System.out.println("Wrong Choice! List not sorted!");
            break;
        }
        
        // printing CricketBall instances After sort
        System.out.println("\n --------------------------Balls After Sort--------------------------- \n");
        for(CricketBall cb : balls){
            System.out.println(cb);
        }


    }
}
