package com.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Indicates that this class contains Spring configuration
@ComponentScan(basePackages = "com.test.entities") // Enables component scanning for the specified package
public class AppConfig {
	
}
