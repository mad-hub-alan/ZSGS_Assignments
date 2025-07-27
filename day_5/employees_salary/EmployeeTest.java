package employees_salary;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(4, "Madhu", 2, 1, 19, 2050);
        Employee emp2 = new PartTimeEmployee(13, "Sam", 20, 4, 250);

        emp1.printEmployeeDetails();
        System.out.println();
        emp2.printEmployeeDetails();
    }
}
