package com.kuebiko.debit_card_service.mapper;

import com.kuebiko.debit_card_service.dto.DebitCardDto;
import com.kuebiko.debit_card_service.model.DebitCard;
import org.springframework.stereotype.Component;

@Component
public class DebitCardMapper {
    public DebitCardDto toDto (DebitCard debitCard){
        DebitCardDto debitCardDto = new DebitCardDto();
        debitCardDto.setId(debitCard.getId());
        debitCardDto.setCardNumber(debitCard.getCardNumber());
        debitCardDto.setCardHolderName(debitCard.getCardHolderName());
        debitCardDto.setExpiryDate(debitCard.getExpiryDate());
        debitCardDto.setCvv(debitCard.getCvv());
        return debitCardDto;

    }
    public DebitCard toEntity (DebitCardDto debitCardDto){
        DebitCard debitCard = new DebitCard();
        debitCard.setCardNumber(debitCardDto.getCardNumber());
        debitCard.setCardHolderName(debitCardDto.getCardHolderName());
        debitCard.setExpiryDate(debitCardDto.getExpiryDate());
        debitCard.setCvv(debitCardDto.getCvv());
        return debitCard;
    }
}
