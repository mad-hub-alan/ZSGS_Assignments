package payment_gateway_system.payment_methods;

import payment_gateway_system.PaymentMethod;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void makePayment() {
        System.out.println("Payment done through CreditCard!");
    }
}
