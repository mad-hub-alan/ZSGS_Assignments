package day_6.bank_account;

import java.util.Scanner;

public class BankAccountDemo {
    static Scanner scan = new Scanner(System.in);
    static BankAccount acc; // static account instance
    public static void main(String[] args) {
        System.out.println("\n-----------------------------Welcome to Nameless Bank--------------------------\n");

        System.out.println("\n-----------------Create Account------------------\n");

        BankAccount temp = new BankAccount();
        System.out.print("Enter 'Account Holder's Name' : ");
        acc = temp.createAccount(scan.nextLine());

        System.out.println("Congratulations "+acc.getAccountHolderName()+"! Your Account created successfully.\n");
        System.out.println("Your Account Number is : "+acc.getAccountNumber());

        banking();

        System.out.println("\n-------------Thank you for Banking with Us! Have a Prosperous day!------------\n");
        
    }

    

    public static void banking(){
        System.out.println("\n----------------Banking Options--------------\n");
        System.out.println(" 1. Deposit");
        System.out.println(" 2. Withdraw");
        System.out.println(" 3. Check Balance");
        System.out.println(" 4. Print Account Details");
        System.out.println(" 0. Exit! \n");

        System.out.print("\nChoose your option : ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                System.out.print("\nEnter Deposit Amount : ");
                acc.deposit(scan.nextInt());
                break;
            case 2:
                System.out.print("\nEnter Withdraw Amount : ");
                acc.withdraw(scan.nextInt());
                break;
            case 3:
                System.out.println("Your Acoount Balance : Rs."+acc.getBalance());
                break;
            case 4:
                acc.showAccountdetails();
                break;
            case 0:
                // System.exit(0);
                return;
            default:
                System.out.println("Please Enter Valid Option!!!");
                break;
        }
        banking();
    }
}
