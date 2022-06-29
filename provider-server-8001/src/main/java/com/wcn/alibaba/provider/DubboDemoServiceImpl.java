package com.wcn.alibaba.provider;

import com.wcn.alibaba.provider.api.DubboDemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService
public class DubboDemoServiceImpl implements DubboDemoService {
    @Value("${server.port}")
    private int port;

    @Override
    public String sayHello(String name) {
        String ret = "hello "+name+". i am dubbo provider "+port;
        System.out.println(ret);
        return ret;
    }
}
