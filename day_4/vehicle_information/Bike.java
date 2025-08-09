package vehicle_information;

public class Bike extends Vehicle{
    protected int no_of_cylinders;
    protected int no_of_gears;
    protected CoolingType coolingType;
    protected WheelType wheelType;
    protected double fuelTankSize;

    public Bike(double mileage, double price, int no_of_cylinders, int no_of_gears, CoolingType coolingType,
            WheelType wheelType, double fuelTankSize) {
        super(mileage, price);
        this.no_of_cylinders = no_of_cylinders;
        this.no_of_gears = no_of_gears;
        this.coolingType = coolingType;
        this.wheelType = wheelType;
        this.fuelTankSize = fuelTankSize;
    }

    public int getNo_of_cylinders() {
        return no_of_cylinders;
    }

    public void setNo_of_cylinders(int no_of_cylinders) {
        this.no_of_cylinders = no_of_cylinders;
    }

    public int getNo_of_gears() {
        return no_of_gears;
    }

    public void setNo_of_gears(int no_of_gears) {
        this.no_of_gears = no_of_gears;
    }

    public CoolingType getCoolingType() {
        return coolingType;
    }

    public void setCoolingType(CoolingType coolingType) {
        this.coolingType = coolingType;
    }

    public WheelType getWheelType() {
        return wheelType;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }

    public double getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(double fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    @Override
    public String toString() {
        return "Bike [mileage=" + mileage + ", no_of_cylinders=" + no_of_cylinders + ", price=" + price
                + ", no_of_gears=" + no_of_gears + ", coolingType=" + coolingType + ", wheelType=" + wheelType
                + ", fuelTankSize=" + fuelTankSize + "]";
    }
    
}



class TVS extends Bike{
    String makeType;

    public TVS(double mileage, double price, int no_of_cylinders, int no_of_gears, CoolingType coolingType,
            WheelType wheelType, double fuelTankSize, String makeType) {
        super(mileage, price, no_of_cylinders, no_of_gears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    public String getMakeType() {
        return makeType;
    }

    public void setMakeType(String makeType) {
        this.makeType = makeType;
    }

    @Override
    public String toString() {
        return "TVS Bike : \n mileage=" + mileage + ",\n no_of_cylinders=" + no_of_cylinders + ",\n price=" + price
                + ",\n no_of_gears=" + no_of_gears + ",\n coolingType=" + coolingType + ",\n wheelType=" + wheelType
                + ",\n fuelTankSize=" + fuelTankSize + ",\n makeType=" + makeType ;
    }
    
}
class Bajaj extends Bike{
    String makeType;

    public Bajaj(double mileage, double price, int no_of_cylinders, int no_of_gears, CoolingType coolingType,
            WheelType wheelType, double fuelTankSize, String makeType) {
        super(mileage, price, no_of_cylinders, no_of_gears, coolingType, wheelType, fuelTankSize);
        this.makeType = makeType;
    }

    public String getMakeType() {
        return makeType;
    }

    public void setMakeType(String makeType) {
        this.makeType = makeType;
    }

    @Override
    public String toString() {
        return "Bajaj Bike : \n mileage=" + mileage + ",\n no_of_cylinders=" + no_of_cylinders + ",\n price=" + price
                + ",\n no_of_gears=" + no_of_gears + ",\n coolingType=" + coolingType + ",\n wheelType=" + wheelType
                + ",\n fuelTankSize=" + fuelTankSize + ",\n makeType=" + makeType ;
    }

}

    enum CoolingType{
    AIR,
    LIQUID,
    OIL
}

enum WheelType{
    SPOKES,
    ALLOYS
}
