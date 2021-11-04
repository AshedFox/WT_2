package bsuir.wt.lab2.entity;

import java.util.Objects;
import java.util.UUID;

public class VacuumCleaner extends Product {
    private String powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private boolean motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(UUID id, String name, String category, int price, String powerConsumption, String filterType,
                         String bagType, String wandType, boolean motorSpeedRegulation, int cleaningWidth) {
        super(id, name, category, price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner() {}

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public boolean isMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(boolean motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner that)) return false;
        if (!super.equals(o)) return false;
        return motorSpeedRegulation == that.motorSpeedRegulation && cleaningWidth == that.cleaningWidth &&
                powerConsumption.equals(that.powerConsumption) && filterType.equals(that.filterType) &&
                bagType.equals(that.bagType) && wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                "} " + super.toString();
    }
}
