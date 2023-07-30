package org.example.lesson3;

import java.util.Arrays;
import java.util.ArrayList;

class Answer3 {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        ints.sort(Integer::compareTo); // сортировка списка по возрастанию
        System.out.println(ints); // вывод списка на экран
        System.out.println("Minimum is " + ints.get(0)); // нахождение минимального значения в списке и вывод на экран
        System.out.println("Maximum is " + ints.get(ints.size()-1)); // нахождение максимального значения в списке и вывод на экран

        int sum = 0;
        for(int i : ints){ // вычисление суммы всех элементов списка
            sum += i;
        }
        System.out.println("Average is = " + sum / ints.size()); // вычисление среднего арифметического значений списка и вывод на экран
    }
}