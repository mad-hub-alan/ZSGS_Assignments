package day_11.file_handling_5;

import java.io.Serializable;


public class Product implements Serializable {

    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() { 
        return productId; 
    }
    public String getName() {
         return name; 
        }
    public double getPrice() { 
        return price; 
    }
    public int getQuantity() { 
        return quantity; 
    }

    public void setPrice(double price) {
        this.price = price; 
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("     %-15d %-30s %-20.2f %-15d",this.productId, this.name, this.price, this.quantity);
    }
}

