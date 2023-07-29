package org.example.lesson2;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1] * 2) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
/**
 * @apiNote Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
 */