package day_9.exception_8;

import java.util.Scanner;

/*
 8. Design a login system that throws AuthenticationException 
 if the username or password is incorrect. 
 Handle it and display a login failure message.
 */

 /*
            ****** CONSTRAINTS FOR USERNAME AND PASSWORD ******

            # Username must contains only 'lowercase English alphabets' and maximum two 'underscores'
            # Password must contains 8 characters or above and must follow the requirements
                -> Must contain a UpperCase English Alphabet
                -> Must contain a LowerCase English Alphabet
                -> Must contain a Special Character (Only allowed !,@,#,$,%,?,&,*)
  */

public class Exception_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n-------------------------------------LOG-IN--------------------------------------\n");
        System.out.print("Enter UserName : ");
        String userName = scan.nextLine();
        System.out.print("Enter Password : ");
        String password = scan.nextLine();

        boolean isValidUserName = false;
        boolean isValidPassword = false;
        try{

            isValidUserName = validateUserName(userName);
            isValidPassword = validatePassword(password);

        }catch(UsernameInvalidCharacterException ex){
            System.out.println("\n-------------Failed to Log-in!-------------\n");
            ex.printStackTrace();
        }catch(UsernameUnderscoreLimitExceededException ex){
            System.out.println("\n-------------Failed to Log-in!-------------\n");
            ex.printStackTrace();
        }catch(PasswordMinimumCharacterException ex){
            System.out.println("\n-------------Failed to Log-in!-------------\n");
            ex.printStackTrace();
        }catch(PasswordUpperCaseException ex){
            System.out.println("\n-------------Failed to Log-in!-------------\n");
            ex.printStackTrace();
        }catch(PasswordLowerCaseException ex){
            System.out.println("\n-------------Failed to Log-in!-------------\n");
            ex.printStackTrace();
        }catch(PasswordSpecialCharacterException ex){
            System.out.println("\n-------------Failed to Log-in!-------------\n");
            ex.printStackTrace();
        }catch(Exception ex){
            System.out.println("\n-------------Failed to Log-in!-------------\n");
            ex.printStackTrace();
        }

        if(isValidUserName && isValidPassword){ // if both username and password are valid print this
            System.out.println("\n\n--------------------Log-in Successful!----------------------\n\n");
        }

    }

    // method to validate given username
    public static boolean validateUserName(String userName) throws Exception{
        int underScoreCount = 0;
        boolean inValidChars = false;

        for(char c : userName.toCharArray()){
            if(c == '_') underScoreCount++;
            if(!((c >= 'a' && c <= 'z') || (c == '_'))) inValidChars = true;
        }
        if(inValidChars) throw new UsernameInvalidCharacterException("UserName shouldn't contain Invalid Characters!");
        if(underScoreCount > 2) throw new UsernameUnderscoreLimitExceededException("UserName must contain 2 or less Underscores!");

        return true;
    }

    // method to validate given password
    public static boolean validatePassword(String password) throws Exception{
        if(password.length() < 8) throw new PasswordMinimumCharacterException("Password must be 8 Characters or more!"); 
        
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;

        for(char c : password.toCharArray()){
            if(c >= 'A' && c <= 'Z') containsUpperCase = true;
            if(c >= 'a' && c <= 'z') containsLowerCase = true;
            if(c >= '0' && c <= '9') containsNumber = true;
            if((c=='!')||(c=='@')||(c=='#')||(c=='$')||(c=='%')||(c=='&')||(c=='*')||(c=='?')) containsSpecialCharacter = true;
        }

        if(!containsUpperCase) throw new PasswordUpperCaseException("Password must contain atleast one UpperCase character!");
        if(!containsLowerCase) throw new PasswordLowerCaseException("Password must contain atleast one LowerCase character!");
        if(!containsNumber) throw new PasswordNumbericCharacterException("Password must contain atleast one Numeric character!");
        if(!containsSpecialCharacter) throw new PasswordSpecialCharacterException("Password must contain atleast one Special character!");

        return true;
    }
}
