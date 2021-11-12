package models;

public class SugaryDrink extends Drink {

    private float suggarPercentage;
    private boolean isPromoted;

    public SugaryDrink() {
    }

    public SugaryDrink(int liters, float price, String mark, float suggarPercentage, boolean isPromoted) {
        super(liters, price, mark);
        this.suggarPercentage = suggarPercentage;
        this.isPromoted = isPromoted;
    }

    public float getSuggarPercentage() {
        return suggarPercentage;
    }

    public void setSuggarPercentage(float suggarPercentage) {
        this.suggarPercentage = suggarPercentage;
    }

    public boolean isPromoted() {
        return isPromoted;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "SugaryDrink{" +
                "suggarPercentage=" + suggarPercentage +
                ", isPromoted=" + isPromoted +
                '}';
    }
}

