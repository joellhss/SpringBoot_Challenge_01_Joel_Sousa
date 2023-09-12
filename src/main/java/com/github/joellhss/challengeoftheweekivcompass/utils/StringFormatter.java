package com.github.joellhss.challengeoftheweekivcompass.utils;

import com.github.joellhss.challengeoftheweekivcompass.model.CarEntity;

public class StringFormatter {
    public static String formatter(String text) {
        String[] arrayText = text.toLowerCase().split(" ");
        StringBuffer newText = new StringBuffer();
        for(String word:arrayText) {
            newText.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        return newText.toString().trim();
    }

    public static CarEntity StringFormatterCarEntity(CarEntity car) {
        car.setBrand(formatter(car.getBrand()));
        car.setColor(formatter(car.getColor()));
        car.setModel(formatter(car.getModel()));

        return car;
    }
}
