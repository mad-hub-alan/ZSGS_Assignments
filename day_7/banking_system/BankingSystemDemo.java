package banking_system;

import java.util.Scanner;

public class BankingSystemDemo {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Customer Name :");
        String name = scan.nextLine();

        Customer customer = new Customer(name);
        
        Account account = new Account();
        account.setCustomer(customer);
        account.setCustomerID("SBI");
        account.setAccountNumber();
        account.setAccountBalance(1000);
        account.setWithdrawLimit(50000);

        account.printAccountDetails();
        account.customer.printCustomerDetails();
    }
}
