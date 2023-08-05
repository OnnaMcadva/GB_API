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

        HashMap<String, Integer> emploMap = getStringIntegerHashMap(employees);
        Set<Integer> setValues = new HashSet<>(emploMap.values());
        ArrayList<Integer> listValues = new ArrayList<>(setValues);
        Collections.sort(listValues);
        Collections.reverse(listValues);
        extracted(listValues, emploMap);
    }

    /**
     * @apiNote Метод выводит на печать имя, которое встречается больше одного раза, и количество его повторений.
     * @param listValues список целых чисел, в нашем случае от 4 до 1.
     * @param emploMap карта: имя (ключ) и номер от 1 до 4 (значение).
     */
    private static void extracted(ArrayList<Integer> listValues, HashMap<String, Integer> emploMap) {
        for (int listValue : listValues)
            if (listValue != 1) {
                for (String name : emploMap.keySet()) {
                    if (emploMap.get(name) == listValue) {
                        System.out.printf("Имя %s повторяется %d раз(а) \n", name, emploMap.get(name));
                    }
                }
            }
    }

    /**
     * @apiNote Метод записывает в карту из пары имя-фамилия только имя (ключ) и количество повторений (значение).
     * @param employees лист имя-фамилия, из которого берутся данные для карты.
     * @return emploMap карта имя (ключ) - количество повторений (значение).
     */
    private static HashMap<String, Integer> getStringIntegerHashMap(ArrayList<String> employees) {
        HashMap<String, Integer> emploMap = new HashMap<>();
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            emploMap.putIfAbsent(name, 0);
            emploMap.put(name, emploMap.get(name) + 1);
        }
        return emploMap;
    }
}
