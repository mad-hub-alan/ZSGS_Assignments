package day_9.exception_5;

/*
 5. Create a program where try block contains a return statement.
  Ensure that finally block executes before the method returns. Show this with output.
 */

public class Exception_5 {
    public static void main(String[] args) {
        String pattern = getPattern(10);
        System.out.println("Pattern : "+pattern);
        System.out.println();
    }

    public static String getPattern(int x){
        try{
            String res = "";
            for(int i=1; i<=x; i++){
                res += "* ";
            }
            return res;
        }finally{
            // this statement executes before return statement!
            System.out.println("\n From Finally Block! \n"); 
        }
    }
}
