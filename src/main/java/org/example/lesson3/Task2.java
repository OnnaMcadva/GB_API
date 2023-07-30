package org.example.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class Task2 {
    public static void main(String[] args) {
        Student stud1 = new Student("Иванова", 3, 25, List.of(2, 4, 2));
        Student stud2 = new Student("Шпак", 2, 27, List.of(1, 3, 5));
        Student stud3 = new Student("Петрова", 2, 32, List.of(3, 4, 2));
        Student stud4 = new Student("Швейк", 3, 24, List.of(4, 4, 4));
        Student stud5 = new Student("Сидорова", 1, 22, List.of(3, 2, 3));

        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);

        for (Student student : students) {
            if (student.getName().endsWith("ова") && markSumEven(student.getMarks())) {

                System.out.println("student.getScholarship() = " + student.getScholarship());
            }
        }
    }
    /**
     * @apiNote
     * @param marks
     * @return
     */
    private static boolean markSumEven(List<Integer> marks) {
        int sum = 0;
        for (Integer mark : marks) {
            sum = sum + mark;
        }

        return sum % 2 == 0;
    }

}

// Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
// Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.