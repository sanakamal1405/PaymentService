package com.microservice.PaymentService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class  ClientSidePaymentDo{
    private String email;
    private String phoneNumber;
    private Long amount;
    private String orderId;
}


