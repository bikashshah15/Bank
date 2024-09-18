package com.kuebiko.debit_card_service.service;

import com.kuebiko.debit_card_service.dto.DebitCardDto;
import com.kuebiko.debit_card_service.mapper.DebitCardMapper;
import com.kuebiko.debit_card_service.model.DebitCard;
import com.kuebiko.debit_card_service.repository.DebitCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DebitCardServiceImpl implements DebitCardService{

    @Autowired
    DebitCardRepository debitCardRepository;

    @Autowired
    DebitCardMapper debitCardMapper;
    @Override
    public List<DebitCardDto> getAllDebitCards() {

        return debitCardRepository.findAll()
                .stream()
                .map(debitCardMapper :: toDto)
                .collect(Collectors.toList());
    }

    @Override
    public DebitCardDto getDebitCardById(Long id) {
        Optional<DebitCard> debitCardOptional = debitCardRepository.findById(id);
        DebitCard debitCard = debitCardOptional.orElseThrow(() -> new RuntimeException("Debit card not found"));
        return debitCardMapper.toDto(debitCard);
    }

    @Override
    public DebitCardDto createDebitCard(DebitCardDto debitCardDto) {
        DebitCard debitCard = debitCardMapper.toEntity(debitCardDto);
        return debitCardMapper.toDto(debitCardRepository.save(debitCard));
    }

    @Override
    public DebitCardDto updateDebitCard(Long id, DebitCardDto debitCardDto) {
        DebitCard debitCard = debitCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Debit card not found"));
        debitCard.setCardNumber(debitCardDto.getCardNumber());
        debitCard.setCardHolderName(debitCardDto.getCardHolderName());
        debitCard.setExpiryDate(debitCardDto.getExpiryDate());
        debitCard.setCvv(debitCardDto.getCvv());
        return debitCardMapper.toDto(debitCardRepository.save(debitCard));
    }

    @Override
    public void deleteDebitCard(Long id) {
        DebitCard debitCard = debitCardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Debit card not found"));
         debitCardRepository.delete(debitCard);

    }
}
