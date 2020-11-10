package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.config.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/25 16:07
 */
@RestController
public class OrderController {

    @Resource
    PaymentService paymentService;

    @GetMapping("order/test")
    public String test(){
     return   paymentService.getPatment("1");
    }
}
