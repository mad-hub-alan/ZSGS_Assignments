import java.util.Scanner;

/*
 3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
 */

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String word = input.nextLine();

        String reversedVowelString = reversVowels(word);

        System.out.println("Reversed Vowel String --> "+reversedVowelString);

        input.close();
    }

    public static String reversVowels(String str){
        StringBuilder word = new StringBuilder(str);
        int left = 0;
        int right = word.length()-1;

        while(left <= right){
            if(!isVowel(word.charAt(left))){
                left++;
                continue;
            } 
            if(!isVowel(word.charAt(right))){
                right--;
                continue;
            } 
            if(isVowel(word.charAt(left)) && isVowel(word.charAt(right))){
                char temp = word.charAt(left);
                word.setCharAt(left, word.charAt(right));
                word.setCharAt(right, temp);
                left++;
                right--;
            }
        }
        return word.toString();
    }

    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }else if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}
