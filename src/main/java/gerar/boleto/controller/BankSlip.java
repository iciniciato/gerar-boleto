package gerar.boleto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankslips")
public class BankSlip {

    @GetMapping
    public ResponseEntity<String> getBankSlips() {

        return ResponseEntity.ok().body("ok");
    }
}
