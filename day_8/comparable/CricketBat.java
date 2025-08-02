package day_8.comparable;

public class CricketBat implements Comparable<CricketBat>{
    private String brand;
    private double weight;
    private double price;
    
    public CricketBat(String brand, double weight, double price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // methods

    @Override
    public int compareTo(CricketBat that) {
        if(this.weight == that.weight) return 0;
        else if(this.price < that.price) return 1; // sorting in descending
        else return -1;
    }

    @Override
    public String toString() {
        return String.format("Brand : %-10s | Weight : %-10.2f | Price : %-10.2f",this.brand,this.weight,this.price);
    }
}
