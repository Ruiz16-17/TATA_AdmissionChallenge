package models;

import java.util.UUID;

public class Drink {
    private String id;
    private int liters;
    private float price;
    private String mark;

    public Drink() {
    }

    public Drink(int liters, float price, String mark) {
        this.id = UUID.randomUUID().toString();
        this.liters = liters;
        this.price = price;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id='" + id + '\'' +
                ", liters=" + liters +
                ", price=" + price +
                ", mark='" + mark + '\'' +
                '}';
    }
}
