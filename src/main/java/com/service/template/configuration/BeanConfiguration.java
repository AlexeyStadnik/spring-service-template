package com.service.template.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@AllArgsConstructor
public class BeanConfiguration {

    private final AppConfiguration appConfiguration;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
