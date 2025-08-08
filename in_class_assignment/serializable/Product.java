package in_class_assignment.serializable;

import java.io.Serializable;

public class Product implements Serializable{
    int productId;
    String productName;
    int quantity;
    double price;
    

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }    

    @Override
    public String toString() {
        return String.format(" Product ID : %d \n Product Name : %s \n Quantity : %d \n Price : %.2f \n",this.productId,this.productName,this.quantity,this.price);
    }
}
