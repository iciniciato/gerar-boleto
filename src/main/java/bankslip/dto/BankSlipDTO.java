package bankslip.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import bankslip.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankSlipDTO {

    private UUID id;

    @JsonProperty("due_date")
    private Date dueDate;

    @JsonProperty("total_in_cents")
    private BigDecimal totalInCents;

    @JsonProperty("customer")
    private String customer;

    @JsonProperty("status")
    private Status status;
}
