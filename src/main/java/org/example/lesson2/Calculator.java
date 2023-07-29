package org.example.lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Calculator {
    public int calculate(char op, int a, int b) {
        try (FileWriter fileWriter = new FileWriter(new File("log.txt"), true)) {
            logStep(fileWriter, "User entered the first operand = " + a);
            logStep(fileWriter, "User entered the operation = " + op);
            logStep(fileWriter, "User entered the second operand = " + b);

            switch (op) {
                case '+':
                    int sum = add(a, b);
                    logStep(fileWriter, "Result is " + sum);
                    return sum;
                case '-':
                    int diff = minus(a, b);
                    logStep(fileWriter, "Result is " + diff);
                    return diff;
                case '*':
                    int prod = mult(a, b);
                    logStep(fileWriter, "Result is " + prod);
                    return prod;
                case '/':
                    int quotient = divide(a, b);
                    logStep(fileWriter, "Result is " + quotient);
                    return quotient;
                default:
                    throw new IllegalArgumentException("Некорректный оператор: " + op);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private int divide(int a, int b) {
        if (b != 0) return a / b;
        throw new ArithmeticException("Деление на 0 недопустимо");
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private void logStep(FileWriter fileWriter, String note) throws IOException {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedTime = currentTime.format(formatter);
        fileWriter.write(formattedTime + " " + note + "\n");
    }

}