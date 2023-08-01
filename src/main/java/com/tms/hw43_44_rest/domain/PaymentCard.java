package com.tms.hw43_44_rest.domain;

import lombok.Data;

@Data
public class PaymentCard {

    private Long id;
    private String cardNumber;
    private String cardHolderName;
    private Double amount;
}
