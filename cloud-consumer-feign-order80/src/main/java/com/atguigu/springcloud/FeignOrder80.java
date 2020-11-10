package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/25 16:04
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignOrder80.class,args);

    }
}
