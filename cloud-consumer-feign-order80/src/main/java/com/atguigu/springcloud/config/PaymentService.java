package com.atguigu.springcloud.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/25 16:15
 */
@Component
@FeignClient(name = "nacos-payment-provider",fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPatment(@PathVariable("id") String id);
}
