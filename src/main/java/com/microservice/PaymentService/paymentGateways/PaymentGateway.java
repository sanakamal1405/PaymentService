package com.microservice.PaymentService.paymentGateways;

public interface PaymentGateway {

    public String generatePaymentLink(String orderId, Long amount, String email, String phoneNumber);
}
