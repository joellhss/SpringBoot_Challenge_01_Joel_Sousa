package com.github.joellhss.challengeoftheweekivcompass.utils;

import com.github.joellhss.challengeoftheweekivcompass.dto.CarDTO;

public class StringFormatter {
    public static String formatter(String text) {
        String[] arrayText = text.toLowerCase().split(" ");
        StringBuffer newText = new StringBuffer();
        for(String word:arrayText) {
            newText.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        return newText.toString().trim();
    }

    public static CarDTO StringFormatterCarEntity(CarDTO car) {
        car.setBrand(Brands.valueOf(car.getBrand().toUpperCase()).getDefaultBrand());
        car.setColor(formatter(car.getColor()));
        car.setModel(formatter(car.getModel()));

        return car;
    }
}
