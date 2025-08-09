package day_9.exception_4;

/*
 4. Write a method to parse a string to an integer. 
 Throw an exception if the string is not a valid number. Handle it using try-catch.
 */

public class Exception_4{
    public static void main(String[] args) {
        try{
            int number = parseInteger("214723231"); 
            System.out.println("number : "+number); // prints String as int value

            int number2 = parseInteger("1234H"); // will throw exception!
            System.out.println("number2 : "+number2);

        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }

        System.out.println("\n Exception Handled! \n");

    }

    public static int parseInteger(String str) throws NumberFormatException{
        int num = 0;
        for(char c : str.toCharArray()){
            if((c >= 48 && c <= 57)){ // checking current char is number or not
                num += (int)(c-48);
                num *= 10;
            }else{
                throw new NumberFormatException(); // throw Exception
            }
        }
        return num/10;
    }
}