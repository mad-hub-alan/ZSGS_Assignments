public class DataTypes {
    public static void main(String[] args) {
        String name = "Madhubalan";
        char initial = 'M';
        byte age = 25;
        short totalMarks = 466;
        int regNo = 100421;
        long mobileNo = 9876543210L;
        float height = 1.82F;
        double weight = 65.40;
        boolean isPass = true;

        System.out.println("Student Name : "+name+" "+initial);
        System.out.println("Student Reg.No : "+regNo);
        System.out.println("Student Age : "+age);
        System.out.println("Student Height : "+height);
        System.out.println("Student Weight : "+weight);
        System.out.println("Student Mobile No : "+mobileNo);
        System.out.println("Student Total Marks : "+totalMarks);
        System.out.print("Student Result : ");
        if(isPass) System.out.print("Pass");
        else System.out.print("Fail");

    }
}
