package banking_system;

public class Account {
    private long accountNumber;
    private String password;
    private String accountHolderName;
    private String customerID;
    private double accountBalance;
    private double withdrawLimit;
    private double minimumBalance;
    
    public Account(long accountNumber, String accountHolderName, String customerID, double accountBalance,double withdrawLimit,double minimumBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.customerID = customerID;
        this.accountBalance = accountBalance;
        this.withdrawLimit = withdrawLimit;
        this.minimumBalance = minimumBalance;
    }

    public Account(String accountHolderName, String bank, String password, double initialAmount) {
        this.setAccountHolderName(accountHolderName);
        this.setAccountNumber();
        this.setCustomerID(bank);
        this.setAccountBalance(initialAmount);
        this.setPassword(password);
    }

    // getters and setters

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber() {
        this.accountNumber = (long)(123400000000l+Math.ceil(Math.random()*9999l));
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
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
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
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
                System.out.println("Withdraw Limit Exceeded! Please Enter lesser Amount!");
            }
        }
    }

    public void printAccountDetails(){
        System.out.println("-----------------Account Details--------------------");
        System.out.println("Account Number      : "+this.accountNumber);
        System.out.println("Account Holder Name : "+this.accountNumber);
        System.out.println("Customer ID         : "+this.customerID);
        System.out.println("Withdrawal Limit    : "+this.withdrawLimit);
        System.out.println("Minimum Balance     : "+this.minimumBalance);
        // System.out.println("Account Balance : ₹"+this.accountBalance);
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return String.format("%-25s %-15d %-15s",this.accountHolderName,this.accountNumber,this.customerID);
    }
}
