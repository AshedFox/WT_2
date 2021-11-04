package bsuir.wt.lab2.entity;

import java.util.Objects;
import java.util.UUID;

public class Laptop extends Product {
    private int batteryCapacity;
    private String os;
    private String memoryROM;
    private String systemMemory;
    private String cpu;
    private int displayInches;

    public Laptop() {}

    public Laptop(UUID id, String name, String category, int price, int batteryCapacity, String os,
                  String memoryROM, String systemMemory, String cpu, int displayInches) {
        super(id, name, category, price);
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(String memoryROM) {
        this.memoryROM = memoryROM;
    }

    public String getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return batteryCapacity == laptop.batteryCapacity && displayInches == laptop.displayInches &&
                os.equals(laptop.os) && memoryROM.equals(laptop.memoryROM) &&
                systemMemory.equals(laptop.systemMemory) && cpu.equals(laptop.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, os, memoryROM, systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryROM='" + memoryROM + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInches=" + displayInches +
                "} " + super.toString();
    }
}
