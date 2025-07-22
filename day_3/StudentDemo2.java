public class StudentDemo2 {
    public static void main(String[] args) {
        SchoolStudent student1 = new SchoolStudent("Sam", 1, 9876543210L, "No.18, 4th Cross Street, Tenkasi");
        SchoolStudent student2 = new SchoolStudent("John", 1, 8769545210L, "No.4, 2nd Link Street, Madurai");

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();
    }
}

class SchoolStudent{
    String name;
    int roll_no;
    long phone_no;
    String address;

    public SchoolStudent(String name, int roll_no, long phone_no, String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    public void displayStudentDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Roll No : "+this.roll_no);
        System.out.println("Phone No : "+this.phone_no);
        System.out.println("Address : "+this.address);
    }
}

/*
 2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
 */