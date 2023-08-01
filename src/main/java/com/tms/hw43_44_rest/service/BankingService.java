package com.tms.hw43_44_rest.service;

import com.tms.hw43_44_rest.domain.Client;
import com.tms.hw43_44_rest.domain.PaymentCard;
import com.tms.hw43_44_rest.repository.ClientRepository;
import com.tms.hw43_44_rest.repository.PaymentCardRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankingService {

    private ClientRepository clientRepository;
    private PaymentCardRepository paymentCardRepository;

    public BankingService(ClientRepository clientRepository, PaymentCardRepository paymentCardRepository){
        this.clientRepository = clientRepository;
        this.paymentCardRepository = paymentCardRepository;
    }

    public Client getClient(Long clientId) {
        return clientRepository.findById(clientId);
    }

    public PaymentCard getPaymentCard(Long cardId) {
        return paymentCardRepository.findById(cardId);
    }

    public String transferAmount(Long sourceCardId, Long targetCardId, Double amount) {
        //changed in order to give another status code in controller method
//        Optional<PaymentCard> sourceCardOpt = Optional.ofNullable(paymentCardRepository.findById(sourceCardId));
//        Optional<PaymentCard> targetCardOpt = Optional.ofNullable(paymentCardRepository.findById(targetCardId));
//        if (sourceCardOpt.isEmpty() || targetCardOpt.isEmpty()) {
//            return "Cards aren't exist";
//        }
//
//        PaymentCard sourceCard = sourceCardOpt.get();
//        PaymentCard targetCard = targetCardOpt.get();

        PaymentCard sourceCard = paymentCardRepository.findById(sourceCardId);
        PaymentCard targetCard = paymentCardRepository.findById(targetCardId);
//        if (sourceCard.getAmount() < amount) {
//            return "Insufficient balance in the source card.";
//        }else{
            sourceCard.setAmount(sourceCard.getAmount() - amount);
            targetCard.setAmount(targetCard.getAmount() + amount);
            paymentCardRepository.save(sourceCard);
            paymentCardRepository.save(targetCard);
            return "Transfer successful";
        //}
    }
}

