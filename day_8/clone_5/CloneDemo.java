package day_8.clone_5;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        // creating MobilePhone instances
        MobilePhone mySamsung = new MobilePhone("Samsung", "S25-Ultra", 154000);
        MobilePhone myApple = new MobilePhone("iPhone", "15-ProMax", 148000);

        // display instances
        System.out.println("mySamsung's HashCode : "+mySamsung.hashCode());
        System.out.println(mySamsung);
        System.out.println("myApple's HashCode : "+myApple.hashCode());
        System.out.println(myApple);
        
        // cloning mySamsung instance
        MobilePhone newSamsung = (MobilePhone)mySamsung.clone();
        // newSamsung.setPrice(160000);
        
        //HashCode is different from 'mySamsung'
        System.out.println("Cloned newSamsung's HashCode : "+newSamsung.hashCode());
        System.out.println(newSamsung);
    }
}
