package employees_management_abstract;

public abstract class Employee{
    protected int employeeId;
    protected String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    public Employee(){

    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId() {
        this.employeeId = (int)(3200000+Math.ceil(Math.random()*100));
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public abstract double calculateSalary();    // abstarct method
    public abstract void printEmployeeDetails();    //abstract method
}
