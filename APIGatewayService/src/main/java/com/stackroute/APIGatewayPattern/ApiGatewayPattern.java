package com.stackroute.APIGatewayPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayPattern {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayPattern.class, args);
	}

}
