package com.mycompany.tp1.exercice2;

import java.util.Scanner;

/** TP1 - Exercice 2 (B) : périmètre et aire d'un rectangle. */
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Longueur : ");
        double longueur = sc.nextDouble();
        System.out.print("Largeur : ");
        double largeur = sc.nextDouble();

        double perimetre = 2 * (longueur + largeur);
        double aire = longueur * largeur;

        System.out.println("Périmètre = " + perimetre);
        System.out.println("Aire = " + aire);
    }
}
