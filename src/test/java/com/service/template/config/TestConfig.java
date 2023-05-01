package com.service.template.config;

import com.service.template.helper.TestDataHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
@RequiredArgsConstructor
public class TestConfig {

    private final TestDataHelper testDataHelper;

}
