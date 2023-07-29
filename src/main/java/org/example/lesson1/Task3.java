package org.example.lesson1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        addElementToArray(scanner, n, array);
        System.out.println("subjectTaskThree(array) = " + subjectTaskThree(array));
        printElementArray(array);
    }

    /**
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param array massiv
     * @apiNote proverka na sim
     */
    private static String subjectTaskThree(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return "non";
            }
        }
        return "sim";
    }

    /**
     * @param array
     */
    private static void printElementArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d \n", i, array[i]);
        }
    }

    /**
     * @param scanner
     * @param n
     */
    private static void addElementToArray(Scanner scanner, int n, int[] array) {

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
    }
}