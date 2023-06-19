package com.Lcx.SpringCloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004 {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(Payment8004.class,args);
    }
}
