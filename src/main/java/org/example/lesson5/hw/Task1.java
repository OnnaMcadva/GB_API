package org.example.lesson5.hw;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String string = "Россия идет впереди всей планеты. Планета — это не Россия.";
        String[] words = string.toLowerCase().split("\\PL+");
        Map<String, Integer> mapWord = new TreeMap<>();
        extracted(words, mapWord);
        for (Map.Entry<String, Integer> elem : mapWord.entrySet()) {
            System.out.printf("Слово \"%s\" встретилось %d раз(а) \n", elem.getKey(), elem.getValue());
        }
    }

    /**
     * @apiNote Метод отсекает окончания у слов длиннее 6 букв
     * и записывает в карту слово (ключ) + количество вхождений (значение).
     * @param words массив слов, вырезанных из данной строки.
     * @param mapWord карта, в которую идет запись данных.
     */
    private static void extracted(String[] words, Map<String, Integer> mapWord) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 6) {
                words[i] = words[i].substring(0, 6);
            }
            mapWord.putIfAbsent(words[i], 0);
            mapWord.put(words[i], mapWord.get(words[i]) + 1);
        }
    }
}

