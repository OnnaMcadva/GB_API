package org.example.lesson6.Notebook;

import java.util.*;
import java.lang.*;

public class NoteCatalog {
    static Random randNumber = new Random();
    static String[] arrRam = {"4", "8", "12", "16", "32"};
    static String[] arrDrive = {"SSD", "HDD"};
    static String[] arrScreenSize = {"11.6", "13.0", "14.0", "15.6", "17.0"};
    static String[] arrBrand = {"Sony", "Lenovo", "Fujitsu", "HP", "Toshiba"};
    static String[] arrOs = {"Windows", "Ubuntu", "Fedora", "Chrome OS", "Solaris"};
    static String[] arrColor = {"black", "white", "red", "silver", "gold"};
    static int scroll2 = 2;
    static int scroll5 = 5;
    static int totalNotebook = 170;

    /**
     * @apiNote Создает список из 170 ноутбуков, которые условно есть в условном магазине.
     * @return notebookSet собственно, список.
     */
    public static Set<Notebook> fill() {
        Set<Notebook> notebookSet = new HashSet<>();
        for (int i = 1; i <= totalNotebook; i++) {
            notebookSet.add(new Notebook(Integer.parseInt(arrRam[randNumber.nextInt(scroll5)]),
                    arrDrive[randNumber.nextInt(scroll2)],
                    Double.parseDouble(arrScreenSize[randNumber.nextInt(scroll5)]),
                    arrBrand[randNumber.nextInt(scroll5)],
                    arrOs[randNumber.nextInt(scroll5)],
                    arrColor[randNumber.nextInt(scroll5)]));
        }
        return notebookSet;
    }

}