package modelos;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

public class InformeDiarioParque {


    private int id;
    private LocalDate fechaInforme;
    private Map<TipoPersona, Integer> numeroPersonasPorTipo;
    private Double totalDineroIngresado;


    public InformeDiarioParque() {
    }

    public InformeDiarioParque(int id, LocalDate fechaInforme, Map<TipoPersona, Integer> numeroPersonasPorTipo, Double totalDineroIngresado) {
        this.id = id;
        this.fechaInforme = fechaInforme;
        this.numeroPersonasPorTipo = numeroPersonasPorTipo;
        this.totalDineroIngresado = totalDineroIngresado;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(LocalDate fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public Map<TipoPersona, Integer> getNumeroPersonasPorTipo() {
        return numeroPersonasPorTipo;
    }

    public void setNumeroPersonasPorTipo(Map<TipoPersona, Integer> numeroPersonasPorTipo) {
        this.numeroPersonasPorTipo = numeroPersonasPorTipo;
    }

    public Double getTotalDineroIngresado() {
        return totalDineroIngresado;
    }

    public void setTotalDineroIngresado(Double totalDineroIngresado) {
        this.totalDineroIngresado = totalDineroIngresado;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InformeDiarioParque that = (InformeDiarioParque) o;
        return id == that.id && Objects.equals(fechaInforme, that.fechaInforme) && Objects.equals(numeroPersonasPorTipo, that.numeroPersonasPorTipo) && Objects.equals(totalDineroIngresado, that.totalDineroIngresado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaInforme, numeroPersonasPorTipo, totalDineroIngresado);
    }


    @Override
    public String toString() {
        return "InformeDiarioParque{" +
                "id=" + id +
                ", fechaInforme=" + fechaInforme +
                ", numeroPersonasPorTipo=" + numeroPersonasPorTipo +
                ", totalDineroIngresado=" + totalDineroIngresado +
                '}';
    }
}
