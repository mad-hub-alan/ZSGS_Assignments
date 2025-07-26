package point_and_circle;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printPoint(){
        System.out.println("Point :  [x : "+ this.x +", y : "+ this.y+"]");
    }
}
