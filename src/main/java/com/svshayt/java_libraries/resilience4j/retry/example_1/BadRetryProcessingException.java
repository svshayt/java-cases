package com.svshayt.java_libraries.resilience4j.retry.example_1;

public class BadRetryProcessingException extends RuntimeException {
    public BadRetryProcessingException(String message) {
        super(message);
    }
}