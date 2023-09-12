package com.github.joellhss.challengeoftheweekivcompass.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity(name = "db_car")
public class CarEntity {
    @Id
    private Long idChassi;
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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

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
