package com.kuebiko.debit_card_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DebitCardDto {
    private Long id;
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

}
