package com.github.joellhss.challengeoftheweekivcompass.service;

import com.github.joellhss.challengeoftheweekivcompass.config.customExceptions.BadRequestException;
import com.github.joellhss.challengeoftheweekivcompass.config.customExceptions.ResourceNotFoundException;
import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import com.github.joellhss.challengeoftheweekivcompass.model.dto.CarDTO;
import com.github.joellhss.challengeoftheweekivcompass.repository.CarRepository;
import com.github.joellhss.challengeoftheweekivcompass.utils.StringFormatter;
import com.github.joellhss.challengeoftheweekivcompass.utils.ValidateCar;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CarService{

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<String> addCar(CarDTO car) {
        if (!ValidateCar.validateBrand(car.getBrand())){
            throw new ResourceNotFoundException("Error 404: Not Found.");
        }
        if (!ValidateCar.validateAll(car)) {
            throw new BadRequestException("Error 400: Invalid Data.");
        }

        StringFormatter.StringFormatterCarEntity(car);

        repository.save(CarDTO.DTOToEntity(car));

        return ResponseEntity.status(HttpStatus.CREATED).body("Successful operation!");
    }

    public Optional<CarEntity> getCarByIdChassi(Long id) {
        return repository.findById(id);
    }

}
