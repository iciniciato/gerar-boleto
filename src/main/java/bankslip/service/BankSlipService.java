package bankslip.service;

import bankslip.repository.BankSlipRepository;
import bankslip.dto.BankSlipDTO;
import bankslip.dto.mapper.BankSlipMapper;
import bankslip.entity.BankSlipEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class BankSlipService {

    private final BankSlipRepository bankSlipRepository;

    private final BankSlipMapper bankSlipMapper;

    public Iterable<BankSlipEntity> getBankSlips() {
        Iterable<BankSlipEntity> bankSlipEntity = bankSlipRepository.findAll();
        return bankSlipEntity;
    }

    public BankSlipDTO getBankSlipId(UUID id){
        Optional<BankSlipEntity> bankSlipEntity = bankSlipRepository.findById(id);
        BankSlipDTO bankSlipDTO = new BankSlipDTO();
        if(bankSlipEntity.isPresent()) {
            bankSlipDTO = bankSlipMapper.toBankSlipDTO(bankSlipEntity.get());
        }
        return bankSlipDTO;
    }

    public void postBankSlip(BankSlipDTO bankSlipDTO) {
        BankSlipEntity bankSlipEntity = bankSlipMapper.toBankSlipEntity(bankSlipDTO);
        bankSlipRepository.save(bankSlipEntity);
    }

    public void cancelBankSlip(UUID id) {
        bankSlipRepository.deleteById(id);
    }
}
