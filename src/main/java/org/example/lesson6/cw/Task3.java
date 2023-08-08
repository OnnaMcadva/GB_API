package org.example.lesson6.cw;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        List<String> firstList = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x", "v"));
        List<String> secondList = new ArrayList<>(Arrays.asList("qwe", "v"));
        System.out.println("firstList = " + firstList);
        System.out.println("secondList = " + secondList);
        Set<String> resultSet = new HashSet<>(firstList);
        resultSet.retainAll(secondList);
        System.out.println("resultSet = " + resultSet);
        List<String> sumList = new ArrayList<>(firstList);
        sumList.addAll(secondList);
        System.out.println("sumList = " + sumList);
        printResult(resultSet, sumList);
    }

    /**
     * @param resultSet
     * @param sumList
     * @apiNote Найти пересечения слов в массивах и указать их общее количество
     */
    private static void printResult(Set<String> resultSet, List<String> sumList) {
        for (String elem : resultSet) {
            int sum = 0;
            for (String sample : sumList) {
                if (sample.equals(elem)) {
                    sum++;
                }
            }
            System.out.printf("Строка %s содержится %d раз(а)\n", elem, sum);
        }
    }
}
/*
    3) Найти пересечения слов в массивах и указать их общее количество.
Пример:
Mas1= [“qwe”,”asd”,”qwe”,”x”]
Mas2=[“qwe”,”v”]
Результат:
qwe=3

 */