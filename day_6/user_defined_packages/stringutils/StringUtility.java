package user_defined_packages.stringutils;

public class StringUtility {
    public static int length(String str){
        int count = 0;
        for(char c : str.toCharArray()) count++;
        return count;
    }

    public static String concat(String str1, String str2){
        String res = "";
        for(int i=0; i<str1.length(); i++) res += str1.charAt(i);
        res += " ";
        for(int i=0; i<str2.length(); i++) res += str2.charAt(i);
        return res;
    }

    public static String reverse(String str){
        String res = "";
        for(int i=str.length()-1; i>=0; i--) res += str.charAt(i);
        return res;
    }
}
