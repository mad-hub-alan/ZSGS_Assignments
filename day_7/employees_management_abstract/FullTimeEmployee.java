package employees_management_abstract;

public class FullTimeEmployee extends Employee{
    protected int weekEnds;
    protected int leavesTaken;
    protected int workedDays;
    protected double payPerDay;

    
    public FullTimeEmployee(int employeeId, String employeeName, int weekEnds, int leavesTaken, int workedDays, double payPerDay) {
        super(employeeId,employeeName);
        this.weekEnds = weekEnds;
        this.leavesTaken = leavesTaken;
        this.workedDays = workedDays;
        this.payPerDay = payPerDay;
    }

    public FullTimeEmployee(){
        super();
        this.setEmployeeId();
        this.setLeavesTaken();
        this.setPayPerDay();
        this.setWeekEnds();
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

    public int getWeekEnds() {
        return weekEnds;
    }
    public void setWeekEnds() {
        this.weekEnds = (int)(8+Math.floor(Math.random()*2));
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }
    public void setLeavesTaken() {
        this.leavesTaken = (int)(Math.floor(Math.random()*3));
    }

    public int getWorkedDays() {
        return workedDays;
    }
    public void setWorkedDays() {
        this.workedDays = (30 - this.weekEnds - this.leavesTaken);
    }

    public double getPayPerDay() {
        return payPerDay;
    }
    public void setPayPerDay() {
        this.payPerDay = 1800;
    }

    @Override
    public double calculateSalary(){
        return this.payPerDay * this.workedDays+this.weekEnds;
    }

    @Override
    public void printEmployeeDetails() {
        System.out.println("----------------------Full-Time Employee Details--------------------------");
        System.out.println("Emp Id : "+this.employeeId);
        System.out.println("Name : "+this.employeeName);
        System.out.println("Weekends : "+this.weekEnds);
        System.out.println("Leaves Taken : "+this.leavesTaken);
        System.out.println("Worked Days : "+this.workedDays);
        System.out.println("This Month's Salary : "+this.calculateSalary());
    }   
}
