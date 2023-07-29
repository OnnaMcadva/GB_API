package org.example.lesson2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        int n = scan.nextInt();
        double res = 1.0;
        res = getRes(x, n, res);
        System.out.println("res = " + res);
    }

    /**
     * @apiNote Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
     * @param x osnovanie
     * @param n stepen
     * @param res = x ^ n
     * @return
     */
    private static double getRes(double x, int n, double res) {
        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {

            res = res * x;
        }
        return res;
    }
}