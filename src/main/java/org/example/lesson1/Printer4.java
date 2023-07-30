package org.example.lesson1;


public class Printer4{
    public static void main(String[] args) {
        String file = "";

        if (args.length == 0) {
            file = "input1.txt";
        }
        else{
            file = args[0];
        }

        Equation eq = new Equation();
        String result = eq.getSolution(file);
        System.out.println(result);
    }
}

