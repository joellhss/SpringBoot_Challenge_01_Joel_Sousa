package com.github.joellhss.challengeoftheweekivcompass.model.dto;


import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Valid
public class CarDTO {
    @NotBlank
    @NotNull
    private String model;
    @NotBlank
    @NotNull
    private String brand;
    @NotBlank
    @NotNull
    private String color;
    @NotBlank
    @NotNull
    private String fabricationYear;

    public static CarEntity DTOToEntity(CarDTO carDTO) {
        CarEntity carEntity = new CarEntity();

        carEntity.setModel(carDTO.getModel());
        carEntity.setBrand(carDTO.getBrand());
        carEntity.setColor(carDTO.getColor());
        carEntity.setFabricationYear(carDTO.getFabricationYear());

        return carEntity;
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
}
