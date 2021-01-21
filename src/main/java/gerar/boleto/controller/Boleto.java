package gerar.boleto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boletos")
public class Boleto {

    @GetMapping
    public ResponseEntity<String> getBoletos() {
        return ResponseEntity.ok().body("ok");
    }
}
