package org.example.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

public class Task3 {
    public static void main(String[] args) {

        List<Cube> cubes = new ArrayList<>(
                Arrays.asList(
                        new Cube(2, "красный", "металлический"),
                        new Cube(3, "желтый", "деревянный"),
                        new Cube(4, "зеленый", "картонный"),
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
    }

}
// Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
// его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.).
// Найти:
//- количество кубиков желтого цвета и их суммарный объем;
//- количество деревянных кубиков с ребром 3 см.