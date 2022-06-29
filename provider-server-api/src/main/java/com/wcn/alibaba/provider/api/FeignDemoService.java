package com.wcn.alibaba.provider.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//fallback和fallbackFactory都可以
@FeignClient(name = "provider-server", fallbackFactory = DemoFeignServiceFallbackFactory.class)
//@FeignClient(name = "provider-server", fallback= DemoFeignServiceFallback.class)
public interface FeignDemoService {

    //requestMapping对应真实的请求地址，方法名随便
    @RequestMapping(value = "/demo")
    String demoCall();
}
