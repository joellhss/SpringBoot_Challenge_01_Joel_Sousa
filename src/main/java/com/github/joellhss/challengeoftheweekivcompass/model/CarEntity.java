package com.github.joellhss.challengeoftheweekivcompass.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity(name = "table_car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassiId;
    @NotBlank
    @Column(nullable = false)
    private String model;
    @NotBlank
    @Column(nullable = false)
    private String brand;
    @NotBlank
    @Column(nullable = false)
    private String color;
    @NotBlank
    @Column(nullable = false)
    private String fabricationYear;

    public Long getChassiId() {
        return chassiId;
    }

    public void setChassiId(Long chassiId) {
        this.chassiId = chassiId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(String fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "idChassi=" + chassiId +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", fabricationYear='" + fabricationYear + '\'' +
                '}';
    }
}
