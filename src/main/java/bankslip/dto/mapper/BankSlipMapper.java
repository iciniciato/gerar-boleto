package bankslip.dto.mapper;

import bankslip.entity.BankSlipEntity;
import bankslip.dto.BankSlipDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankSlipMapper {

    BankSlipDTO toBankSlipDTO(BankSlipEntity bankSlipEntity);

    BankSlipEntity toBankSlipEntity(BankSlipDTO bankSlipDTO);
}