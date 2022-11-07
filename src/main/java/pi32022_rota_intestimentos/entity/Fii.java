package pi32022_rota_intestimentos.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "fii")
public class Fii {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private LocalDate data_registro;

    @Column(nullable = false, length = 20)
    private BigDecimal renda;

    @Column(nullable = false, length = 20)
    private String tipo;

    @Column(nullable = false, length = 20)
    private BigDecimal valor_investido;

    @Column(nullable = false, length = 20)
    private String name;

    public Fii() {}

    public Fii(Long id, LocalDate data_registro, BigDecimal renda, String tipo, BigDecimal valor_investido, String name) {
        this.id = id;
        this.data_registro = data_registro;
        this.renda = renda;
        this.tipo = tipo;
        this.valor_investido = valor_investido;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData_registro() {
        return data_registro;
    }

    public void setData_registro(LocalDate data_registro) {
        this.data_registro = data_registro;
    }

    public BigDecimal getRenda() {
        return renda;
    }

    public void setRenda(BigDecimal renda) {
        this.renda = renda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor_investido() {
        return valor_investido;
    }

    public void setValor_investido(BigDecimal valor_investido) {
        this.valor_investido = valor_investido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fii)) return false;
        Fii fii = (Fii) o;
        return Objects.equals(id, fii.id) && Objects.equals(data_registro, fii.data_registro) && Objects.equals(renda, fii.renda) && Objects.equals(tipo, fii.tipo) && Objects.equals(valor_investido, fii.valor_investido) && Objects.equals(name, fii.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data_registro, renda, tipo, valor_investido, name);
    }

    @Override
    public String toString() {
        return "Fii{" +
                "id=" + id +
                ", data_registro=" + data_registro +
                ", renda=" + renda +
                ", tipo='" + tipo + '\'' +
                ", valor_investido=" + valor_investido +
                ", name='" + name + '\'' +
                '}';
    }
}
