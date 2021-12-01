package com.twip.springcloud.dao;

import com.twip.springcloud.entities.Payment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
