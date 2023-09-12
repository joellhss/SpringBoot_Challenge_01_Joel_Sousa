package com.github.joellhss.challengeoftheweekivcompass.config.customExceptions;

public class InternalServerErrorException extends RuntimeException{
    public InternalServerErrorException(String message) {
        super(message);
    }
}
