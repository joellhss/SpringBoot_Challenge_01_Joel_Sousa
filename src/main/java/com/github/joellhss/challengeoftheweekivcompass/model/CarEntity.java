package com.github.joellhss.challengeoftheweekivcompass.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "db_car")
public class CarEntity {
    @Id
    private Long idChassi;
    private String model;
    private String brand;
    private String color;
    private String fabricationYear;

    public Long getIdChassi() {
        return idChassi;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "idChassi=" + idChassi +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear='" + fabricationYear + '\'' +
                '}';
    }
}
