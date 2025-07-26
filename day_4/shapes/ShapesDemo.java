package shapes;

public class ShapesDemo {
    public static void main(String[] args) {

        // Creating Shape instance
        Shape shape = new Shape();

        // Creating child class instances of Shape and store in Shape class reference
        Shape polygon = new Polygon();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        

        // invoking the printMessage() method

        shape.printMessage();
        polygon.printMessage();
        triangle.printMessage();
        rectangle.printMessage();
        square.printMessage();
    }
}
