package gerar.boleto.dto.mapper;

import gerar.boleto.dto.BankSlipDTO;
import gerar.boleto.entity.BankSlipEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankSlipMapper {

    BankSlipDTO toBankSlipDTO(BankSlipEntity bankSlipEntity);

    BankSlipEntity toBankSlipEntity(BankSlipDTO bankSlipDTO);
}