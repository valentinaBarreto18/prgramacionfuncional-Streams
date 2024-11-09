package org.example.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Manzana", 2000, "Frutas", true));
        productos.add(new Producto("Pan", 1000, "Panadería", false));
        productos.add(new Producto("Leche", 3500, "Lácteos", true));
        productos.add(new Producto("Queso", 9000, "Lácteos", false));
        productos.add(new Producto("Zanahoria", 2500, "Verduras", true));
        productos.add(new Producto("Yogur", 4500, "Lácteos", true));


        List<Producto> productosEnOferta = productos.stream()
                .filter(Producto::isEnOferta)
                .collect(Collectors.toList());

        System.out.println("Productos en oferta:");
        productosEnOferta.forEach(System.out::println);


        List<Producto> lacteosBaratos = productos.stream()
                .filter(p -> p.getCategoria().equals("Lácteos"))
                .filter(p -> p.getPrecio() < 2.0)
                .collect(Collectors.toList());

        System.out.println("\nLácteos con precio menor a 2.0:");
        lacteosBaratos.forEach(System.out::println);
    }
}
