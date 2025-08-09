package employees_salary;

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

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public int getWorkHourPerDay() {
        return workHourPerDay;
    }

    public void setWorkHourPerDay(int workHourPerDay) {
        this.workHourPerDay = workHourPerDay;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
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
