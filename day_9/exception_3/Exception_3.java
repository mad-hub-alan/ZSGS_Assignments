package day_9.exception_3;

/*
 3. Write a program to illustrate how to throw a ClassNotFoundException.
 */

public class Exception_3 {
    public static void main(String[] args) {
        
        try{
            // I'm manually loading a non-existing class at run-time!
            Class.forName("HomoSapien"); 
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("\n Exception Handled Successfully! \n");
    }
}
