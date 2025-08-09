package day_6.payment_gateway;

public class PaymentGateway {
    private int transactionID;
    private String payeeName;
    private double amout;
    private PaymentMethod paymentMethod;
    private TransactionStatus transactionStatus;
    
    public PaymentGateway(){
        setTransactionID();
        setTransactionStatus();
    }
    
    public PaymentGateway(String payeeName, double amout, PaymentMethod paymentMethod) {
        this.payeeName = payeeName;
        this.amout = amout;
        this.paymentMethod = paymentMethod;
        setTransactionID();
        setTransactionStatus();
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID() {
        this.transactionID = ((int)(54273898+Math.ceil(Math.random()*10000000)));
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus() {
        this.transactionStatus = TransactionStatus.values()[(int)(Math.floor(Math.random()*3))];
    }
    
    public void printTransactionSummary() {
        System.out.println("-------------TRANSACTION SUMMARY------------");
        System.out.println();
        System.out.println("Transaction Id : "+this.getTransactionID());
        System.out.println("Payee Name : "+this.getPayeeName());
        System.out.println("Amount : "+this.getAmout());
        System.out.println("Payment Method : "+this.getPaymentMethod());
        System.out.println("Transaction Status : "+this.getTransactionStatus());
        System.out.println();
        System.out.println("-------------------------------------------");
    }

}

enum PaymentMethod{
    UPI,
    CREDIT_CARD,
    DEBIT_CARD,
    NET_BANKING,
    WALLET
}

enum TransactionStatus{
    SUCCESS,
    PENDING,
    FAILED
}


// transaction ID, payer name, payee name, amount, payment method, and transaction status.