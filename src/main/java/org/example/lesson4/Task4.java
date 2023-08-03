package org.example.lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>(Arrays.asList(43, 45, 3, 67, 356, 65, 23, 38));
        for (int i = numList.size() - 1; i >= 0; i--) {
            if (numList.get(i) < 0) {
                numList.remove(i);
            }
        }
        System.out.println("numList = " + numList);

         for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) < 0) {
                numList.remove(i);
                i--;
            }
        }
        System.out.println("numList = " + numList);
    }
}

// Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.