package org.opentechnica.fashionfriends.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FassionfriendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FassionfriendsApplication.class, args);
    }
}
