package com.twip.springcloud.service.impl;

import com.twip.springcloud.dao.PaymentDao;
import com.twip.springcloud.entities.Payment;
import com.twip.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 七画一只妖
 * @Date: 2021/12/1 14:08
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
