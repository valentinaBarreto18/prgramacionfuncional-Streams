package org.example.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<person> lista = Arrays.asList(new person(2, "Esteban",980000), new person(3,"xiomara", 970000));
        List<person> listatransform = lista.stream()
                .map(person -> {
                    person.setId(person.getId());
                    person.setName(person.getName().toUpperCase());
                    person.setSalary(person.getSalary()*2);
                    return  person;
                }
                )
                .collect(Collectors.toList());
        listatransform.forEach(person -> System.out.println(person.getId() + " "
                + person.getName() + " " + person.getSalary()));

    }
}
