package com.mycompany.tp1.exercice2;

import java.util.Scanner;

/** TP1 - Exercice 2 (A) : lire a et b, échanger leurs valeurs, afficher. */
public class EchangeVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Après échange : a = " + a + " , b = " + b);
    }
}
