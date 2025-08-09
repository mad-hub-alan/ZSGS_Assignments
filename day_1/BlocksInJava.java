public class BlocksInJava {
    // Instance Block
    {
        System.out.println("This is Instance Initialization Block !");
    }

    // Static Block
    static{
        System.out.println("This is Static Block !");
    }

    // Constructor
    BlocksInJava(){
        System.out.println("This is From Constructor !");
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println("This is From Main Method !");

        BlocksInJava obj = new BlocksInJava(); // Object creation

        System.out.println("Object created Successfully !");

        /*
            StaticBlock -> Main Method -> InstanceBlock -> Constructor 
         */
    }
}
