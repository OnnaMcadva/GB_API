package org.example.lesson2;

public class Printer3{
    public static void main(String[] args) {
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";

        if (args.length == 0) {
            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            ELEMENT1 = "Студент ";
            ELEMENT2 = " получил ";
            ELEMENT3 = " по предмету ";
        }
        else{
            JSON = args[0];
            ELEMENT1 = args[1];
            ELEMENT2 = args[2];
            ELEMENT3 = args[3];
        }

        Answer3 ans = new Answer3();
        ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    }
}

