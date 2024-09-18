package com.kuebiko.debit_card_service.service;

import com.kuebiko.debit_card_service.dto.DebitCardDto;
import com.kuebiko.debit_card_service.mapper.DebitCardMapper;
import com.kuebiko.debit_card_service.repository.DebitCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebitCardServiceImpl implements DebitCardService{

    @Autowired
    DebitCardRepository debitCardRepository;

    @Autowired
    DebitCardMapper debitCardMapper;
    @Override
    public List<DebitCardDto> getAllDebitCards() {
        return null;
    }

    @Override
    public DebitCardDto getDebitCardById(Long id) {
        return null;
    }

    @Override
    public DebitCardDto createDebitCard(DebitCardDto debitCardDto) {
        return null;
    }

    @Override
    public DebitCardDto updateDebitCard(Long id, DebitCardDto debitCardDto) {
        return null;
    }

    @Override
    public void deleteDebitCard(Long id) {

    }
}
