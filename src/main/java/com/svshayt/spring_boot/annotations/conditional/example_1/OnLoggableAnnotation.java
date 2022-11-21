package com.svshayt.spring_boot.annotations.conditional.example_1;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;

public class OnLoggableAnnotation extends SpringBootCondition {

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        #Example
//
//        ClassPathScanner scanner = new ClassPathScanner();
//        scanner.addIncludeFilter(new AnnotationTypeFilter(Loggable.class));
//        Set<BeanDefinition> bd = scanner.findInPackage("ru.mybeans");
//        if (!bd.isEmpty())
//            return true;
//        return false;
        return new ConditionOutcome(false, "");
    }
}
