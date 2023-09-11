package com.github.joellhss.challengeoftheweekivcompass.controller;

import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import com.github.joellhss.challengeoftheweekivcompass.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @PostMapping
    public void createCar(@RequestBody CarEntity car) {
        service.addCar(car);
    }
    @GetMapping("/{id}")
    public Optional<CarEntity> getCarByIdChassi(@PathVariable Long id) {

        return service.getCarByIdChassi(id);
    }
}
