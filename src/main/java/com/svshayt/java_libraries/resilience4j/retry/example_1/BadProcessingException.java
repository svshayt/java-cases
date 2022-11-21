package com.svshayt.java_libraries.resilience4j.retry.example_1;

public class BadProcessingException extends RuntimeException {
    public BadProcessingException(String message) {
        super(message);
    }
}
