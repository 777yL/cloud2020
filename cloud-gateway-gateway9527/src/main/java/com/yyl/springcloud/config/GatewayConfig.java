package com.yyl.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/11/13 14:55
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {

        return builder.routes().route(
                "payment9002",
                r -> r.path("/testRouter")
                .uri("http://localhost:9002")).build();
    }
}
