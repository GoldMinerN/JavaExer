package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
public interface PaymentDao {
    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}