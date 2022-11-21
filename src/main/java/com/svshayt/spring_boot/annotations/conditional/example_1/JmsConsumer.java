package com.svshayt.spring_boot.annotations.conditional.example_1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@ConditionalOnBean(JmsConfig.class)
@Component
public class JmsConsumer {

}
