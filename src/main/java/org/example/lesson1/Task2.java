package org.example.lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String strResult = getString(str);
        System.out.println(strResult);
    }

    /**
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param str
     * @return
     */
    private static String getString(String str) {
        String strOne = str.substring(0, str.length() / 2);
        String strTwo = str.substring(str.length() / 2);
        String strResult = strTwo + strOne;
        return strResult;
    }
}
