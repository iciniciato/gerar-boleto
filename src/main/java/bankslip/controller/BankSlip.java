package bankslip.controller;

import bankslip.entity.BankSlipEntity;
import bankslip.repository.BankSlipRepository;
import bankslip.service.BankSlipService;
import bankslip.dto.BankSlipDTO;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;
import java.util.UUID;

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

    @GetMapping("/{id}")
    public ResponseEntity getBankSlipId(@PathVariable UUID id){
        BankSlipDTO bankSlipDTO = bankSlipService.getBankSlipId(id);
        return ResponseEntity.ok(bankSlipDTO);
    }

    @PostMapping
    public ResponseEntity postBankSlip(@RequestBody BankSlipDTO bankSlipDTO){
        bankSlipService.postBankSlip(bankSlipDTO);
        return ResponseEntity.created(URI.create("/bankslip/" + bankSlipDTO.getId())).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity cancelBankSlip(@PathVariable UUID id){
        bankSlipService.cancelBankSlip(id);
        return ResponseEntity.ok().build();
    }

}
