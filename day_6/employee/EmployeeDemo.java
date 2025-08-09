package day_6.employee;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(1234, "Madhu", "Software developer", "Development", 140000);
    
        System.out.println(emp.calculateAnnualSalary());
    }
}
