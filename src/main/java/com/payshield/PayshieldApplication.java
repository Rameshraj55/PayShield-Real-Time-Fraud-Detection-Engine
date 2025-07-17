package com.payshield;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.payshield") // Ensures all your packages are scanned
@EnableJpaRepositories(basePackages = "com.payshield.repository") // Enable JPA Repos
public class PayshieldApplication {
    public static void main(String[] args) {

        System.out.println("PayShield-Real-Time-Fraud-Detection-Engine!");
    }
}