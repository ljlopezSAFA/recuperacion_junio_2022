package modelos;

import java.util.Objects;

public class Tarifa {

    private TipoPersona tipo;
    private Double precio;

    public Tarifa(TipoPersona tipo, Double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public TipoPersona getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersona tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarifa tarifa = (Tarifa) o;
        return tipo == tarifa.tipo && Objects.equals(precio, tarifa.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, precio);
    }


    @Override
    public String toString() {
        return "Tarifa{" +
                "tipo=" + tipo +
                ", precio=" + precio +
                '}';
    }
}
