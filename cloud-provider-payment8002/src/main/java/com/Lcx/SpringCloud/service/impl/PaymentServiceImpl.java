package com.Lcx.SpringCloud.service.impl;

import com.Lcx.SpringCloud.dao.PaymentDao;
import com.Lcx.SpringCloud.entities.Payment;
import com.Lcx.SpringCloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
