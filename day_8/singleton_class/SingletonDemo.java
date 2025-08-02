package day_8.singleton_class;

public class SingletonDemo {
    public static void main(String[] args) {
        
        DB_Connection dbConnection1 = DB_Connection.getInstance(); // first instance
        
        DB_Connection dbConnection2 = DB_Connection.getInstance(); // second instance

        System.out.println("First instance : "+dbConnection1);
        System.err.println("Second instance : "+dbConnection2); 

        System.out.println("\nTwo instances have same Hashcode. So everytime Singleton class returns same object.");
    }
}
