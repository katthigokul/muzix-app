package com.stackroute;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;

@PropertySource("application-prod.properties")
@SpringBootApplication
@EnableDiscoveryClient
public class TrackServiceApplication {
    public static void main(String[] args) {
        SpringApplication. run(TrackServiceApplication.class, args);
    }
}
