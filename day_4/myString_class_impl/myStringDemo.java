import javax.sql.rowset.spi.SyncResolver;

public class myStringDemo {
    public static void main(String[] args) {

        MyString str = new MyString("MaDhu");
        MyString strTest = new MyString("Maddy");
        MyString userName = new MyString("mad_hub_alan");

        System.out.println("length() : "+str.length());
        System.out.println("charAt() : '"+userName.charAt(9)+"'");
        System.out.println("equals() : "+str.equals(strTest));
        System.out.println("toUpper() : "+str.toUpperCase());
        System.out.println("Original MyStr : "+str);
        System.out.println("toLower() : "+str.toLowerCase());
        System.out.println("substring() : "+userName.substring(0,userName.length()));
        System.out.println("concat() : "+userName.concat(strTest));
        System.out.println("contains() : "+userName.contains(strTest));
        System.out.println("indexOf() : "+userName.indexOf('h'));
        System.out.println("replace() : "+userName.replace('a','x'));
        
        System.out.println();

        System.out.println("charAt() : "+userName.charAt(-1)); // exception throws
        System.out.println("---------------------------------------------");

        System.out.println("substring() : "+userName.substring(0,15)); //exception throws

        System.out.println("---------------------------------------------");
    }
}
