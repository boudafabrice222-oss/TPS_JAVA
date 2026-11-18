package com.mycompany.tp1.exercice4;

import java.util.Scanner;

/** TP1 - Exercice 4 : échange de deux variables (sans variable temporaire). */
public class Echange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        // Échange arithmétique, sans variable temporaire
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Nouvelles valeurs : a = " + a + " , b = " + b);
    }
}
