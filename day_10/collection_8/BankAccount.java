package day_10.collection_8;

public class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private Double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance; // auto-boxing
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showAccountDetails(){
        System.out.println("----------------------ACCOUNT DETAILS-----------------------------");
        System.out.printf("\n Account Holder Name : %s \n Account Number      : %d \n Account Balance     : %.2f \n",this.accountHolderName,this.accountNumber,this.balance);
    }

    public Double calculateInterest(){
        double interestRate = 5;
        double interest = (this.balance * Double.valueOf(interestRate))/100;
        return Double.valueOf(interest); // Manual Boxing
    }

    public void showNewBalance(){
        System.out.printf("\n Your interest for this Year is : Rs.%.2f \n",calculateInterest());
        System.out.printf("\n Your new Balance after apply interest is : Rs.%.2f \n\n",calculateInterest()+this.balance);
    }
    
}
