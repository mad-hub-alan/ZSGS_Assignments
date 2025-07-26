package inventory_system;
import java.time.LocalTime;
import java.util.Scanner;

import inventory_system.*;

public class InventoryMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        Store newStore = new Store();

        Store.setStoreDetails();

        Store.displayStoreDetails(hour);

        while(true){
            System.out.println("---->OPTIONS<----");
            System.out.println("-------------------------------------");
            System.out.println("Press '1' to 'Show All Products'");
            System.out.println("Press '2' to 'Add Products'");
            System.out.println("Press '3' to 'Exit From the Store!'");
            System.out.println("-------------------------------------");

            System.out.println("Choose your Option ('1','2','3') : ");
            int option = scan.nextInt();

            switch(option){
                case 1 :
                    newStore.displayAllProducts();
                    break;
                case 2 :
                    newStore.addProduct();
                    break;
                case 3 :
                    Store.endGreetings();
                    System.exit(0);
                    break;
                default :
                    System.out.println("Enter a Valid Option !");
                    break;
            }
        }
    }


}