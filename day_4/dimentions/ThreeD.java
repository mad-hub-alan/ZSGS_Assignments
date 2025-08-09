public class ThreeD extends TwoD{
    protected int z;

    public ThreeD() {
        // super();
    }

    public ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // method to find distance
    public double findDistance(ThreeD obj){
        return Math.sqrt((obj.x - this.x)*(obj.x - this.x) + (obj.y - this.y)*(obj.y - this.y) + (obj.z - this.z)*(obj.z - this.z));
    }

    @Override
    public String toString() {
        return "ThreeD : [x = " + x + ", y = " + y + ", z = " + z +"]";
    }
}
