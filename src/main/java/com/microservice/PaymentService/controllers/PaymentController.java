package com.microservice.PaymentService.controllers;


import com.microservice.PaymentService.dtos.ClientSidePaymentDo;
import com.microservice.PaymentService.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService)
    {
        this.paymentService=paymentService;
    }

    @PostMapping
    public String getPaymentLink(@RequestBody ClientSidePaymentDo dto)
    {
        return paymentService.getPaymentLink(dto.getAmount(),dto.getEmail(), dto.getOrderId(),dto.getPhoneNumber());
    }
}
