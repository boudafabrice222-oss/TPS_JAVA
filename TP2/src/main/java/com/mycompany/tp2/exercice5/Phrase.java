package com.mycompany.tp2.exercice5;

import java.util.Scanner;

/**
 * TP2 - Exercice 5 : nombre de mots et taille du plus long mot.
 * Les mots sont séparés par un espace et la phrase se termine par un point.
 */
public class Phrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase (terminée par un point) : ");
        String phrase = sc.nextLine();

        int nbMots = 0;
        int longueurCourante = 0;
        int plusLong = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c == ' ' || c == '.') {
                if (longueurCourante > 0) {
                    nbMots++;
                    if (longueurCourante > plusLong) plusLong = longueurCourante;
                    longueurCourante = 0;
                }
                if (c == '.') break;
            } else {
                longueurCourante++;
            }
        }
        // cas où la phrase ne se termine pas par un point
        if (longueurCourante > 0) {
            nbMots++;
            if (longueurCourante > plusLong) plusLong = longueurCourante;
        }

        System.out.println("Nombre de mots : " + nbMots);
        System.out.println("Taille du plus long mot : " + plusLong);
    }
}
