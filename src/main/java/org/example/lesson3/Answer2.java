package org.example.lesson3;

import java.util.Arrays;
import java.util.ArrayList;

class Answer2 {
    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 == 0) {
                ints.remove(i);
                i--;
            }
        }
        System.out.println(ints);
    }
}