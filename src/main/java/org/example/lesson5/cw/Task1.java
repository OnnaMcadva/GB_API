package org.example.lesson5.cw;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        Map<Character, Integer> mapCh = new TreeMap<>();
        String str = "qweqweasdasdzxczxczxc";
        richMap(mapCh, str);
        for (Map.Entry<Character, Integer> elem : mapCh.entrySet()) {
            System.out.printf("Символ : %s встретился : %d раз(а) \n", elem.getKey(), elem.getValue());
        }
    }

    /**
     * @param mapCh пустая Map
     * @param str входные данные
     * @apiNote Посчитать количество вхождений каждого символа в текст.
     */
    private static void richMap(Map<Character, Integer> mapCh, String str) {
        for (int i = 0; i < str.length(); i++) {   // mapCh.entrySet().iter
            if (mapCh.containsKey(str.charAt(i))) {
                mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
            } else {
                mapCh.put(str.charAt(i), 1);
            }
        }
    }
}

/*
public static void main(String[] args) {
Map<Character, Integer> mapCh = new TreeMap<>();
String str = "qweqweasdasdzxczxczxc";
richMap(mapCh, str);
for (Map.Entry<Character, Integer> elem : mapCh.entrySet()) {
System.out.printf("Символ : %s встретился : %d раз(а) \n", elem.getKey(), elem.getValue());
}
}


* @param mapCh пустая Map
* @param str входные данные
* @apiNote Посчитать количество вхождений каждого символа в текст.

private static void richMap(Map<Character, Integer> mapCh, String str) {
    for (int i = 0; i < str.length(); i++) {
        mapCh.putIfAbsent(str.charAt(i), 0)
        mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
    }
}
public static void main(String[] args) {
    Map<Character, Integer> mapCh = new TreeMap<>();
    String str = "qweqweasdasdzxczxczxc";
    richMap(mapCh, str);
    for (Map.Entry<Character, Integer> elem : mapCh.entrySet()) {
        System.out.printf("Символ : %s встретился : %d раз(а) \n", elem.getKey(), elem.getValue());
    }
}


     * @param mapCh пустая Map
     * @param str входные данные
     * @apiNote Посчитать количество вхождений каждого символа в текст.

    private static void richMap(Map<Character, Integer> mapCh, String str) {
        for (int i = 0; i < str.length(); i++) {
            mapCh.putIfAbsent(str.charAt(i), 0);
            mapCh.put(str.charAt(i), mapCh.get(str.charAt(i)) + 1);
        }
    }
 */
