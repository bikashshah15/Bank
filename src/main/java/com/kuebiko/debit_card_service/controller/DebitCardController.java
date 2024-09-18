package com.kuebiko.debit_card_service.controller;

import com.kuebiko.debit_card_service.dto.DebitCardDto;
import com.kuebiko.debit_card_service.service.DebitCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/debit-card")
public class DebitCardController {

    @Autowired
    DebitCardService debitCardService;

    @GetMapping
    public List<DebitCardDto> getAllDebitCard(){
        return debitCardService.getAllDebitCards();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DebitCardDto> getDebitCardById(@PathVariable Long id){
        return ResponseEntity.ok(debitCardService.getDebitCardById(id));
    }

    @PostMapping
    public ResponseEntity<DebitCardDto> createDebitCard(@RequestBody DebitCardDto debitCardDto){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(debitCardService.createDebitCard(debitCardDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DebitCardDto> updateDebitCard(@PathVariable Long id, @RequestBody DebitCardDto debitCardDto){
        return ResponseEntity.ok(debitCardService.updateDebitCard(id, debitCardDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DebitCardDto> deleteDebitCard(@PathVariable Long id){
        debitCardService.deleteDebitCard(id);
        return ResponseEntity.noContent().build();
    }
}
