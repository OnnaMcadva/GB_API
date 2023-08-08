package org.example.lesson6.cw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 3));
        System.out.println("result = " + getResult(array));
    }

    /**
     * @param array входной массив
     * @return результат
     * @apiNote Дан массив чисел, посчитать процент уникальных чисел.
     */
    private static double getResult(List<Integer> array) {
        return new HashSet<>(array).size() * 100 / array.size();
    }
}

/*
    1) Дан массив чисел, посчитать процент уникальных чисел.
*процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */