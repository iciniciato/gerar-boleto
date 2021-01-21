package gerar.boleto.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoletoDTO {
    private Long id;
    private BigDecimal valor;
    private LocalDate dataEmissao;
    private LocalDate dataVencimento;
    private String descricao;
    private BigDecimal multaFixa; //valor fixo
    private Double jurosDiarios; //porcentagem
    private Double desconto; //porcentagem
    private BeneficiarioDTO beneficiario;
    private PagadorDTO pagador;
}
