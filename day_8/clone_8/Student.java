package day_8.clone_8;

public class Student implements Cloneable{
    private String name;
    private int rollNo; 
    private String department;
    
    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    // overriding Object class' clone() method!
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //overriding Object class' toString() method
    @Override
    public String toString() {
        return String.format(" Name       : %s \n RollNo     : %s \n Department : %s \n",this.name,this.rollNo,this.department);
    } 
    
}
