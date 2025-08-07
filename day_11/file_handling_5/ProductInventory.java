package day_11.file_handling_5;

/*
 5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.
 */

import java.io.*;
import java.util.*;

public class ProductInventory {
    static final String filePath = "D:\\ZSGS\\ZSGS_Assignments\\day_11\\file_handling_5\\products.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Product Inventory Menu:\n");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addProduct(sc);
                case 2 -> viewAllProducts();
                case 3 -> searchProduct(sc);
                case 4 -> updateProduct(sc);
                case 5 -> deleteProduct(sc);
                case 6 -> System.out.println("Exiting......");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }

    // Add Product

    private static void addProduct(Scanner sc) {
        try {
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            Product p = new Product(id, name, price, quantity); // creating Product

            List<Product> productList = readProducts(); // retrieving instances
            productList.add(p); // adding new product instance 
            writeProducts(productList); // re-writing Product list

            System.out.println("\n Product added successfully!");
        } catch (Exception e) {
            System.out.println("\n Error adding product: " + e.getMessage());
        }
    }

    // view All products
    private static void viewAllProducts() {
        List<Product> products = readProducts();
        if (products.isEmpty()) {
            System.out.println("\n No products found.\n");
        } else {
            System.out.println("\n-----------------------------------------------------------------------------------------------");
            System.out.printf("%-15s      %-25s %-20s %-15s","Product ID","Product Name","Product Price","Product Quantity");
            System.out.println("\n-----------------------------------------------------------------------------------------------");
            for(Product pro : products){
                System.out.println(pro);
            }
            System.out.println("\n-----------------------------------------------------------------------------------------------");
        }
    }

    // search a Product
    private static void searchProduct(Scanner sc) {
        System.out.print("Enter Product ID to search: ");
        int id = sc.nextInt();
        List<Product> products = readProducts();
        boolean found = false;

        for (Product p : products) {
            if (p.getProductId() == id) {
                System.out.println("\n Product Found:\n" + p);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\n Product not found.\n");
        }
    }

    // Update
    private static void updateProduct(Scanner sc) {
        System.out.print("Enter Product ID to update: ");
        int id = sc.nextInt();
        List<Product> products = readProducts();

        boolean updated = false;

        for (Product p : products) {
            if (p.getProductId() == id) {
                System.out.print("Enter new Price: ");
                double newPrice = sc.nextDouble();
                System.out.print("Enter new Quantity: ");
                int newQty = sc.nextInt();
                p.setPrice(newPrice);
                p.setQuantity(newQty);
                updated = true;
                break;
            }
        }

        if (updated) {
            writeProducts(products);
            System.out.println("\n Product updated successfully!\n");
        } else {
            System.out.println("\n Product ID not found.\n");
        }
    }

    // delete a Product
    private static void deleteProduct(Scanner sc) {
        System.out.print("Enter Product ID to delete: ");
        int id = sc.nextInt();
        List<Product> products = readProducts();

        boolean removed = false;

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            if (p.getProductId() == id) {
                products.remove(i);
                removed = true;
                break;
            }
        }

        if (removed) {
            writeProducts(products); // rewrites file
            System.out.println("\n Product deleted successfully!\n");
        } else {
            System.out.println("\n Product ID not found.\n");
        }
    }

    // Read products from file
  
    private static List<Product> readProducts() {
        List<Product> list = new ArrayList<>();

        File file = new File(filePath);
        if (!file.exists()) return list;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            list = (List<Product>) in.readObject();
        } catch (EOFException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("\n Error reading file: " + e.getMessage());
        }

        return list;
    }

    // Write products to file

    private static void writeProducts(List<Product> products) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(products);
        } catch (Exception e) {
            System.out.println("\n Error writing to file: " + e.getMessage());
        }
    }
}
