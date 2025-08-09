package override_private_resources;

public class SmartWatch extends WristWatch{
    protected double scrrenSize;
    protected boolean isWifiEnabled;

    public SmartWatch(String strapType, String materialType, double price, int warranty, double scrrenSize,
            boolean isWifiEnabled) {
        super(strapType, materialType, price, warranty);
        this.scrrenSize = scrrenSize;
        this.isWifiEnabled = isWifiEnabled;
    }

    
    // Overriding a Super class constructor is restricted
    public WristWatch(){
        System.out.println("Overriding WristWatch Constructor!");
    }

    //getters and setters
    
    public double getScrrenSize() {
        return scrrenSize;
    }


    public void setScrrenSize(double scrrenSize) {
        this.scrrenSize = scrrenSize;
    }


    public boolean isWifiEnabled() {
        return isWifiEnabled;
    }


    public void setWifiEnabled(boolean isWifiEnabled) {
        this.isWifiEnabled = isWifiEnabled;
    }



    // Super class' private method is not visible (Can't inherit)
    @Override
    public void setTime(){
        System.out.println("Overriding setTime() in Smartwatch!");
    }

    // Can't Override Super class' static method (hidden)
    public void showTime(){
        System.out.println("Wrist watch Showing Time!");
    }

    // Can't override final method of Super class
    public void sellWatch(){
        System.out.println("Wristwatch sold!");
    }
}
