package com.svshayt.spring_boot.annotations.conditional.example_1;

import org.springframework.stereotype.Component;

@Component
@ConditionalOnLoggableAnnotation
public class SuperDBLogger {
}
