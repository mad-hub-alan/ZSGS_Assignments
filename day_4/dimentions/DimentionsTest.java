public class DimentionsTest {
    public static void main(String[] args) {

        // creating ThreeD instance
        ThreeD obj1_3D = new ThreeD();

        // setting values
        obj1_3D.setX(100);
        obj1_3D.setY(50);
        obj1_3D.setZ(200);

        // creating another ThreeD instance
        ThreeD obj2_3D = new ThreeD(200,100,150);

        // printing values of instances
        System.out.println(obj1_3D);
        System.out.println(obj2_3D);

        // checking distance 
        System.out.println("Distance between two co-ordinates : "+obj1_3D.findDistance(obj2_3D));

    }
}
