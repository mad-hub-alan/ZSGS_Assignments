package inventory_system;

public class Product {
    int product_id;
    String product_name;
    double product_price;
    int product_quantity;

    public Product(int id, String name, double price,int quantity){
        this.product_id = id;
        this.product_name = name;
        this.product_price = price;
        this.product_quantity = quantity;
    }

    public void displayProduct(){
        System.out.printf("%-30d %-30s %-30d %-30f \n",this.product_id,this.product_name,this.product_quantity,this.product_price);
    }
}
