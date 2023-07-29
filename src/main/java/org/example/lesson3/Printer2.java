package org.example.lesson3;

import java.util.Arrays;
import java.util.ArrayList;
public class Printer2{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer2 ans = new Answer2();
        ans.removeEvenNumbers(arr);
    }
}

