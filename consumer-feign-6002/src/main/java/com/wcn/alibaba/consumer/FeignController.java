package com.wcn.alibaba.consumer;

import com.wcn.alibaba.provider.api.FeignDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignDemoService feignDemoService;

    @RequestMapping("/demo")
    public String demo(){
        return feignDemoService.demoCall();
    }

}
