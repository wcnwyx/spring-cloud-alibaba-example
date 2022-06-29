package com.wcn.alibaba.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//当feignClient不在该包目录及其子目录下是，通过EnableFeignClients的basePackages来指定目录
//feignClient里定义的fallback或者fallbackFactory也需要通过scanBasePackages来指定目录扫描
@EnableFeignClients(basePackages = {"com.wcn.alibaba.provider.api"})
@SpringBootApplication(scanBasePackages = {"com.wcn.alibaba.provider.api", "com.wcn.alibaba.consumer"})
public class ConsumerFeign6002Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign6002Application.class, args);
    }
}
