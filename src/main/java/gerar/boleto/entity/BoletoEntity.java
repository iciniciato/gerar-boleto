package gerar.boleto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoletoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private LocalDate dataEmissao;

    @DateTimeFormat(pattern = "YYYY-MM-dd")
    private LocalDate dataVencimento;

    private String descricao;
    private BigDecimal multaFixa; //valor fixo
    private Double jurosDiarios; //porcentagem
    private Double desconto; //porcentagem

    @ManyToOne
    @JoinColumn(name = "beneficiario_id")
    private BeneficiarioEntity beneficiario;

    @ManyToOne
    @JoinColumn(name = "pagador_id")
    private PagadorEntity pagador;

}
