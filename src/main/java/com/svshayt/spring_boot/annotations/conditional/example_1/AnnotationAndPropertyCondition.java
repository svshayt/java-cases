package com.svshayt.spring_boot.annotations.conditional.example_1;

import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

public class AnnotationAndPropertyCondition extends AnyNestedCondition {

    public AnnotationAndPropertyCondition(ConfigurationPhase configurationPhase) {
        super(configurationPhase);
    }

    @ConditionalOnProperty(value = "db.superLogger")
    static class Condition1 {}

    @ConditionalOnLoggableAnnotation
    static class Condition2 {}
}
