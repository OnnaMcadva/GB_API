package org.example.lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
            List<Integer> numList = new LinkedList<>(Arrays.asList(43, 45, 3, 67, 356, 65, 23, 38));
            int sum = 0;
            for (int i = 0; i < numList.size(); i++) {
                if (numList.get(i) % 2 != 0) {
                    sum += numList.get(i);
                }
            }
            for (int i = 0; i < numList.size(); i++) {
                if (numList.get(i) % 3 != 0) {
                    numList.set(i, sum);

                }

            }
            System.out.println("numList = " + numList);
        }
    }

// Заменить некратные 3 элементы списка, суммой нечетных элементов.