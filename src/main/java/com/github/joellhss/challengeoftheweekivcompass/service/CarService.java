package com.github.joellhss.challengeoftheweekivcompass.service;

import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import com.github.joellhss.challengeoftheweekivcompass.repository.CarRepository;

import java.util.Optional;

public class CarService{

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public void addCar(CarEntity carEntity) { //Adicionar validador!!
        repository.save(carEntity);
    }

    public Optional<CarEntity> getCarByIdChassi(Long id) {
        return repository.findById(id);
    }
}
