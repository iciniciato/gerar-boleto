package gerar.boleto.controller;

import gerar.boleto.dto.BankSlipDTO;
import gerar.boleto.entity.BankSlipEntity;
import gerar.boleto.repository.BankSlipRepository;
import gerar.boleto.service.BankSlipService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@AllArgsConstructor
@RestController
@RequestMapping("/bankslips")
public class BankSlip {


    private final BankSlipRepository bankSlipRepository;

    private final BankSlipService bankSlipService;

    @GetMapping
    public ResponseEntity<Iterable<BankSlipEntity>> getBankSlips() {
        return new ResponseEntity(bankSlipService.getBankSlips(), HttpStatus.ACCEPTED);
    }

    @GetMapping("{/id}")
    public ResponseEntity<BankSlipDTO> getBankSlip(@PathVariable Long id) {
        BankSlipDTO bankSlipDTO = bankSlipService.getBankSlipByIndex(id);
        return ResponseEntity.ok(bankSlipDTO);
    }

    @PostMapping
    public ResponseEntity postBankSlip(BankSlipDTO bankSlipDTO){
        bankSlipService.postBankSlip(bankSlipDTO);
        return ResponseEntity.created(URI.create("/bankslip/" + bankSlipDTO.getId())).build();
    }

}
