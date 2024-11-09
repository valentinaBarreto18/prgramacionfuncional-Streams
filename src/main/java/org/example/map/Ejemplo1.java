package org.example.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo1{
    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("mango", "manzana","durazno");

        List<String> uppercaseNames = frutas.stream()
                .map(String:: toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);

    }
}
