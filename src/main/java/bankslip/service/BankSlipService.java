package bankslip.service;

import bankslip.repository.BankSlipRepository;
import bankslip.dto.BankSlipDTO;
import bankslip.dto.mapper.BankSlipMapper;
import bankslip.entity.BankSlipEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class BankSlipService {

    private final BankSlipRepository bankSlipRepository;

    private final BankSlipMapper bankSlipMapper;

    public Iterable<BankSlipEntity> getBankSlips() {
        Iterable<BankSlipEntity> bankslips = bankSlipRepository.findAll();
        return bankslips;
    }

    public BankSlipDTO getBankSlipByIndex(Long id) {
        Optional<BankSlipEntity> bankSlipEntity = bankSlipRepository.findById(id);
        BankSlipDTO bankSlipDTO = new BankSlipDTO();
        if (bankSlipEntity.isPresent()){
            bankSlipDTO = bankSlipMapper.toBankSlipDTO(bankSlipEntity.get());
        }
        return bankSlipDTO;
    }

    public void postBankSlip(BankSlipDTO bankSlipDTO) {
        BankSlipEntity bankSlipEntity = bankSlipMapper.toBankSlipEntity(bankSlipDTO);
        bankSlipRepository.save(bankSlipEntity);
    }
}
