package org.example.lesson5.cw;

import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        Map<Integer, Integer> dubMap = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(7);

        for (int i = 0; i < a.size(); i++) {
            dubMap.put(a.get(i), 1);

        }
        if (dubMap.size() < a.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("dubMap = " + dubMap);
    }
}

// Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
// В противном случае (false).
/*
public static void main(String[] args) {
//2)Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
//В противном случае (false).
Map<Integer, Integer> dubMap = new HashMap<>();
ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 2));

for (int i = 0; i < a.size(); i++) {
dubMap.putIfAbsent(a.get(i), 0);
dubMap.put(a.get(i), dubMap.get(a.get(i)) + 1);
}
dubleArrayMessage(dubMap);
System.out.println("dubMap = " + dubMap);
}

private static void dubleArrayMessage(Map<Integer, Integer> dubMap) {
for (Map.Entry<Integer, Integer> elem : dubMap.entrySet()) {
if (elem.getValue() > 1) {
System.out.println(true);
return;
}
}
System.out.println(false);
}
 */