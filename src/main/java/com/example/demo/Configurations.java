package com.example.demo;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
