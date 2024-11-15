package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test.entities") // Scan for components in this package
public class AppConfig {
    // Additional configurations can go here if needed
}
