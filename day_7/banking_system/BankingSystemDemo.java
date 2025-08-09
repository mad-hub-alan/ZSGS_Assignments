package banking_system;

import java.util.Scanner;

public class BankingSystemDemo {
    static Scanner scan = new Scanner(System.in); 
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        System.out.println("1. Create New Bank Account");
        System.out.println("2. Show Account Details");
        System.out.println("3. Show Customer Details");
        System.out.println("4. Balance Enquery");
        System.out.println("5. Delete your Account");
        System.out.println("6. Deposit");
        System.out.println("7. Withdraw");
        System.out.println("8. Show All Accounts");
        System.out.println("0. Exit");

        System.out.print("\n Enter your choice :  \n");
        int choice = scan.nextInt();
        scan.nextLine();

        long acc;

        switch (choice) {
            case 1:
                BankOperations.createAccount();
                break;
            case 2:
                System.out.print("\n Enter your Account Number : ");
                acc = Long.parseLong(scan.nextLine());
                scan.nextLine();
                BankOperations.showAccountDetails(acc);
                break;
            case 3:
                System.out.print("\n Enter your Account Number : ");
                acc = Long.parseLong(scan.nextLine());
                scan.nextLine();
                BankOperations.showCustomerDetails(acc);
                break;
            case 4:
                System.out.print("\n Enter your Account Number : ");
                acc = Long.parseLong(scan.nextLine());
                scan.nextLine();
                BankOperations.showBalance(acc);
                break;
            case 5:
                System.out.print("\n Enter your Account Number : ");
                acc = Long.parseLong(scan.nextLine());
                scan.nextLine();
                BankOperations.deleteAccount(acc);
                break;
            case 6:
                System.out.print("\n Enter your Account Number : ");
                acc = Long.parseLong(scan.nextLine());
                System.out.print("\nEnter Amount to Deposit : ");
                double depAmount = Double.parseDouble(scan.nextLine());
                scan.nextLine();
                BankOperations.deposit(acc,depAmount);
                break;
            case 7:
                System.out.print("\n Enter your Account Number : ");
                acc = Long.parseLong(scan.nextLine());
                System.out.print("\nEnter Amount to Withdraw : ");
                double withAmount = Double.parseDouble(scan.nextLine());
                scan.nextLine();
                BankOperations.deposit(acc,withAmount);
                break;
            case 8:
                BankOperations.showAllAccounts();
                break;
            case 0:
                return;

        }
        menu();
    }
    
}
