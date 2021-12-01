package com.twip.springcloud.service;

import com.twip.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/1 14:07
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
