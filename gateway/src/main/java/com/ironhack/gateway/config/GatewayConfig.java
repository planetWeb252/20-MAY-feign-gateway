package com.ironhack.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    // ups! Alguien ha hackeado esto y ahora no tenemos la config
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user", r -> r.path("/api/user/**")
                        .uri("lb://user-micro"))
                .route("account", r -> r.path("/api/accounts/**")
                        .uri("lb://accounts-micro"))
                .build();
    }
}

// ¿Qué es lb???
// LOAD BALANCER: Le estamos diciendo al gateway que use el load balancer para redirigir las peticiones a los microservicios repartiendo su carga.