package gerar.boleto.dto;

import gerar.boleto.enums.Status;
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
    private Date due_date;
    private BigDecimal total_in_cents;
    private String customer;
    private Status status;
}
