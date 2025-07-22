import java.util.Scanner;

/*
 5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 */
public class SubsequenceOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String firstString = scan.nextLine();
        System.out.println("Enter Second String : ");
        String secondString = scan.nextLine();

        System.out.println(checkSubsequence(firstString, secondString));

        scan.close();
    }

    public static boolean checkSubsequence(String str1, String str2){
        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < str1.length() && pointer2 < str2.length()){
            if(str2.charAt(pointer2) != str1.charAt(pointer1)){
                pointer2++;
            }else if(str2.charAt(pointer2) == str1.charAt(pointer1)){
                pointer1++;
                pointer2++;
            }
        }
        return pointer1 == str1.length();
    }
}
