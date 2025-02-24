package com.microservicio.backend_hospital.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permitir acceso a todas las rutas
                        .allowedOrigins("*") // Permitir acceso desde cualquier dominio
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                        .allowedHeaders("*") // Permitir todos los headers
                        .exposedHeaders("Authorization") // Permitir que el frontend lea el header Authorization
                        .allowCredentials(false); // Si usas autenticación basada en cookies, cámbialo a true
            }
        };
    }
}
