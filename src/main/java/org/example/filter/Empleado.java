package org.example.filter;

public class Empleado {
    private int id;
    private String nombre;
    private int salario;
    private String puesto;

    public Empleado(int id, String nombre, int salario, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
