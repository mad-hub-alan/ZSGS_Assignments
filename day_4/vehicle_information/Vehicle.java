package vehicle_information;

public class Vehicle {
    protected double mileage;
    protected double price;

    public Vehicle(double mileage, double price){
        this.mileage = mileage;
        this.price = price;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Vehicle [mileage=" + mileage + ", price=" + price + "]";
    }

}
