package payment_gateway_system;

import java.util.Scanner;

import payment_gateway_system.payment_methods.CreditCardPayment;
import payment_gateway_system.payment_methods.DebitCardPayment;
import payment_gateway_system.payment_methods.UPIpayment;

public class PaymentGatewayDemo {
    private static PaymentMethod myPayment;
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n----------------- Welcome to Payment Gateway --------------\n");
        System.out.println("--Available Payment Methods--\n");
        System.out.println("1. UPI");
        System.out.println("2. Debit Card");
        System.out.println("3. Credit Card \n");
        
        System.out.print("Enter Your Choice : ");
        
        byte option = scan.nextByte();
        
        System.out.println();

        switch (option) {
            case 1:
            myPayment = new UPIpayment();
            break;
            case 2:
            myPayment = new DebitCardPayment();
            break;
            case 3:
            myPayment = new CreditCardPayment();
            break;
            default:
            System.out.println("Please Try Again and Enter Valid Option!");
            return;
        }
        
        myPayment.makePayment();    // calling method with polymorphic reference
        
        System.out.println("\n----------------------- Have a nice day! ------------------\n");
        
    }
}
