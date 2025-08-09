package multiple_inheriance_problem;

//Compiler throws Error, Because Java does't allows multiple classes directly extended by a single class
public class MobilePhone extends Camera,Radio{  
    protected int bateryBackUp;
    protected double displaySize;
    
    public MobilePhone(int resolution, double shutterWidth, String model, int bateryBackUp, double displaySize) {
        super(resolution, shutterWidth, model);
        this.bateryBackUp = bateryBackUp;
        this.displaySize = displaySize;
    }

    public int getBateryBackUp() {
        return bateryBackUp;
    }

    public void setBateryBackUp(int bateryBackUp) {
        this.bateryBackUp = bateryBackUp;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

}
