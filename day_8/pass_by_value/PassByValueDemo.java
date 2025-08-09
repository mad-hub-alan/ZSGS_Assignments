package day_8.pass_by_value;

public class PassByValueDemo {
    public static void main(String[] args) {
        int number = 100; 

        System.out.print("Number Before call 'increment' method : "+number);
        
        increment(number); // calling increment method with my value

        // value of 'number' is not changed
        System.out.print("\nNumber After called 'increment' method : "+number);
    }

    public static void increment(int num){
        num = num + 10; // incrementing
    }
}
