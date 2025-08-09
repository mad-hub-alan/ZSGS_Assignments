package point_and_circle;

public class Circle extends Point{
    private int radius;

    public Circle(int x, int y, int radius){
        setPoint(x, y);
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius > 0 ? radius : 1;
    }
    
    public double area(){
        return (3.14)*(this.radius*this.radius);
    }
}
