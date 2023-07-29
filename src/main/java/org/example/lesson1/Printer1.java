package org.example.lesson1;


public class Printer1{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            n = 4;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        Answer1 ans = new Answer1();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}
