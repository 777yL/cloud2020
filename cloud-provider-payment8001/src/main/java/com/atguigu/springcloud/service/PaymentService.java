package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/7 19:41
 */
public interface PaymentService {
    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}
