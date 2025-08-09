package day_9.exception_6;

public class Exception_6 {
    public static void main(String[] args){
        try{

            validatePIN("1234");    // Valid PIN
            // validatePIN("444");     // PIN doesn't have 4 digits
            // validatePIN("0123");    // PIN has '0' as a first character
            // validatePIN("8H5Y");    // PIN has Non-numeric characters

        }catch(PIN_InvalidDigitException ex){
            ex.printStackTrace();
        }catch(PIN_FirstDigitZeroException ex){
            ex.printStackTrace();
        }catch(PIN_InvalidCharacterException ex){
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void validatePIN(String pin) throws Exception{
        if(!(pin.length() == 4)){
            throw new PIN_InvalidDigitException("Your PIN should have 4 digits!...\n");
        }
        if(pin.charAt(0) == '0'){
            throw new PIN_FirstDigitZeroException("Your PIN Should not have '0' as First Digit!...\n");
        }
        for(char c : pin.toCharArray()){
            if(!(c >= 48 && c <= 57)){
                throw new PIN_InvalidCharacterException("Your PIN should have only Numeric Characters!...\n");
            }
        }

        System.out.println("\n Your PIN is valid! You are good to go... \n");
    }
}
