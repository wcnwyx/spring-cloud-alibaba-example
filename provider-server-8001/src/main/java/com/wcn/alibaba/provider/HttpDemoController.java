package com.wcn.alibaba.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HttpDemoController {

    @Value("${server.port}")
    private int port;

    @Value("${dbName}")//nacos中配置
    private String dbName;

    @RequestMapping("/demo")
    public String demo(){
        String ret = "This is Http Demo. port="+port;
        System.out.println(ret);
        return ret;
    }

    @RequestMapping("/getConfig")
    public String getConfig(){
        System.out.println(this);
        return "my port="+port+"。 dbName="+dbName;
    }
}
