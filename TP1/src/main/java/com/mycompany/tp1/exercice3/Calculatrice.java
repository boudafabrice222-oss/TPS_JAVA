package com.mycompany.tp1.exercice3;

import java.util.Scanner;

/** TP1 - Exercice 3 : mini calculatrice. */
public class Calculatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Good evening------");
        System.out.print("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Please enter the second number: ");
        int b = sc.nextInt();

        System.out.println("--------Calculate--------");
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        if (b != 0) {
            System.out.println(a + "/" + b + "=" + (a / b)); // division entière
        } else {
            System.out.println(a + "/" + b + "= division par zéro impossible");
        }
        System.out.println("-------Bye-------");
    }
}
