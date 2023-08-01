package com.tms.hw43_44_rest.controller;

import com.tms.hw43_44_rest.domain.Client;
import com.tms.hw43_44_rest.domain.FileData;
import com.tms.hw43_44_rest.domain.PaymentCard;
import com.tms.hw43_44_rest.repository.FileDataRepository;
import com.tms.hw43_44_rest.service.BankingService;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;


@RestController
@RequestMapping("/banking")
public class BankingController {

    private BankingService bankingService;
    private FileDataRepository fileDataRepository;

    public BankingController(BankingService bankingService, FileDataRepository fileDataRepository) {
        this.bankingService = bankingService;
        this.fileDataRepository = fileDataRepository;
    }

    @GetMapping("/clients/{clientId}")
    public ResponseEntity<Client> getClient(@PathVariable Long clientId) {
        Client client = bankingService.getClient(clientId);
        if (client != null) {
            return new ResponseEntity<>(client, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/cards/{cardId}")
    public ResponseEntity<PaymentCard> getPaymentCard(@PathVariable Long cardId) {
        PaymentCard paymentCard = bankingService.getPaymentCard(cardId);
        if (paymentCard != null) {
            return new ResponseEntity<>(paymentCard, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transferAmount(@RequestParam Long sourceCardId,
                                                 @RequestParam Long targetCardId,
                                                 @RequestParam Double amount) {
        Optional<PaymentCard> sourceCardOpt = Optional.ofNullable(getPaymentCard(sourceCardId).getBody());
        Optional<PaymentCard> targetCardOpt = Optional.ofNullable(getPaymentCard(targetCardId).getBody());
        if (sourceCardOpt.isEmpty() || targetCardOpt.isEmpty()) {
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
        PaymentCard sourceCard = sourceCardOpt.get();
        if (sourceCard.getAmount() < amount) {
            return new ResponseEntity<>("Insufficient balance in the source card.",HttpStatus.CONFLICT);
        }
        else{
            return new ResponseEntity<>(bankingService.transferAmount(sourceCardId, targetCardId, amount), HttpStatus.OK);
        }
    }
//TODO: доделать эту поеботу
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            byte[] fileBytes = file.getBytes();
            String fileName = file.getOriginalFilename();
            FileData fileData = new FileData();
            fileData.setFileName(fileName);
            fileData.setFileData(fileBytes);
            fileDataRepository.save(fileData);

            return ResponseEntity.ok("File uploaded successfully");
        } catch (IOException | SQLException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file");
        }
    }
}
