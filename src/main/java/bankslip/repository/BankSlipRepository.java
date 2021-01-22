package bankslip.repository;

import bankslip.entity.BankSlipEntity;
import org.springframework.data.repository.CrudRepository;

public interface BankSlipRepository extends CrudRepository<BankSlipEntity, Long> {
}
