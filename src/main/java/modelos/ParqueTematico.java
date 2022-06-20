package modelos;

import java.util.List;
import java.util.Objects;

public class ParqueTematico {

    private int id;
    private String nombre;
    private Ubicacion ubicacion;
    private Integer num_max_visitantes;
    private TipoParque tipoParque;
    private List<Tarifa> tarifas;
    private List<Atraccion> atracciones;

    public ParqueTematico(int id, String nombre, Ubicacion ubicacion, Integer num_max_visitantes, List<Tarifa> tarifas, List<Atraccion> atracciones) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.num_max_visitantes = num_max_visitantes;
        this.tarifas = tarifas;
        this.atracciones = atracciones;
    }

    public ParqueTematico() {
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

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getNum_max_visitantes() {
        return num_max_visitantes;
    }

    public void setNum_max_visitantes(Integer num_max_visitantes) {
        this.num_max_visitantes = num_max_visitantes;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParqueTematico that = (ParqueTematico) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(ubicacion, that.ubicacion) && Objects.equals(num_max_visitantes, that.num_max_visitantes) && Objects.equals(tarifas, that.tarifas) && Objects.equals(atracciones, that.atracciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ubicacion, num_max_visitantes, tarifas, atracciones);
    }


    @Override
    public String toString() {
        return "ParqueTematico{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion=" + ubicacion +
                ", num_max_visitantes=" + num_max_visitantes +
                ", tarifas=" + tarifas +
                ", atracciones=" + atracciones +
                '}';
    }
}



