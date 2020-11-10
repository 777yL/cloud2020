package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/11 16:49
 */

@RestController
public class OrderController {

    @Resource
    RestTemplate restTemplate;
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/nacos/payment/{id}")
    public String getOrder(@PathVariable("id") String id){

        ResponseEntity<String> entity = restTemplate.getForEntity(serverURL + "/payment/nacos/" + id, String.class);
        HttpHeaders headers = entity.getHeaders();
        System.out.println(headers);
        System.out.println(entity.getBody());
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}
