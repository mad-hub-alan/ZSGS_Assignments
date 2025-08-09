package day_8.clone_5;

public class MobilePhone implements Cloneable{ //implements Clonable interface
    private String brand;
    private String model;
    private double price;
    
    // constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // setters and getters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // methods

    //overriding Object class' clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    
    //overriding Object class' toString() method
    @Override
    public String toString() {
        return String.format(" Brand : %s \n Model : %s \n Price : %s \n",this.brand,this.model,this.price);
    }    
}
