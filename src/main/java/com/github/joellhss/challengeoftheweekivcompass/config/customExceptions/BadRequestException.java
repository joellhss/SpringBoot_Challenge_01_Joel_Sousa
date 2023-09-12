package com.github.joellhss.challengeoftheweekivcompass.config.customExceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String message) {
        super(message);
    }
}
