package org.example.sorted;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Veterinaria {
    private List<Animal> animales;

    public Veterinaria() {
        animales = new ArrayList<>();

        animales.add(new Animal("Reds", "Perro", 2));
        animales.add(new Animal("Michi", "Gato", 3));
        animales.add(new Animal("Diego", "Loro", 4));
        animales.add(new Animal("Toby", "Conejo", 2));
        animales.add(new Animal("Zeus", "Caballo", 5));
    }

    public List<Animal> ordenarPorEdad() {
        return animales.stream()
                .sorted(Comparator.comparingInt(Animal::getEdad))
                .collect(Collectors.toList());
    }

    public List<Animal> ordenarPorNombre() {
        return animales.stream()
                .sorted(Comparator.comparing(Animal::getNombre))
                .collect(Collectors.toList());
    }

    public List<Animal> ordenarPorEspecie() {
        return animales.stream()
                .sorted(Comparator.comparing(Animal::getEspecie))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Veterinaria veterinaria = new Veterinaria();

        System.out.println("Animales ordenados por edad:");
        veterinaria.ordenarPorEdad().forEach(System.out::println);

        System.out.println("\nAnimales ordenados por nombre:");
        veterinaria.ordenarPorNombre().forEach(System.out::println);

        System.out.println("\nAnimales ordenados por especie:");
        veterinaria.ordenarPorEspecie().forEach(System.out::println);

    }
}

