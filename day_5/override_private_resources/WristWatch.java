package override_private_resources;

public class WristWatch {
    protected String strapType;
    protected String materialType;
    protected double price;
    protected int warranty;

    //private constructor
    public WristWatch(String strapType, String materialType, double price, int warranty) {
        this.strapType = strapType;
        this.materialType = materialType;
        this.price = price;
        this.warranty = warranty;
    }

    public String getStrapType() {
        return strapType;
    }

    public void setStrapType(String strapType) {
        this.strapType = strapType;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    //methods

    //private static method
    private void setTime(){
        System.out.println("Setting Time in WristWatch!");
    } 

    //static method
    public static void showTime(){
        System.out.println("Wrist watch Showing Time!");
    }

    //final method
    public final void sellWatch(){
        System.out.println("Wristwatch sold!");
    }
}
