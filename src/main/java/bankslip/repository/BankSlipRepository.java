package bankslip.repository;

import bankslip.entity.BankSlipEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface BankSlipRepository extends CrudRepository<BankSlipEntity, UUID> {
    Optional<BankSlipEntity> findById(UUID id);

    void deleteById(UUID id);
}
