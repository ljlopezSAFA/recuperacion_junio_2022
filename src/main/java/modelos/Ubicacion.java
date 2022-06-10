package modelos;

import java.util.Objects;

public class Ubicacion {

    private Integer codigoPostal;
    private String ciudad;
    private String direccion;

    public Ubicacion() {
    }

    public Ubicacion(Integer codigoPostal, String ciudad, String direccion) {
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }


    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return Objects.equals(codigoPostal, ubicacion.codigoPostal) && Objects.equals(ciudad, ubicacion.ciudad) && Objects.equals(direccion, ubicacion.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoPostal, ciudad, direccion);
    }


    @Override
    public String toString() {
        return "Ubicacion{" +
                "codigoPostal=" + codigoPostal +
                ", ciudad='" + ciudad + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
