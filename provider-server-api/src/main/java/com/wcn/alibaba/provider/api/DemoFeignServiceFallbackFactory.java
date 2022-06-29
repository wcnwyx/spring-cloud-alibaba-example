package com.wcn.alibaba.provider.api;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoFeignServiceFallbackFactory implements FallbackFactory<FeignDemoService> {
    @Override
    public FeignDemoService create(Throwable throwable) {
        return new FeignDemoService() {
            @Override
            public String demoCall() {
                return "this is error msg. from FallbackFactory";
            }
        };
    }
}
