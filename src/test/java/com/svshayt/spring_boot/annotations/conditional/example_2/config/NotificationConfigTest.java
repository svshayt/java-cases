package com.svshayt.spring_boot.annotations.conditional.example_2.config;

import com.svshayt.spring_boot.annotations.conditional.example_2.service.EmailNotification;
import com.svshayt.spring_boot.annotations.conditional.example_2.service.NotificationSender;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class NotificationConfigTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Test
    void whenValueSetToEmail_thenCreateEmailNotification() {
        this.contextRunner.withPropertyValues("notification.service=email")
                .withUserConfiguration(NotificationConfig.class)
                .run(context -> {
                    assertThat(context).hasBean("emailNotification");
                    NotificationSender notificationSender = context.getBean(EmailNotification.class);
                    assertThat(notificationSender.send("Hello svshayt!"))
                            .isEqualTo("Email Notification: Hello svshayt!");
                    assertThat(context).doesNotHaveBean("smsNotification");
                });
    }
}