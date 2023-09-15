package com.github.joellhss.challengeoftheweekivcompass.dto;


import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Valid
public class CarDTO {
    private Long chassiId;
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

        if(carDTO.getChassiId() != null) {
            carEntity.setChassiId(carDTO.getChassiId());
        }

        carEntity.setModel(carDTO.getModel());
        carEntity.setBrand(carDTO.getBrand());
        carEntity.setColor(carDTO.getColor());
        carEntity.setFabricationYear(carDTO.getFabricationYear());

        return carEntity;
    }
    public static CarDTO EntityToDTO(CarEntity carEntity) {
        CarDTO carDTO = new CarDTO();
        carDTO.setChassiId(carEntity.getChassiId());
        carDTO.setModel(carEntity.getModel());
        carDTO.setBrand(carEntity.getBrand());
        carDTO.setColor(carEntity.getColor());
        carDTO.setFabricationYear(carEntity.getFabricationYear());

        return carDTO;
    }

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
}
