package org.example.lesson6.Notebook;

import javax.swing.*;
import java.util.*;
import java.lang.*;
import static org.example.lesson6.Notebook.NoteCatalog.totalNotebook;

public class Main {
    public static void main(String[] args) {
        String[] choice = {"посмотреть весь ассортимент", "задать критерии поиска", "выйти и подумать еще"};
        ImageIcon icon = new ImageIcon("src/images/notebook.png");
        String n = (String)JOptionPane.showInputDialog(null, "Выберите одну из возможностей",
                "Добро пожаловать в магазин ноутбуков", JOptionPane.QUESTION_MESSAGE, icon, choice, choice[1]);

        Set<Notebook> notebooks = NoteCatalog.fill();

        switch (n) {
            case ("выйти и подумать еще"):
                JOptionPane.showMessageDialog(null,"Магазин ноутбуков ждет вас снова", "Досвидосики", JOptionPane.INFORMATION_MESSAGE, icon);
                break;
            case ("посмотреть весь ассортимент"):
                System.out.println("Ноутбуки в наличии: ");
                notebookPrint(notebooks);
                System.out.printf("Найдено %d из %d ноутбуков\n", totalNotebook, totalNotebook);
                break;
            case ("задать критерии поиска"):
                Set<Notebook> notebookFromFilter = NoteCustomer.filter(notebooks);
                int counter = notebookFromFilter.size();
                if (counter == 0) {
                    System.out.println("Не найдено ни одного ноутбука");
                } else {
                    notebookPrint(notebookFromFilter);
                    System.out.printf("Найдено %d из %d ноутбуков\n", counter, totalNotebook);
                }
                break;
        }
    }

    /**
     * @apiNote печатает список ноутбуков с параметрами
     * @param notebooks список ноутбуков
     */
    private static void notebookPrint(Set<Notebook> notebooks) {
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
    }
}