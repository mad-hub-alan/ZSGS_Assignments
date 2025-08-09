package day_10.collection_8;

import java.util.ArrayList;
import java.util.Scanner;

/*
 8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
        a. accountNumber (int)
        b. holderName (String)
        c. balance (double)
        --->Use autoboxing to store the balance and interest as Double wrapper objects.
        --->Use manual boxing to convert a primitive interest rate into a Double object.
        --->Unbox the values (both automatic and manual) to calculate and update the new balance.
        --->Add at least three Account objects to an ArrayList<Account>.
        --->For each account:
        a. Display the holder name, account number, original balance
        b. Apply 5% interest
        c. Show the new balance using primitive values (unboxed).
 */

public class BankDemo {

    static ArrayList<BankAccount> accounts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How much Bank Accounts do you want to create? : ");
        int count = scan.nextInt();
        scan.nextLine();

        // create BankAccounts and push them into ArrayList
        for(int i=1; i<=count; i++){
            System.out.println("\n Account : "+i);
            System.out.print("\nEnter Account Holder's Name : ");
            String name = scan.nextLine();
            int accNo = (int)Math.ceil(10000000+Math.random()*12345678);
            System.out.print("\nEnter your initial balance : ");
            double balance = scan.nextDouble();
            scan.nextLine();

            accounts.add(new BankAccount(name, accNo, balance));
        }

        // printing Account Details
        for(BankAccount acc : accounts){
            acc.showAccountDetails();
            acc.showNewBalance();
        }

        scan.close();

    }
}
