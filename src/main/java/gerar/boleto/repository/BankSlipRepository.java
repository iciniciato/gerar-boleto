package gerar.boleto.repository;

import gerar.boleto.entity.BankSlipEntity;
import org.springframework.data.repository.CrudRepository;

public interface BankSlipRepository extends CrudRepository<BankSlipEntity, Long> {
}
