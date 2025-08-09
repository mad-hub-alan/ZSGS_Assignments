package vehicle_information;

public class VehicleTest {
    public static void main(String[] args) {
        Audi myAudi = new Audi(10, 3000000, 4000000, 2, 4, FuelType.PETROL, "A6");
        Ford myFord = new Ford(15, 2500000, 3000000, 3, 5, FuelType.ELECTRIC, "M16");

        TVS myTvs = new TVS(55, 80000, 4, 5, CoolingType.OIL, WheelType.ALLOYS, 13, "Apache 180 RTR");
        Bajaj myBajaj = new Bajaj(50, 85000, 4, 6, CoolingType.LIQUID, WheelType.ALLOYS, 14, "NS 200");

        System.out.println("My Audi details : "+myAudi);
        System.out.println();
        System.out.println("My Ford details : "+myFord);
        System.out.println();
        System.out.println("My TVS details : "+myTvs);
        System.out.println();
        System.out.println("My Bajaj details : "+myBajaj);
    }
}


/*
1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol)
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
*/
