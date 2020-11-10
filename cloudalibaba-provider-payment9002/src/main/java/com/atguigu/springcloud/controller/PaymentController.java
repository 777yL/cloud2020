package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/11 16:09
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPatment(@PathVariable("id") String id){
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;

    }
}
