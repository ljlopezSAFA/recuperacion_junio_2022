package modelos;

import java.util.Objects;

public class Empleado {

    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private TipoEmpleado tipo;
    private Double sueldo;

    public Empleado(int id, String nombre, String apellidos, String dni, TipoEmpleado tipo, Double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tipo = tipo;
        this.sueldo = sueldo;
    }


    public Empleado() {
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public TipoEmpleado getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleado tipo) {
        this.tipo = tipo;
    }


    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellidos, empleado.apellidos) && Objects.equals(dni, empleado.dni) && tipo == empleado.tipo && Objects.equals(sueldo, empleado.sueldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, dni, tipo, sueldo);
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", tipo=" + tipo +
                ", sueldo=" + sueldo +
                '}';
    }
}
