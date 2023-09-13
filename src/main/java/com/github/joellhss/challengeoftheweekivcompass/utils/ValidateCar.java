package com.github.joellhss.challengeoftheweekivcompass.utils;

import com.github.joellhss.challengeoftheweekivcompass.model.dto.CarDTO;
import org.springframework.stereotype.Component;

@Component
public class ValidateCar {

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
