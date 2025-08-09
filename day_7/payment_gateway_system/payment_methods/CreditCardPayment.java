package payment_gateway_system.payment_methods;

import payment_gateway_system.PaymentMethod;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment done!");
        System.out.println('₹'+amount+" Transferred through Credit card.");
    }
}
