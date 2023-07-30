package org.example.lesson1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
class Equation {
    public static String getSolution(String str) {
        // Читаем выражение из файла input1.txt
        String inputString = getDataFromFile(str);
        System.out.println("Given the equation: " + inputString);

        // Формируем список. Разделитель - пробел, "+" и "=" исключаем
        ArrayList<String> list = new ArrayList<>(List.of(inputString.split(" ")));
        list.remove("+");
        list.remove("=");


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Заменяем "?" в цикле от 0 до 9, сравниваем с результатом выражения
                int x = Integer.parseInt(list.get(0).replace("?", String.valueOf(i)));
                int y = Integer.parseInt(list.get(1).replace("?", String.valueOf(j)));
                if (x + y == Integer.parseInt(list.get(2))) {
                    // Решение найдено, формируем строку ответа
                    return String.format("Result: %d + %d = %d", x, y, Integer.parseInt(list.get(2)));
                }
            }
        }
        // Иначе решения нет
        return "No solution";
    }


    public static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return "";
        }
    }
}