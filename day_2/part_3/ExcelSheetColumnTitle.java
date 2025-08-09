import java.util.Scanner;

/*
 2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
 */

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Excel sheet Column Number :");
        int columnNumber = scan.nextInt();

        String columnTitle = getColumnTitle(columnNumber);

        System.out.println("Column Title : '"+columnTitle+"'");

        scan.close();
    }
    public static String getColumnTitle(int col) {
        String res = "";

            while(col != 0){
                res += (char)((--col)%26 + 65);
                col = col/26;
            }
        String revRes = "";
        
        for(int i=res.length()-1; i>=0; i--){
            revRes += res.charAt(i);
        }

        return revRes;
    }
}
