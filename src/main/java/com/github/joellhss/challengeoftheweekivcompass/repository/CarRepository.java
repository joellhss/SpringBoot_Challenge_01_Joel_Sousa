package com.github.joellhss.challengeoftheweekivcompass.repository;

import com.github.joellhss.challengeoftheweekivcompass.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long> {

}
