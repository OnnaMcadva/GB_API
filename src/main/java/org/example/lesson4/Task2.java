package org.example.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>(Arrays.asList(43, 65, 3, 67, 356, 65, 23, 38));
        int sum = 0;
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 0) {
                sum += numList.get(i);
            }
        }
        System.out.println("sum = " + sum);
    }
}

// Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.