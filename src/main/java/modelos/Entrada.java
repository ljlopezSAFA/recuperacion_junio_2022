package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Entrada {

    private int id;
    private String codigoEntrada;
    private ParqueTematico parqueTematico;
    private LocalDate fechaEntrada;
    private Tarifa tarifa;

    public Entrada() {
    }

    public Entrada(int id, String codigoEntrada, ParqueTematico parqueTematico, LocalDate fechaEntrada, Tarifa tarifa) {
        this.id = id;
        this.codigoEntrada = codigoEntrada;
        this.parqueTematico = parqueTematico;
        this.fechaEntrada = fechaEntrada;
        this.tarifa = tarifa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoEntrada() {
        return codigoEntrada;
    }

    public void setCodigoEntrada(String codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public ParqueTematico getParqueTematico() {
        return parqueTematico;
    }

    public void setParqueTematico(ParqueTematico parqueTematico) {
        this.parqueTematico = parqueTematico;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return id == entrada.id &&
                Objects.equals(codigoEntrada, entrada.codigoEntrada) &&
                Objects.equals(parqueTematico, entrada.parqueTematico) &&
                Objects.equals(fechaEntrada, entrada.fechaEntrada) &&
                Objects.equals(tarifa, entrada.tarifa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoEntrada, parqueTematico, fechaEntrada, tarifa);
    }


    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", codigoEntrada='" + codigoEntrada + '\'' +
                ", parqueTematico=" + parqueTematico +
                ", fechaEntrada=" + fechaEntrada +
                ", tarifa=" + tarifa +
                '}';
    }
}
