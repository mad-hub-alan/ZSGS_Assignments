package day_8.clone_8;

public class CloneDemo {
    public static void main(String[] args) {
        
        //creating Student instance
        Student student1 = new Student("Madhu", 4, "CyberSecurity");
        
        System.out.println("student1 instance : "+student1.hashCode());
        System.out.println(student1);

        Student newStudent = null; // creating initializing newStudent instance 

        //newStudent = (Student)student1.clone();


        /*  Trying to clone student1 instance using clone() method directly and an Exception is thrown
            like ' The method clone() from the type Object is not visible'.  
            
            * So I need to override the Object Class' clone() method in my Student Class!

            * If I run After override the clone() method, 'CloneNotSupportedException' is thrown and 
            I handle the exception in my main method. 
             
            * Still 'CloneNotSupportedException' is thrown. Because Student class didn't implement 'Cloneable'
                Interface and JVM didn't allow to clone Student instance. 
                So, I need to implement Cloneable interface
        */

        try{
            newStudent = (Student)student1.clone();
        }catch(CloneNotSupportedException ex){
            ex.printStackTrace();
        }


        System.out.println("Cloned newStudent instance : "+newStudent.hashCode());
        System.out.println(newStudent); // printing cloned instance

    }
}
