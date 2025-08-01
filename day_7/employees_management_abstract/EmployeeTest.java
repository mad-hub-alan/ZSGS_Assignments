package employees_management_abstract;

import java.util.Scanner;

public class EmployeeTest {
    private static Scanner scan = new Scanner(System.in);
    private static Employee emp;
    public static void main(String[] args) {

        System.out.println("-----Employee Types-----\n");

        System.out.println("1. FullTime Employee");
        System.out.println("2. PartTime Employee\n");

        System.out.print("\nEnter Employee Type : ");
        int empType = scan.nextInt();

        scan.nextLine();

        if(empType == 1){
            emp = new FullTimeEmployee();   // FullTime employee instance

            System.out.print("\nEnter Employee Name : ");
            String empName = scan.nextLine();
            emp.setEmployeeName(empName);
        }else if(empType == 2){
            emp = new PartTimeEmployee();   // ParTime employee instance

            System.out.print("\nEnter Employee Name : ");
            String empName = scan.nextLine();
            emp.setEmployeeName(empName);
        }else{
            System.out.println("Wrong Choice! Please Try Again...");
            return;
        }

        emp.printEmployeeDetails();
    }
}
