package org.example.lesson5.hw;

import java.util.*;


public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>(Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"));

        HashMap<String, Integer> emploMap = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            emploMap.putIfAbsent(name, 0);
            emploMap.put(name, emploMap.get(name) + 1);
        }

        Set<Integer> setValues = new HashSet<>(emploMap.values());
        ArrayList<Integer> listValues = new ArrayList<>(setValues);
        Collections.sort(listValues);
        Collections.reverse(listValues);

        for (int listValue : listValues)
            if (listValue != 1) {
                for (String name : emploMap.keySet()) {
                    if (emploMap.get(name) == listValue) {
                        System.out.printf("Имя %s повторяется %d раз(а) \n", name, emploMap.get(name));
                    }
                }
            }
    }
}
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.