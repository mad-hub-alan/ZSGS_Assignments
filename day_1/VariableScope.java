public class VariableScope {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Madhubalan M", 12300004L, 2023);

        emp1.showEmployeeDetails("Welcome!");
    }
}

class Employee{
    static String companyName = "Zoho"; // static variable

    String name; // instance variable
    long empId; // instance variable
    final int joinedYear ; // final variable

    public Employee(String name, long empId, int joinedYear){
        this.name = name;
        this.empId = empId;
        this.joinedYear = joinedYear;
    }

    public void showEmployeeDetails(String greetings){  // greetings - local variable
        int currentYear = 2025;  // block variable

        System.out.println(greetings);
        System.out.println("Emp.Name : "+this.name);
        System.out.println("Company Name : "+companyName);
        System.out.println("Emp.Id : "+this.empId);
        System.out.println("Employee has "+(currentYear-joinedYear)+" Years of Experience.");
    }
}
