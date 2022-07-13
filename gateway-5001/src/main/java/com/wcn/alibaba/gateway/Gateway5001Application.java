package com.wcn.alibaba.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway5001Application {
    public static void main(String[] args) {
        SpringApplication.run(Gateway5001Application.class, args);
    }

}
