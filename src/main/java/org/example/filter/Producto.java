package org.example.filter;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;
    private boolean enOferta;

    public Producto(String nombre, double precio, String categoria, boolean enOferta) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.enOferta = enOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isEnOferta() {
        return enOferta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", enOferta=" + enOferta +
                '}';
    }
}
