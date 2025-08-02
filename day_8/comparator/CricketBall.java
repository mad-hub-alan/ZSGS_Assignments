package day_8.comparator;

public class CricketBall {
    private String brand;
    private BallType type;
    private double weight;
    private double price;

    public CricketBall(String brand, int type, double weight, double price) {
        this.brand = brand;
        this.weight = weight;
        this.price = price;

        switch (type) {
            case 1:
                this.type = BallType.RED_BALL;
                break;
            case 2:
                this.type = BallType.WHITE_BALL;
                break;
            case 3:
                this.type = BallType.PINK_BALL;
                break;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BallType getType() {
        return type;
    }

    public void setType(BallType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Brand : %-10s | Type : %-10s | Weight : %-10.2f | Price : %-10.2f",this.brand,this.type,this.weight,this.price);
    }
}
