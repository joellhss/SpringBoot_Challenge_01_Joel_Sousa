package com.github.joellhss.challengeoftheweekivcompass.utils;

import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;
import org.springframework.stereotype.Component;

@Component
public class ValidateCar {

    public static boolean validateAll(CarEntity car) {
       return validateCarEmptyOrNull(car)
               && validateBrand(car.getBrand())
               && validateFabricationYear(car.getFabricationYear());
    }
    public static boolean validateCarEmptyOrNull(CarEntity car) {
        return car != null
                && !car.getBrand().isEmpty()
                && !car.getColor().isEmpty()
                && !car.getModel().isEmpty()
                && !car.getFabricationYear().isEmpty();
    }

    public static boolean validateBrand(String valor) {
        try {
            Brands.valueOf(valor.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static boolean validateFabricationYear(String valor) {
        if (valor.contains("/") && valor.length() == 9) {
            try {
                int anoInício = Integer.parseInt(valor.substring(0,4));
            } catch (NumberFormatException ex) {
                return false;
            }

            try {
                int anoInício = Integer.parseInt(valor.substring(5,9));
            } catch (NumberFormatException ex) {
                return false;
            }

            return true;
        }

        return false;
    }
}
