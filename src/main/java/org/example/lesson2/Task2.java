package org.example.lesson2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = getSum(scan, n);
        System.out.println("sum = " + sum);
    }

    /**@apiNote Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     * @param scan
     * @param n
     * @return
     * @apiNote
     */
    private static int getSum(Scanner scan, int n) {
        int sum = 0;
        int numOne = scan.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int numTwo = scan.nextInt();
            if (numTwo % 10 == 5 && numOne % 2 == 0) {
                sum += numTwo;
            }
            numOne = numTwo;
        }
        return sum;
    }
}