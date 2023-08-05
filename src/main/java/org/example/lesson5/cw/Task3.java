package org.example.lesson5.cw;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<Character, Integer> rimToArabic = new HashMap<>();
        rimToArabic.put('I', 1);
        rimToArabic.put('V', 5);
        rimToArabic.put('X', 10);
        rimToArabic.put('L', 50);
        rimToArabic.put('C', 100);
        rimToArabic.put('D', 500);
        rimToArabic.put('M', 1000);

        String s = "MCMXCIV";
        int result = rimToArabic.get(s.charAt(s.length()-1));
        for (int i = 0; i < s.length()-1; i++) {
            if (rimToArabic.get(s.charAt(i)) >= rimToArabic.get(s.charAt(i + 1))) {
                result += rimToArabic.get(s.charAt(i));
            } else {
                result -= rimToArabic.get(s.charAt(i));
            }
        }
        System.out.println("result = " + result);
    }
}

// Написать перевод из Римских цифр в арабские
// 1) ввод: s = "LVIII"
// вывод: 58
// разбор: L = 50, V= 5, III = 3.
// 2) ввод: s = "MCMXCIV"
// вывод: 1994
// разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
