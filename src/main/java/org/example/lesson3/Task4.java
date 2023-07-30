package org.example.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Cube> cubes = new ArrayList<>(
                Arrays.asList(
                        new Cube(2, "красный", "металлический"),
                        new Cube(3, "желтый", "деревянный"),
                        new Cube(4, "зеленый", "картонный"),
                        new Cube(3, "желтый", "деревянный"),
                        new Cube(3, "желтый", "деревянный"),
                        new Cube(2, "красный", "деревянный"),
                        new Cube(5, "желтый", "металлический"),
                        new Cube(3, "зеленый", "картонный")));

        int kYellow = 0;
        int sumVolume = 0;
        int kWood = 0;
        for (Cube cube : cubes) {
            if (cube.getColor().equals("желтый")) {
                kYellow++;
                sumVolume += cube.getVolume();
            }
            if (cube.getMaterial().equals("деревянный") && cube.getEdge() == 3) {
                kWood++;
            }
        }
        System.out.println("kYellow = " + kYellow);
        System.out.println("sumVolume = " + sumVolume);
        System.out.println("kWood с ребром 3 см = " + kWood);
        System.out.println("cubes = " + cubes);
        unicCollection(cubes);
        System.out.println("cubes = " + cubes);
    }

    private static void unicCollection(List<org.example.lesson3.Cube> cubes) {
        for (int i = 0; i < cubes.size(); i++) {
            Cube currentCube = cubes.get(i);
            for (int j = i + 1; j < cubes.size(); j++) {
                if (currentCube.equals(cubes.get(j))) {
                    cubes.remove(j);
                    j--;
                }
            }

        }
    }

}
// Напишите метод, который на вход получает коллекцию объектов,
// а возвращает коллекцию уже без дубликатов.