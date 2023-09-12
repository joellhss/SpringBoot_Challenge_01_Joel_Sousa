package com.github.joellhss.challengeoftheweekivcompass.config.customExceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
