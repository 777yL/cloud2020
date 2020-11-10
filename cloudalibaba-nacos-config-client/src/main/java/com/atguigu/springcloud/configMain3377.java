package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/11 19:46
 */
@SpringBootApplication
@EnableDiscoveryClient
public class configMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(configMain3377.class,args);
    }
}
