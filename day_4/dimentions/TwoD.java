public class TwoD {
    protected int x;
    protected int y;
    

    public TwoD(){
        System.out.println("TwoD default constructor!");
    }

    public TwoD(int x, int y) {
        System.out.println("TwoD constructor with two arguments!");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}