package modelos;

import java.util.Objects;

public class Atraccion {

    private int  id;
    private String nombre;
    private TipoAtraccion tipo;
    private Double alturaMinima;

    public Atraccion(int id, String nombre, TipoAtraccion tipo, Double alturaMinima) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.alturaMinima = alturaMinima;
    }

    public Atraccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoAtraccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoAtraccion tipo) {
        this.tipo = tipo;
    }

    public Double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(Double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atraccion atraccion = (Atraccion) o;
        return Objects.equals(nombre, atraccion.nombre) && tipo == atraccion.tipo && Objects.equals(alturaMinima, atraccion.alturaMinima);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tipo, alturaMinima);
    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", alturaMinima=" + alturaMinima +
                '}';
    }
}
