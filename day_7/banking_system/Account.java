package banking_system;

public class Account {
    Customer customer; // Customer instance
    long accountNumber;
    String customerID;
    double accountBalance;
    double withdrawLimit;
    double minimumBalance;
    
    public Account(Customer customer,long accountNumber, String customerID, double accountBalance,double withdrawLimit,double minimumBalance) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        // this.customerID = customerID;
        this.accountBalance = accountBalance;
        this.withdrawLimit = withdrawLimit;
        this.minimumBalance = minimumBalance;
    }

    public Account() {
    }

    // getters and setters

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber() {
        this.accountNumber = (long)(12345678910000l+Math.ceil(Math.random()*87654321123456l));
    }

    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String bank) {
        this.customerID = bank+(int)(10000000+Math.ceil(Math.random()*87654321));
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setWithdrawLimit(double limit){
        this.withdrawLimit = limit;
    }
    public double getWithdrawLimit(){
        return this.withdrawLimit;
    }
    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
    

    //methods


    public void deposit(double amount){
        if(amount > 0){
            this.accountBalance += amount; 
        }else{
            System.out.println("Please Enter Valid Amount!");
        }
    }

    public void withdraw(double amount){
        if(amount <= this.accountBalance && amount <= withdrawLimit){
            if(this.accountBalance - amount >= this.minimumBalance){
                this.accountBalance -= amount;
            }else{
                System.out.println("Please Enter lesser Amount!");
            }
        }
    }

    public void printAccountDetails(){
        System.out.println("-----------------Account Details--------------------");
        System.out.println("Account Holder Name : "+this.customer.customerName);
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("Customer ID : "+this.customerID);
        System.out.println("Account Balance : ₹"+this.accountBalance);
        System.out.println("----------------------------------------------------");
    }
    
}
