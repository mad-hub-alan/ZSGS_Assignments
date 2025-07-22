public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(101, "Apache 160", 1_15_000);
        Vehicle vehicle2 = new Vehicle(134, "NS 200", 1_45_000);
        Vehicle vehicle3 = new Vehicle(111, "Activa 6G", 1_20_000);
        Vehicle vehicle4 = new Vehicle(444, "Avenger 160", 1_35_000);

        System.out.println("Total objects created : "+ Vehicle.vehicleCount);
    }
}

class Vehicle{
    public static int vehicleCount = 0; //static variable

    int vehicle_id;
    String name;
    double price;

    public Vehicle(int vehicle_id,String name,double price){
        vehicleCount++; //increment when 
        this.vehicle_id = vehicle_id;
        this.name = name;
        this.price = price;
    }
}


/*
 4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.
 */