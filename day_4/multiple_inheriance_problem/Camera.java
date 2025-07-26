package multiple_inheriance_problem;

public class Camera {
    protected int resolution;
    protected double shutterWidth;
    protected String model;

    public Camera(int resolution, double shutterWidth, String model) {
        this.resolution = resolution;
        this.shutterWidth = shutterWidth;
        this.model = model;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public double getShutterWidth() {
        return shutterWidth;
    }

    public void setShutterWidth(double shutterWidth) {
        this.shutterWidth = shutterWidth;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

        
}
