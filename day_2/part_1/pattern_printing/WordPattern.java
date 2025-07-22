package pattern_printing;

import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Word in UpperCase : ");
        String word = input.nextLine();
        System.out.println("Enter Column count : ");
        int col = input.nextInt();

        input.close();

        int idx = 0;

        do{
            int c = 1;
            do{
                if(idx >= word.length()) break;
                System.out.print(word.charAt(idx++));
            }while(c++ < col);
            System.out.println();
        }while(idx < word.length());
    }
}
