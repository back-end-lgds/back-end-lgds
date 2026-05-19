package com.senai.backend.lgds_backend.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "lgds_backend",
        version = "1.0",
        description = "API LGDS"
    )
)

public class Swagger {
    
}
