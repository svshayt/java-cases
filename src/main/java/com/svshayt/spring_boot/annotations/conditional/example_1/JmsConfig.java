package com.svshayt.spring_boot.annotations.conditional.example_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@ConditionalOnProperty(
        value="project.mq.enabled",
        matchIfMissing = false)
@Configuration
public class JmsConfig {

}
