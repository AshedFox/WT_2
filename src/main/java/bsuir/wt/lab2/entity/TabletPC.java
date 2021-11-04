package bsuir.wt.lab2.entity;

import java.util.Objects;
import java.util.UUID;

public class TabletPC extends Product {
    private int batteryCapacity;
    private int displayInches;
    private String memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC(UUID id, String name, String category, int price, int batteryCapacity, int displayInches,
                    String memoryROM, int flashMemoryCapacity, String color) {
        super(id, name, category, price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC() {}

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public String getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(String memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC tabletPC)) return false;
        if (!super.equals(o)) return false;
        return batteryCapacity == tabletPC.batteryCapacity && displayInches == tabletPC.displayInches &&
                flashMemoryCapacity == tabletPC.flashMemoryCapacity && memoryROM.equals(tabletPC.memoryROM) &&
                color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM='" + memoryROM + '\'' +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
