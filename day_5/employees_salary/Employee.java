package employees_salary;

public abstract class Employee {
    protected int employeeId;
    protected String employeeName;
    
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    protected abstract double calculateSalary();    
    protected abstract void printEmployeeDetails();    
}
