package pi32022_rota_intestimentos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FiiDTO {

    private Integer id;

    @NotNull
    private LocalDate data_registro;

    @NotNull
    private BigDecimal renda;

    @NotNull
    private String tipo;

    @NotNull
    private BigDecimal valor_investido;

    @NotNull
    private String name;


}
