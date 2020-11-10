package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/11 19:49
 */
@RestController
@RefreshScope  //nacos支持动态刷新
public class ConfigClientController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/config/info")
    public String getInfo(){
        return info;
    }
}
