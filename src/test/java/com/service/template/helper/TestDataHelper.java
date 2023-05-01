package com.service.template.helper;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

@Component
@RequiredArgsConstructor
public class TestDataHelper {

    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static final Faker FAKER = new Faker();

}
