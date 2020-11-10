package com.atguigu.springcloud.config;

import org.springframework.stereotype.Component;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/25 16:32
 */
@Component
public class PaymentServiceFallback implements PaymentService {
    @Override
    public String getPatment(String id) {
        return "服务降级，访问出错";
    }
}
