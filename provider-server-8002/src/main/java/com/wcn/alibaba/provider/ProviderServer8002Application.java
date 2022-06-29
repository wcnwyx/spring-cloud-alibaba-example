package com.wcn.alibaba.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@DubboComponentScan("com.wcn.alibaba.provider")
public class ProviderServer8002Application {
    public static void main(String[] args) {
        SpringApplication.run(ProviderServer8002Application.class, args);
    }
}
