package day_6.payment_gateway;

import java.util.Scanner;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PaymentGateway myPayment = new PaymentGateway();

        System.out.println("-------------------------------Welcome to Payment Portal!--------------------------------\n");

        System.out.println("Available Payment Modes :");
        System.out.println("\t 0. UPI");
        System.out.println("\t 1. Credit Card");
        System.out.println("\t 2. Debit Card");
        System.out.println("\t 3. Net Banking");
        System.out.println("\t 4. Wallet \n");

        System.out.println("Choose your Payment Mode : ");
        myPayment.setPaymentMethod(PaymentMethod.values()[scan.nextInt()]);
        scan.nextLine();

        System.out.println("Enter Payee Name : ");
        myPayment.setPayeeName(scan.nextLine());

        System.out.println("Enter Transaction Amount : ");
        myPayment.setAmout(scan.nextDouble());

        System.out.println("\n Your Transaction Successful!");

        System.out.println();

        myPayment.printTransactionSummary();
    }
}
