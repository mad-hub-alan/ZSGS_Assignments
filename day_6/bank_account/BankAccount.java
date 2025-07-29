package day_6.bank_account;

import java.util.Scanner;

public class BankAccount {
    private Scanner scan = new Scanner(System.in);
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber() {
        this.accountNumber = (long)(123400000000l+ (Math.ceil(Math.random()*10000)));
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // methods
    public BankAccount createAccount(String name){
        this.setAccountHolderName(name);
        this.setAccountNumber();
        return this;
    }

    public void deposit(int amount){
        if(amount < 0){
            System.out.println("Enter Valid Amount!");
            System.exit(1); // exit from program
        }
        this.balance += amount;
        // System.out.println("Do you want to check your Bank balance? (y/n)");
        // char option = scan.nextLine().charAt(0);
        // if(option == 'y' || option == 'Y') showBalance();
        // System.out.println("Thanks for banking with us! Have a Nice day");
    }

    public void showBalance(){
        System.out.println("Your Balance : "+this.balance);
    }

    public void withdraw(int amount){
        if(this.balance < amount){
            System.out.println("Insufficient Funds!");
            System.out.println("Do you want to check your Bank balance? (y/n)");
            char option = scan.nextLine().charAt(0);
            if(option == 'y' || option == 'Y'){
                showBalance();
                System.out.println("Please try with Same or less amount as your Balance !");
                System.out.print("Enter valid amount to withdraw : ");
                amount = scan.nextInt();
                scan.nextLine();
            }
        }
        this.balance -= amount;
        // System.out.println("Do you want to check your Bank balance? (y/n)");
        // char option = scan.nextLine().charAt(0);
        // if(option == 'y' || option == 'Y') showBalance();
        // System.out.println("Thanks for banking with us! Have a Prosperous day");
    }

    public void showAccountdetails(){
        System.out.println("-------------------Account Details--------------------\n");
        System.out.println("Account Holder Name : "+this.getAccountHolderName());
        System.out.println("Account Number : "+this.getAccountNumber());
        System.out.println("Account Balance : "+this.getBalance());
    }
}
