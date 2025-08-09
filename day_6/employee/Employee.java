package day_6.employee;

public class Employee {
    private int employeeId;
    private String name;
    private String designation;
    private String department;
    private int monthlySalary;

    
    public Employee(int employeeId, String name, String designation, String department, int monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }


    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateAnnualSalary(){
        return this.getMonthlySalary()*12;
    }
}


// 3. Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.