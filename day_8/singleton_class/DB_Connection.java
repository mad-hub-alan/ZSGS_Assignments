package day_8.singleton_class;

public class DB_Connection {
    private static DB_Connection dataBase; // private static instance

    // private constructor
    private DB_Connection(){
        System.out.println("Database Connected Succesfully!\n");
    }

    // public static method
    public static DB_Connection getInstance(){
        if(dataBase == null){
            dataBase = new DB_Connection();
        }
        return dataBase;
    }
}
