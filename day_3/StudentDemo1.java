public class StudentDemo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "John";
        student1.roll_no = 2;

        student2.name = "Madhubalan M";
        student2.roll_no = 4;

        System.out.println(student1.name);
        System.out.println(student1.roll_no);
    }
}

class Student{
    String name;
    int roll_no;
}

/*
 1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
 */
