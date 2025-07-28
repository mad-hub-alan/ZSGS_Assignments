package day_6.user_defined_packages.arithmetic;

public class Mathematic {
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int divident, int divisor){
        return divident/divisor;
    }
    public static int modulo(int divident, int divisor){
        return (divident-(divident/divisor)*divisor);
    }
}
