public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Madhu",4,"Software Developer",1_40_000);
        Employee employee3 = new Employee(employee2);

        employee1.displayEmployeeDetails();
        System.out.println();
        employee2.displayEmployeeDetails();
        System.out.println();
        employee3.displayEmployeeDetails();
        
    }
}

class Employee{
    String name;
    int emp_id;
    String designation;
    double salary;

    public Employee(){
        System.out.println("Object Created Successfully!");
    }

    public Employee(String name, int emp_id, String designation, double salary){
        this.name = name;
        this.emp_id = emp_id;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(Employee employee){
        this.name = employee.name;
        this.emp_id = employee.emp_id;
        this.designation = employee.designation;
        this.salary = employee.salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Emp_Id : "+this.emp_id);
        System.out.println("Designation : "+this.designation);
        System.out.println("Salary : "+this.salary);
    }
}

/*
 3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
 */