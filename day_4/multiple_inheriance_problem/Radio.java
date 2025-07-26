package multiple_inheriance_problem;

public class Radio {
    protected double maximumFrequency;
    protected double bandWidth;
    protected int channels;

    public Radio(double maximumFrequency, double bandWidth, int channels) {
        this.maximumFrequency = maximumFrequency;
        this.bandWidth = bandWidth;
        this.channels = channels;
    }

    public double getMaximumFrequency() {
        return maximumFrequency;
    }

    public void setMaximumFrequency(double maximumFrequency) {
        this.maximumFrequency = maximumFrequency;
    }

    public double getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(double bandWidth) {
        this.bandWidth = bandWidth;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

}
