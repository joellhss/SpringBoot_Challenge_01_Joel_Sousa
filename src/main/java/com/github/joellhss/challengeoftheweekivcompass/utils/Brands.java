package com.github.joellhss.challengeoftheweekivcompass.utils;
public enum Brands {
    FORD("Ford"),
    CHEVROLET("Chevrolet"),
    BMW("BMW"),
    VOLVO("Volvo");

    private final String defaultBrand;

    Brands(String defaultBrand) {
        this.defaultBrand = defaultBrand;
    }

    public String getDefaultBrand() {
        return defaultBrand;
    }
}
