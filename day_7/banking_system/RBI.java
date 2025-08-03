package banking_system;

import java.util.Scanner;

public abstract class RBI {
    private Scanner scan = new Scanner(System.in);
    public final double minimumInterest = 5; 
    public final double maximumWithdrawal = 50000.0; 
    public final double minimumBalance = 1000.0; 

    protected Account acc;  // Account instance - (Has-A relationship)

    public RBI(Account acc){
        this.acc = acc;
    }
    public RBI(){
        
    }

    //abstract methods
    public abstract double getInterestRate();
    public abstract double getWithdrawalLimit();
    public abstract double getMinimumBalance();

    public void createAccount(){
        System.out.print("Enter Customer Name : ");
        Customer customer = new Customer(scan.nextLine());
        acc = new Account();
        
        acc.setAccountBalance(scan.nextDouble());
        acc.setCustomer(customer);
        acc.setAccountNumber();
    }
}
