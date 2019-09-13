package org.test.eu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConApplication.class, args);
    }
}
