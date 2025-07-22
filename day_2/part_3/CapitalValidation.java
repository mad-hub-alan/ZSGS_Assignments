import java.util.Scanner;

public class CapitalValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word to validate : ");
        String word = scan.nextLine();

        boolean validWord = capitalValidation(word);

        if(validWord){
            System.err.println("Given word is correctly Capitalized");
        }else{
            System.err.println("Given word is wronly Capitalized!");
        }
        
        scan.close();
    }

    public static boolean capitalValidation(String word){
        int count = 0;

        for(int i=0; i<word.length(); i++){
            if(isCapital(word.charAt(i))) count++;
        }

        if(count == word.length() || count == 0) return true;
        else if(count == 1 && isCapital(word.charAt(0))) return true;
        return false;
    }

    public static boolean isCapital(char c){
        if(c >= 'A' && c <= 'Z') return true;
        return false;
    }
}
