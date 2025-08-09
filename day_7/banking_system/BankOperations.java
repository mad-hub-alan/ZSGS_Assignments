package banking_system;

import java.util.HashMap;
import java.util.Scanner;


public class BankOperations {
    private static Scanner scan = new Scanner(System.in);
    static HashMap<Long,RBI> accounts = new HashMap<>();

    public static void createAccount(){
        System.out.println("-----Available Banks-----");
        System.out.println("         1. IOB");
        System.out.println("         2. PNB");
        System.out.println("         3. SBI");

        System.out.print("Which Bank do you like to open an Account ? : ");
        int bank = Integer.parseInt(scan.nextLine());

        System.out.println("Enter Customer Name :");
        String name = scan.nextLine();
        System.out.println("Enter password : ");
        String password = scan.nextLine();

        Customer customer = new Customer(name,password);
        Account account;
        RBI bankAccount;
        
        switch (bank) {
            case 1:
                System.out.printf("Enter initial Deposit Amount (minimum %.2f) : ",IOB.minimumBalance_IOB());
                account = new Account(name,"IOB",password,scan.nextDouble());
                bankAccount = new IOB(account, customer);
                break;
            case 2:
                System.out.printf("Enter initial Deposit Amount (minimum %.2f) : ",PNB.minimumBalance_PNB());
                account = new Account(name,"PNB",password,scan.nextDouble());
                bankAccount = new PNB(account, customer);
                break;
            case 3:
                System.out.printf("Enter initial Deposit Amount (minimum %.2f) : ",SBI.minimumBalance_SBI());
                account = new Account(name,"SBI",password,scan.nextDouble());
                bankAccount = new SBI(account, customer);
                break;
        
            default:
                System.out.println("Enter Valid Option !");
                return;
        }

        accounts.put(bankAccount.account.getAccountNumber(),bankAccount); // adds new account to accounts HashMap
    }

    public static void showAccountDetails(Long accountNumber){
        // scan.nextLine();
        System.out.println("Enter your password to Show Account Details : ");
        String password = scan.nextLine();
        if(password.equals(accounts.get(accountNumber).account.getPassword())){
            accounts.get(accountNumber).account.printAccountDetails();
        }else{
            System.out.println("\n Your Password is Incorrect! \n");
        }
    }

    public static void showCustomerDetails(Long accountNumber){
        // scan.nextLine();
        System.out.println("Enter your password to Show Customer Details : ");
        String password = scan.nextLine();
        if(password.equals(accounts.get(accountNumber).account.getPassword())){
            accounts.get(accountNumber).customer.printCustomerDetails();
        }else{
            System.out.println("\n Your Password is Incorrect! \n");
        }
    }

    public static void deleteAccount(Long accountNumber){
        // scan.nextLine();
        System.out.println("Enter your password to Delete Account : ");
        String password = scan.nextLine();
        if(password.equals(accounts.get(accountNumber).account.getPassword())){
            String name = accounts.get(accountNumber).customer.getCustomerName();
            accounts.remove(accountNumber);
            System.out.println("Your Account has Successfully deleted "+name+"!");
        }else{
            System.out.println("\n Your Password is Incorrect! \n");
        }
    }

    public static void deposit(Long accountNumber,double amount){
        // scan.nextLine();
        System.out.println("Enter your password to Deposit Amount : ");
        String password = scan.nextLine();
        if(password.equals(accounts.get(accountNumber).account.getPassword())){
            accounts.get(accountNumber).account.deposit(amount);
            System.out.println("\n Amount Deposit Succesful! \n Do you want to check your Account Balance(y/n) ?  \n");
            if(scan.nextLine().charAt(0)=='y'){
                showBalance(accountNumber);
            }
        }else{
            System.out.println("\n Your Password is Incorrect! \n");
        }
    }

    public static void withdraw(Long accountNumber,double amount){
        // scan.nextLine();
        System.out.println("Enter your password to Withdraw Amount : ");
        String password = scan.nextLine();
        if(password.equals(accounts.get(accountNumber).account.getPassword())){
            accounts.get(accountNumber).account.withdraw(amount);
            System.out.println("\n Amount withdrawal Succesful! \n Do you want to check your Account Balance(y/n) ?  \n");
            if(scan.nextLine().charAt(0)=='y'){
                showBalance(accountNumber);
            }
        }else{
            System.out.println("\n Your Password is Incorrect! \n");
        }
    }

    public static void showBalance(long accountNumber){
        // scan.nextLine();
        System.out.println("Enter your password to show Account Balance : ");
        String password = scan.nextLine();
        if(password.equals(accounts.get(accountNumber).account.getPassword())){
            System.out.println(accounts.get(accountNumber).account.getAccountBalance());    
        }
    }

    public static void showAllAccounts(){
        System.out.println("\n---------------------------------------------ACCOUNTS----------------------------------------------\n");
        System.out.printf("%-25s %-15s %-15s \n","Account Holder Name","Account Number","CustomerID");
        System.out.printf("%-25s %-15s %-15s \n","-------------------","--------------","----------");
        for(RBI rbi : accounts.values()){
            System.out.println(rbi.account);
        }
        System.out.println("\n---------------------------------------------------------------------------------------------------\n");
    }

}
