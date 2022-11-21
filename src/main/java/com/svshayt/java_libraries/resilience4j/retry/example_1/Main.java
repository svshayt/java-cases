package com.svshayt.java_libraries.resilience4j.retry.example_1;

import io.github.resilience4j.retry.MaxRetriesExceededException;
import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        /*
         * Retry configuration which will try service call 2 times in total. Retry will
         * be done if result is "FAILURE" or if BadProcessingException is thrown.
         */
        RetryConfig config = RetryConfig.custom().maxAttempts(2).waitDuration(Duration.ofMillis(1000))
                .retryOnResult(response -> response.equals("FAILURE"))
                .retryOnException(BadProcessingException.class::isInstance)
                .failAfterMaxAttempts(true)
                .build();

        // Create a RetryRegistry with a custom global configuration
        RetryRegistry registry = RetryRegistry.of(config);

        // Get or create a Retry from the registry -
        Retry retry = registry.retry("externalIntermittentFailingService");

        ExternalIntermittentFailingService service = new ExternalIntermittentFailingService();

        // Make 20 calls
        for (int i = 0; i < 20; i++) {
            System.out.println(">> Call count = " + (i + 1));
            try {
                String finalResult = retry.executeSupplier(() -> service.callService());
                System.out.println("\tFinal Result = " + finalResult);
            } catch (MaxRetriesExceededException e) {
                throw new BadRetryProcessingException(
                        "Превышено максимально число попыток ретраев. "
                );
            }
        }
    }
}
