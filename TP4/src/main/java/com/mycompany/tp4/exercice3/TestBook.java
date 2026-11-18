package com.mycompany.tp4.exercice3;

import java.util.Scanner;

/** TP4 - Exercice 3 : programme de test. */
public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book(sc);
        b.display();
    }
}
