package in_class_assignment.serializable;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableDemo{
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product(420, "MRF CricketBat", 5, 8500);
        Product product2 = new Product(180, "Pro Ase Cricket Shoes", 10, 2500);
        Product product3 = new Product(420, "SF Test Cricket Ball", 50, 450);
        
        products.add(product1);
        products.add(product2);
        products.add(product3);

        File myProducts = new File("in_class_assignment\\myProducts.txt");

        try {
            myProducts.createNewFile(); // creating File

            FileOutputStream fos = new FileOutputStream(myProducts); // creating FOS instance

            ObjectOutputStream oos = new ObjectOutputStream(fos); // creating OOS instance

            oos.writeObject(product1); // serializing an Product object

            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myProducts)); // creating OIS instance in short

            Product object = (Product) ois.readObject();


            System.out.println(object); // printing de-serialized Product instance


            // while(true){
            //     try{
            //         Object product = ois.readObject();  // retrieving serialized object and Assign it to Object instance
            //         Product pro = (Product) ois.readObject();  // retrieving serialized object and Assign it to Product instance
                    
            //         System.out.println(product); // printing de-serialized Object instance

            //         ois.close();


            //         // System.out.println(pro);    // printing de-serialized Product instance
            //     }catch(EOFException ex){
            //         System.out.println("End of the File Reached!");
            //         break;
            //     }
            // }



        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } 

    }
}