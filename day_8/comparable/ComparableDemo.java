package day_8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparableDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<CricketBat> bats = new ArrayList<>(); // ArrayList for hold CricketBat instances

        System.out.println("How much instances you want to create?");
        int insatnces = scan.nextInt();
        scan.nextLine();

        // creating CricketBat instances and populating arraylist
        for(int i=1; i<=insatnces; i++){
            System.out.println("\nCount : "+i);
            System.out.print("Enter Bat Brand : ");
            String brand = scan.nextLine();
            System.out.print("\nEnter Bat Weight : ");
            double weight = scan.nextDouble();
            System.out.print("\nEnter Bat Price : ");
            double price = scan.nextDouble();
            scan.nextLine();
            bats.add(new CricketBat(brand, weight, price));
        }
        
        // printing CricketBat instances before sort
        System.out.println("\n ----------------Bats Before Sort---------------- \n");
        for(CricketBat cb : bats){
            System.out.println(cb);
        }
        
        // I want to sort CricketBats in descending order according to their prices!
        Collections.sort(bats);
        
        
        // printing CricketBat instances After sort
        System.out.println("\n -----------------Bats After Sort---------------- \n");
        for(CricketBat cb : bats){
            System.out.println(cb);
        }


    }
}
