package gerar.boleto.entity;

import gerar.boleto.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "BANKSLIP")
public class BankSlipEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date due_date;

    private BigDecimal total_in_cents;

    private String customer;

    private Status status;
}
