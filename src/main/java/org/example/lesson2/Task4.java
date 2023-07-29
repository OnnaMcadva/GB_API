package org.example.lesson2;

public class Task4 {
    public static void main(String[] args) {
        Vektor vektor = new Vektor(1, 2, 3);
        Vektor vektor2 = new Vektor(4, 5, 6);

        System.out.println("vektor = " + vektor);
        System.out.println("vektor.length() = " + vektor.length());
        System.out.println("vektor2 = " + vektor2);
        System.out.println("vektor.scalProd(vektor2) = " + vektor.scalProd(vektor2));
        System.out.println("vektor.vektProd(vektor2) = " + vektor.vektProd(vektor2));
        System.out.println("vektor.cos(vektor2) = " + vektor.cos(vektor2));
        System.out.println("vektor.sum(vektor2) = " + vektor.sum(vektor2));
        System.out.println("vektor.diff(vektor2) = " + vektor.diff(vektor2));

    }
}

