package org.example.lesson4;

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    public Deque<Integer> resultsStack = new ArrayDeque<>();
    public Deque<Character> operationsStack = new ArrayDeque<>();
    public int prevResult;

    public int calculate(char op, int a, int b) {
        if (op == '<') {
            if (resultsStack.size() >= 2) {
                resultsStack.pop();
                prevResult = resultsStack.peek();
            }
            return prevResult;
        } else {
            int result = performOperation(op, a, b);
            resultsStack.push(result);
            operationsStack.push(op);
            prevResult = result;
            return result;
        }
    }


    private int performOperation(char op, int a, int b) {
        switch (op) {
            case '+':
                return add(a, b);
            case '-':
                return minus(a, b);
            case '*':
                return mult(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Некорректный оператор: " + op);
        }
    }

    private int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Деление на ноль");
        }
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
}

/*
Мой варик

class Calculator {
            int result;
            Deque<Integer> history = new ArrayDeque<>();

  public int calculate(char op, int a, int b) {


        switch (op) {
            case '+': history.addLast(add(a, b));
            result = add(a, b); return result;
            case '-': history.addLast(minus(a, b));
            result = minus(a, b); return result;
            case '*': history.addLast(mult(a, b));
            result = mult(a, b); return result;
            case '/': history.addLast(divide(a, b));
            result = divide(a, b); return result;
            case '<': history.removeLast(); return history.peekLast();
            default: throw new IllegalArgumentException("Некорректный оператор: " + op);
        }
    }

    private int divide(int a, int b) {
         if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Делим на ноль? Ну-ну!)))");
        }
    }

    private int mult(int a, int b) {
        return a * b; }

    private int minus(int a, int b) {
        return a - b; }

    private int add(int a, int b) {
        return a + b; }

    }

*/