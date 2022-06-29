package com.wcn.alibaba.provider.api;

import org.springframework.stereotype.Component;

@Component
public class FeignDemoServiceFallback implements FeignDemoService{
    @Override
    public String demoCall() {
        return "this is error msg. from Fallback";
    }
}
