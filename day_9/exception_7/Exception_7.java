package day_9.exception_7;

/*
 7. Write a Java program that shows exception propagation across multiple methods 
 (method1 calls method2 calls method3, which throws the exception). 
 Handle the exception in method1.
 */

public class Exception_7 {
    public static void main(String[] args) {
        System.out.println("\n ----Excecution Begins!---- \n");
        method1(); // calling method-1
        System.out.println("\n ----Excecution Ends!---- \n");
    }

    
    
    public static void method1(){
        System.out.println("\n ----Inside Method-1---- \n");
        try{
            method2();  // caling method-2
        }catch(ArithmeticException ex){
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("\n Exception Handled in method-1 ! \n");
    }

    public static void method2() throws ArithmeticException{
        System.out.println("\n ----Inside Method-2---- \n");
        method3();  // calling method-3, which throws Arithmatic Exception!
    }

    public static void method3() throws ArithmeticException{
        System.out.println("\n ----Inside Method-3---- \n");
        int number = 44/0;  // this statement will throw an ArithmaticException!
        System.out.println(number);
    }
}
