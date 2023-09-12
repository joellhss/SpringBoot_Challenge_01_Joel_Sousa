package com.github.joellhss.challengeoftheweekivcompass.service;

import com.github.joellhss.challengeoftheweekivcompass.config.customExceptions.BadRequestException;
import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import com.github.joellhss.challengeoftheweekivcompass.repository.CarRepository;
import com.github.joellhss.challengeoftheweekivcompass.utils.Brands;
import com.github.joellhss.challengeoftheweekivcompass.utils.StringFormatter;
import com.github.joellhss.challengeoftheweekivcompass.utils.ValidateCar;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CarService{

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public void addCar(CarEntity carEntity) {
        if (ValidateCar.validateAll(carEntity)){
            repository.save(StringFormatter.StringFormatterCarEntity(carEntity));
        } else {
            throw new BadRequestException("Error 400: Invalid Data.");
        };
    }

    public Optional<CarEntity> getCarByIdChassi(Long id) {
        return repository.findById(id);
    }

}
