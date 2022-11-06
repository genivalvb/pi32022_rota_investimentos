package pi32022_rota_intestimentos.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Acoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 10)
    private LocalDate dataRegistro;
    @Column(nullable = false, length = 20)
    private BigDecimal valor;

}
