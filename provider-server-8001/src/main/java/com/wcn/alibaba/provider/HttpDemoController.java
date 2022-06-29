package com.wcn.alibaba.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpDemoController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/demo")
    public String demo(){
        String ret = "This is Http Demo. port="+port;
        System.out.println(ret);
        return ret;
    }
}
