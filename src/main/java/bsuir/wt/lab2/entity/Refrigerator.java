package bsuir.wt.lab2.entity;

import java.util.Objects;
import java.util.UUID;

public class Refrigerator extends Product {
    private String powerConsumption;
    private int weight;
    private int freezerCapacity;
    private  int overallCapacity;
    private int height;
    private int width;

    public Refrigerator(UUID id, String name, String category, int price, String powerConsumption,
                        int weight, int freezerCapacity, int overallCapacity, int height, int width) {
        super(id, name, category, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator() {}

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator that)) return false;
        if (!super.equals(o)) return false;
        return weight == that.weight && freezerCapacity == that.freezerCapacity &&
                overallCapacity == that.overallCapacity && height == that.height && width == that.width &&
                powerConsumption.equals(that.powerConsumption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                "} " + super.toString();
    }
}
