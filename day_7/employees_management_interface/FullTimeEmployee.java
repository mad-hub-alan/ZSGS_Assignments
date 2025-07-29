package employees_management_interface;

public class FullTimeEmployee implements Employee{

    protected int employeeId;
    protected String employeeName;
    protected int weekEnds;
    protected int leavesTaken;
    protected int workedDays;
    protected double payPerDay;

    
    public FullTimeEmployee(int employeeId, String employeeName, int weekEnds, int leavesTaken, int workedDays, double payPerDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.weekEnds = weekEnds;
        this.leavesTaken = leavesTaken;
        this.workedDays = workedDays;
        this.payPerDay = payPerDay;
    }
    

    public int getEmployeeId() {
        return employeeId;
    }


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public void setWeekEnds(int weekEnds) {
        this.weekEnds = weekEnds;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public double getPayPerDay() {
        return payPerDay;
    }

    public void setPayPerDay(double payPerDay) {
        this.payPerDay = payPerDay;
    }

    @Override
    public double calculateSalary(){
        return this.payPerDay * this.workedDays;
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
