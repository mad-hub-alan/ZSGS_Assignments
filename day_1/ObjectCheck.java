public class ObjectCheck {
    public static void main(String[] args) {

        // creating instance for 'MobilePhone' class
        MobilePhone myphone = new MobilePhone(); 

        // creating instance for 'Computer' class
        Computer myComputer = new Computer();

        // creating instance for 'SmartPhone' class
        SmartPhone mySmartPhone = new SmartPhone();


        System.out.println(myphone instanceof MobilePhone); //true... because 'MobilePhone' is the class for 'myphone' instance.
        
        System.out.println(myComputer instanceof Computer); //true... because 'myComputer' is the instance of the 'Computer' class.
        
        System.out.println(mySmartPhone  instanceof MobilePhone); //'MobilePhone' is the ParentClass for the instance 'mySmartPhone';
        
    }
}

class MobilePhone{

}

class SmartPhone extends MobilePhone{

}

class Computer{

}