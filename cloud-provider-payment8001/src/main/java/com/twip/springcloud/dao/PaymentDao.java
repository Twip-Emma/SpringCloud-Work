package com.twip.springcloud.dao;

import com.twip.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PaymentDao {
    @Insert("insert into payment (serial)values(#{serial})")
    int create(Payment payment);

    @Select("select * from payment where id=#{id}")
    Payment getPaymentById(@Param("id") Long id);
}
