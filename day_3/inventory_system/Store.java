package inventory_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    static String storeName;
    static String storeLocation;
    static Scanner input = new Scanner(System.in);

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(){
        System.out.println("Enter Product Id :");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter Product Name :");
        String name = input.nextLine();
        System.out.println("Enter Product Quantity :");
        int quantity = input.nextInt();
        System.out.println("Enter Product Price :");
        double price = input.nextDouble();
        
        boolean flag = false;   // flag for avoid duplicate products

        for(Product pro: products){
            if(pro.product_id == id){
                pro.product_quantity += quantity; // if product already exist, increase quantity only1
                flag = true;
            }
        }
        if(flag) return;
        products.add(new Product(id, name, price, quantity)); // add new product to inventory
    }

    public void displayAllProducts(){
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-30s %-30s %-30s %-30s \n","Product Id", "Product Name","Quantity","Price");//
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for(int i=0; i<products.size(); i++){
            products.get(i).displayProduct();
        }
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }

    public static void setStoreDetails(){
        System.out.println("Enter Store Name : ");
        storeName = input.nextLine();
        System.out.println("Enter Store Location : ");
        storeLocation = input.nextLine();
    }

    public static void displayStoreDetails(int hour){

        System.out.println("-------------------------------------------------------------------");
        if(hour >= 0 && hour < 12) System.out.print("Good morning User!");
        else if(hour >= 12 && hour < 15) System.out.print("Good Afternoon User!");
        else if(hour >= 15 && hour < 18) System.out.print("Good Evening User!"); 
        else System.out.print("\t Good Night User! \t\t");
        System.out.printf("\t Welcome to %s, %s ! \n",storeName,storeLocation);
        System.out.println("-------------------------------------------------------------------");
    }

    public static void endGreetings(){
        System.out.println("Thank You for Visiting "+storeName+". Have a nice day!");
    }
}
