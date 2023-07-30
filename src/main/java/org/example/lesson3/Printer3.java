package org.example.lesson3;

import java.util.Arrays;
import java.util.ArrayList;

public class Printer3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer3 ans = new Answer3();
        ans.analyzeNumbers(arr);
    }
}