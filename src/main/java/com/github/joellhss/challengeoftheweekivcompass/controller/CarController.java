package com.github.joellhss.challengeoftheweekivcompass.controller;

import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import com.github.joellhss.challengeoftheweekivcompass.dto.CarDTO;
import com.github.joellhss.challengeoftheweekivcompass.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> createCar(@RequestBody CarDTO car) {
        return service.addCar(car);
    }
    @GetMapping("/{id}")
    public CarDTO getCarByIdChassi(@PathVariable Long id) {
        return service.getCarByIdChassi(id);
    }

    @GetMapping("/all")
    public List<CarDTO> getAllCars() {
        return service.getAllCars();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCarByChassiId(@PathVariable Long id, @RequestBody CarDTO carDTO) {
        return service.updateCarByChassiId(id, carDTO);
    }
}
