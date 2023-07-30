package org.example.lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Item staff1 = new Item("spoon1", "china", 20);
        Item staff2 = new Item("spoon2", "russia", 25);
        Item staff3 = new Item("spoon1", "mordor", 30);
        Item staff4 = new Item("spoon3", "bahrain", 50);

        ArrayList<Item> itemList = new ArrayList<>();

        itemList.add(staff1);
        itemList.add(staff2);
        itemList.add(staff3);
        itemList.add(staff4);

        System.out.println("itemList = " + itemList);

        Scanner scanner = new Scanner(System.in);
        String searchParam = scanner.nextLine();
        ArrayList<String> countryList = getCountryList(itemList, searchParam);
        int sumVolume = getSumVolume(itemList, searchParam, countryList);

        System.out.println("countryList = " + countryList);
        System.out.println("sumVolume = " + sumVolume);
    }

    /**
     * @apiNote страны
     * @param itemList
     * @param searchParam
     * @return
     */
    private static ArrayList<String> getCountryList(ArrayList<Item> itemList, String searchParam) {
        ArrayList<String> result = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getName().equals(searchParam)) {
                result.add(item.getCountry());
            }
        }
        return result;
    }

    /**
     * @apiNote общий объем
     * @param itemList
     * @param searchParam
     * @param countryList
     * @return
     * @apiNote
     */
    private static int getSumVolume(ArrayList<Item> itemList, String searchParam, ArrayList<String> countryList) {
        int sumVolume = 0;
        for (Item item : itemList) {
            if (item.getName().equals(searchParam)) {
                sumVolume += item.getVolume();
            }
        }
        return sumVolume;
    }

}
// Даны сведения об экспортируемых товарах:
// указывается наименование товара, страна, экспортирующая товар, и объем поставляемой партии в штуках.
// Найти страны, которые экспортируют данный (введенный с кл-ы) товар, и общий объем его экспорта.
