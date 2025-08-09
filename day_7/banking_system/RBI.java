package banking_system;


public abstract class RBI {
    public static final double minimumInterest = 5; 
    public static final double maximumWithdrawal = 50000.0; 
    public static final double minimumBalance = 1000.0; 

    protected Account account;  // Account instance - (Has-A relationship)
    protected Customer customer;  // Customer instance - (Has-A relationship)

    public RBI(Account account, Customer customer) {
        this.account = account;
        this.customer = customer;
    }

    //abstract methods
    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();

}
