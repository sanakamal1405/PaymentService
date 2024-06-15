package com.microservice.PaymentService.services;

import com.microservice.PaymentService.paymentGateways.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    public String getPaymentLink(Long amount, String email, String orderId, String phoneNumber) {

        return paymentGateway.generatePaymentLink(orderId, amount, email, phoneNumber);
    }
}
