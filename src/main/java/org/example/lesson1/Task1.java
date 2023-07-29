package org.example.lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = getK(scanner, n);
        System.out.println(k);
    }

    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
     * @param scanner чтение из терминала
     * @param n количество чисел в последовательности
     * @return k количество искомых чисел
     */
    private static int getK(Scanner scanner, int n) {
        int k = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;

        }
        return k;
    }
}
