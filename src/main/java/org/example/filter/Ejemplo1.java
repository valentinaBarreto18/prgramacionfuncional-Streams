package org.example.filter;

import java.util.Arrays;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<Empleado> lista2 = Arrays.asList(
                new Empleado(1075794180,"yair",1200000,"administrador"),
                new Empleado(1201281230, "santiago", 850000, "camarografo"),
                new Empleado(109000268, "tatiana", 980000, "secretaria")
                );

        List<Empleado> eSalarios = lista2.stream()
                .filter(e -> e.getSalario()> 8500000 && e.getNombre().startsWith("J"))
                .toList();
        eSalarios.forEach(p -> System.out.println(p.getNombre() + " " + p.getSalario()));

    }
}
