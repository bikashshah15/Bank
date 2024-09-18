package com.kuebiko.debit_card_service.service;

import com.kuebiko.debit_card_service.dto.DebitCardDto;

import java.util.List;


public interface DebitCardService {
    List<DebitCardDto>getAllDebitCards();
    DebitCardDto getDebitCardById(Long id);
    DebitCardDto createDebitCard(DebitCardDto debitCardDto);
    DebitCardDto updateDebitCard(Long id, DebitCardDto debitCardDto);
    void deleteDebitCard(Long id);
}
