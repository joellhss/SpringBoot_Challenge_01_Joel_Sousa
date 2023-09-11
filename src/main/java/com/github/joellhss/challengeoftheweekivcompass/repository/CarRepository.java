package com.github.joellhss.challengeoftheweekivcompass.repository;

import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Long> {

}
