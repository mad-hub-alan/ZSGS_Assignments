package day_8.to_string;

public class ToStringDemo {
    public static void main(String[] args) {
        
        // creating Book instances
        Book book1 = new Book("Sapiens","Yuval Noah Harrari",233_65_31,320);
        Book book2 = new Book("Hack The Tech","Rajat Grover",876_53_63,112);
        Book book3 = new Book("The Diary of a Young Girl","Anne Frank",865_73_24,343);


        // Implicitly invoking Book.toString() method
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }    
}
