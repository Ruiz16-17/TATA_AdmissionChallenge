package models;

public class MineralWater extends Drink{

    private String origin;

    public MineralWater() {

    }

    public MineralWater(int liters, float price, String mark, String origin) {
        super(liters, price, mark);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "MineralWater{" +
                "origin='" + origin + '\'' +
                '}';
    }
}
