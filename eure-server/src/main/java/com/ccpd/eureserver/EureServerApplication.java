package com.ccpd.eureserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EureServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureServerApplication.class, args);
        System.out.println("hhh");
        System.out.println("2333");
    }

}
