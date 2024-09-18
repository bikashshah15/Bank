package com.kuebiko.debit_card_service.repository;

import com.kuebiko.debit_card_service.model.DebitCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {
}
