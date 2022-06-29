package com.wcn.alibaba.consumer;

import com.wcn.alibaba.provider.api.DubboDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {

    @DubboReference
    private DubboDemoService dubboDemoService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return dubboDemoService.sayHello("test");
    }

}
