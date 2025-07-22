import java.util.ArrayList;

public class CorporateEmployeeDemo {
    public static void main(String[] args) {
        ArrayList<CorporateEmployee> employees = new ArrayList<>();

        CorporateEmployee emp1 = new CorporateEmployee("Robert", 1994, 1_80_000, "64C- Walls Street");
        CorporateEmployee emp2 = new CorporateEmployee("John", 1996, 1_10_000, "56G- Della Street");
        CorporateEmployee emp3 = new CorporateEmployee("Sam", 1998, 1_20_000, "92T- Gerson Street");
        CorporateEmployee emp4 = new CorporateEmployee("Maddy", 1999, 1_40_000, "80P- Jasper Street");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("%-15s %-22s %-15s %-5s","Name","YearOfJoining","Salary","Address");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------");
            for(int i=0; i<employees.size(); i++){
                System.out.printf("%-20s %-15d %-8.2f    %-15s",employees.get(i).name,employees.get(i).yearOfJoining,employees.get(i).salary,employees.get(i).address);
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------");
    }
}

class CorporateEmployee{
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public CorporateEmployee(String name,int yearOfJoining,double salary,String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

}
