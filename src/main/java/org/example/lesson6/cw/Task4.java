package org.example.lesson6.cw;

public class Task4 {
        public static void main(String[] args) {
            Converter converter = new Cels();
            double gradus = -273;
            System.out.println("temp Cels = " + converter.convertValue(gradus));
            System.out.println("temp Far = " + new Far().convertValue(gradus));
            System.out.println("temp Kelv = " + new Kelv().convertValue(gradus));
        }
    }


/*
    4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
для валидного перевода величин.
Метод для конвертации назовите "convertValue".
 */
