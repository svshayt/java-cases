package com.svshayt.java_libraries.resilience4j.retry.example_1;

public class ExternalIntermittentFailingService {

    public String callService() {
        double random = Math.random();
        if (random < 0.6) {
            System.out.println("\tProcessing finished. Status = SUCCESS");
            return "SUCCESS";
        } else if (random < 0.8) {
            System.out.println("\tProcessing finished. Status = FAILURE");
            return "FAILURE";
        } else {
            System.out.println("\tProcessing finished. Status = BadProcessingException");
            throw new BadProcessingException("Bad processing");
        }
    }
}
