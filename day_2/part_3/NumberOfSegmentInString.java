import java.util.Scanner;

/*
 7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
 */

public class NumberOfSegmentInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Sentence : ");
        String sentence = scan.nextLine();

        int segments = getSegmentsOfSentence(sentence);

        System.out.println(segments);

        scan.close();
    }

    public static int getSegmentsOfSentence(String sentence){
        String word = "";
        int segmentCount = 0;

        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                if(word.length() != 0){
                    segmentCount++;
                    word = "";
                }
                continue;
            }
            word += sentence.charAt(i);
        }
        if(word.length() > 0) segmentCount++;
        return segmentCount;
    }
}
