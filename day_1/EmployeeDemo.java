public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(10014, "Madhubalan M", "CRM", 1_40_000);
        System.out.println(emp);
    }
}

class Employee{
    long empId;
    String name;
    String department;
    double salary;

    Employee(long empId, String name, String department, double salary){
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // I'm overriding toString() method to print state of the object.
    @Override
    public String toString() {
        return " Emp_Name : "+this.name+"\n Emp_Id : "+this.empId+"\n Department : "+this.department+"\n Salary : "+this.salary;
    }
}
