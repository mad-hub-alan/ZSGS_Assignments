package employees_management_abstract;

public class PartTimeEmployee extends Employee{
    protected int workedDays;
    protected int workHourPerDay;
    protected double payPerHour;
    
    public PartTimeEmployee(int employeeId, String employeeName, int workedDays, int workHourPerDay,
            double payPerHour) {
        super(employeeId, employeeName);
        this.workedDays = workedDays;
        this.workHourPerDay = workHourPerDay;
        this.payPerHour = payPerHour;
    }
    public PartTimeEmployee(){
        super();
        this.setEmployeeId();
        this.setPayPerHour();
        this.setWorkHourPerDay();
        this.setWorkedDays();
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

    public int getWorkedDays() {
        return workedDays;
    }
    public void setWorkedDays() {
        this.workedDays = (int)(22+Math.ceil(Math.random()*4));
    }

    public int getWorkHourPerDay() {
        return workHourPerDay;
    }
    public void setWorkHourPerDay() {
        this.workHourPerDay = 4;
    }

    public double getPayPerHour() {
        return payPerHour;
    }
    public void setPayPerHour() {
        this.payPerHour = 250;
    }

    @Override
    public double calculateSalary(){
        return (this.workHourPerDay * this.payPerHour)*this.workedDays;
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println("----------------------Part-Time Employee Details--------------------------");
        System.out.println("Emp Id : "+this.employeeId);
        System.out.println("Name : "+this.employeeName);
        System.out.println("Worked Days : "+this.workedDays);
        System.out.println("This Month's Salary : "+this.calculateSalary());
    } 
}
