package org.example.lesson6.Notebook;

import javax.swing.*;
import java.util.HashSet;
import java.lang.*;
import java.util.Set;

public class NoteCustomer {

    /**
     * @apiNote Метод фильтрует список всех ноутбуков.
     * @param notebooks список всех ноутбуков.
     * @return notebookFromFilter возвращается список ноутбуков, соответствующий запросу покупателя.
     */
    public static Set<Notebook> filter(Set<Notebook> notebooks) {

        String[] options = {"Windows", "Ubuntu", "Fedora", "Chrome OS", "Solaris"};
        ImageIcon icon = new ImageIcon("src/images/notebook.png");
        ImageIcon iconCat = new ImageIcon("src/images/kotik.png");
        int x = JOptionPane.showOptionDialog(null, "Выбрать из предложенных",
                "Операционнaя система",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, options[1]);
        String ramInput = null;
        String screenSizeInput = null;
        boolean noBlind = false;
        int counter = 0;
        while (!noBlind) {
            ramInput = JOptionPane.showInputDialog(null, "Введите минимальное целое значение [4 - 32]",
                    "Оперативная память", JOptionPane.INFORMATION_MESSAGE);
            if (!isIntNum(ramInput)) {
                counter++;
                if (counter == 2) {
                    JOptionPane.showMessageDialog(null, "Чё такой упорный?", "Не будет тебе ноутбука", JOptionPane.INFORMATION_MESSAGE, iconCat);
                    break;
                }
            } else {
                noBlind = true;
            }
        }
        counter = 0;
        noBlind = false;
        while (!noBlind) {
            screenSizeInput = JOptionPane.showInputDialog(null, "Введите минимальное целое значение [11 - 17]",
                    "Размер экрана", JOptionPane.INFORMATION_MESSAGE);
            if (!isIntNum(screenSizeInput)) {
                counter++;
                if (counter == 2) {
                    JOptionPane.showMessageDialog(null, "Я же говорил!", "Не будет тебе ноутбука", JOptionPane.INFORMATION_MESSAGE, iconCat);
                    break;
                }
            } else {
                noBlind = true;
            }
        }

        int ram = Integer.parseInt(ramInput);
        double screenSize = Double.parseDouble(screenSizeInput);

        Set<Notebook> notebookFromFilter = new HashSet<>();
        for (Notebook notebook : notebooks) {
            if (ram <= notebook.getRam() && options[x].equalsIgnoreCase(notebook.getOs()) && screenSize <= notebook.getScreenSize()) {
                notebookFromFilter.add(new Notebook(notebook.getRam(),
                        notebook.getDrive(),
                        notebook.getScreenSize(),
                        notebook.getBrand(),
                        notebook.getOs(),
                        notebook.getColor()));
            }
        }
        return notebookFromFilter;
    }

    /**
     * @param s символ, введенный в диалоговом окне
     * @return boolen true/false
     * @throws NumberFormatException с этим пока не разобралась
     * @apiNote Является ли введенный символ целым числом
     */
    private static boolean isIntNum(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Некорректный ввод",
                    "АХТУНГ",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}