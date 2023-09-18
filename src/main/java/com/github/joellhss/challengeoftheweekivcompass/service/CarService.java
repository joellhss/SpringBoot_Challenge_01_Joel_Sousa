package com.github.joellhss.challengeoftheweekivcompass.service;

import com.github.joellhss.challengeoftheweekivcompass.config.customExceptions.BadRequestException;
import com.github.joellhss.challengeoftheweekivcompass.config.customExceptions.ResourceNotFoundException;
import com.github.joellhss.challengeoftheweekivcompass.entity.CarEntity;
import com.github.joellhss.challengeoftheweekivcompass.dto.CarDTO;
import com.github.joellhss.challengeoftheweekivcompass.repository.CarRepository;
import com.github.joellhss.challengeoftheweekivcompass.utils.StringFormatter;
import com.github.joellhss.challengeoftheweekivcompass.utils.ValidateCar;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService{

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<String> addCar(CarDTO car) {
        if (!ValidateCar.validateBrand(car.getBrand())){
            throw new ResourceNotFoundException("Error 404: Not Found.\nOnly BMW, Chevrolet, Ford and Volvo brands are permitted.");
        }
        if (!ValidateCar.validateFabricationYear(car.getFabricationYear())) {
            throw new BadRequestException("Error 400: Invalid Data.\nPlease check that the 'fabricationYear' field property is in the format 'year/year'.");
        }

        StringFormatter.StringFormatterCarEntity(car);

        CarEntity save = repository.save(CarDTO.DTOToEntity(car));

        return ResponseEntity.status(HttpStatus.CREATED).body("Successful operation!\nNote the generated Chassis Id: " + save.getChassiId());
    }

    public CarDTO getCarByIdChassi(Long id) {
        var response = repository.findById(id);
        if(response.isEmpty()) {
            throw new ResourceNotFoundException("Error 404: Not Found.\nOops! It appears that this chassiId has not yet been registered.");
        }

        return CarDTO.EntityToDTO(response.get());
    }

    public List<CarDTO> getAllCars() {
        List<CarEntity> allCarsEntity = repository.findAll();
        if(allCarsEntity.isEmpty()) {
            throw new ResourceNotFoundException("Error 404: Not Found.\nOops! It appears that no cars have been registered yet.");
        };

        List<CarDTO> allCarsDTO = new ArrayList<>();
        allCarsEntity.forEach(entity -> {
            allCarsDTO.add(CarDTO.EntityToDTO(entity));
        });

        return allCarsDTO;
    }

    public ResponseEntity<String> updateCarByChassiId(Long id, CarDTO carDTO) {
        if (carDTO.getChassiId() != null && id != carDTO.getChassiId()) {
            throw new BadRequestException("Error 400: Invalid Data.\nThe 'chassiId' field is not necessary in the request body, but if you choose to add it, it must be the same as the URI.");
        }

        carDTO.setChassiId(id);

        addCar(carDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body("Successful operation!");
    }
}
