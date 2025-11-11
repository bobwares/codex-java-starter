/**
 * App:
 * Package: com.bobwares
 * File: Application.java
 * Version: 0.1.0
 * Turns: Turn 1
 * Author: Bobwares
 * Date: 2025-10-30T08:07:15Z
 * Exports: Application
 * Description: Spring Boot entry point that boots the service.
 */
package com.bobwares;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
// <- @ConfigurationPropertiesScan("com.bobwares.customer.registration.config") :: update with maven settings and domain. ->
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
