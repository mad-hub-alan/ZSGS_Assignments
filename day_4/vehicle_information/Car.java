package vehicle_information;

public class Car extends Vehicle{
    protected double ownershipCost;
    protected int warranty;
    protected int seatingCapacity;
    protected FuelType fuelType;

    public Car(double mileage, double price, double ownershipCost, int warranty, int seatingCapacity, FuelType fuelType){
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    public double getOwnershipCost() {
        return ownershipCost;
    }

    public void setOwnershipCost(double ownershipCost) {
        this.ownershipCost = ownershipCost;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car [mileage=" + mileage + ", ownershipCost=" + ownershipCost + ", price=" + price +
        ", warranty="+ warranty + ", seatingCapacity=" + seatingCapacity + ", fuelType=" + fuelType + "]";
    }

    
}


class Audi extends Car{
    String modelType;

    public Audi(double mileage, double price, double ownershipCost, int warranty, int seatingCapacity,FuelType fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    @Override
    public String toString() {
        return "Audi Car : \n mileage=" + mileage + ",\n ownershipCost=" + ownershipCost + ",\n price=" + price + ",\n warranty="
                + warranty + ",\n seatingCapacity=" + seatingCapacity + ",\n fuelType=" + fuelType + ",\n modelType="
                + modelType ;
    }

}
class Ford extends Car{
    String modelType;

    public Ford(double mileage, double price, double ownershipCost, int warranty, int seatingCapacity, FuelType fuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
        this.modelType = modelType;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    @Override
    public String toString() {
        return "FordCar : \n mileage=" + mileage + ",\n ownershipCost=" + ownershipCost + ",\n price=" + price + ",\n warranty="
                + warranty + ",\n seatingCapacity=" + seatingCapacity + ",\n fuelType=" + fuelType + ",\n modelType="
                + modelType ;
    }

}

enum FuelType{
    PETROL,
    DIESEL,
    LPG,
    CNG,
    ELECTRIC
}