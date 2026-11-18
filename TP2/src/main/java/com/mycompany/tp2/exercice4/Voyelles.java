package com.mycompany.tp2.exercice4;

import java.util.Scanner;

/** TP2 - Exercice 4 : nombre d'occurrences de chaque voyelle dans un mot. */
public class Voyelles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un mot ou une phrase : ");
        String mot = sc.nextLine().toLowerCase();

        char[] voyelles = {'a', 'e', 'i', 'o', 'u'};
        int[] compteurs = new int[voyelles.length];

        for (int i = 0; i < mot.length(); i++) {
            char c = mot.charAt(i);
            for (int j = 0; j < voyelles.length; j++) {
                if (c == voyelles[j]) {
                    compteurs[j]++;
                }
            }
        }

        for (int j = 0; j < voyelles.length; j++) {
            if (compteurs[j] > 0) {
                System.out.println("The vowel \"" + voyelles[j] + "\" appears "
                        + compteurs[j] + (compteurs[j] == 1 ? " time" : " times"));
            }
        }
    }
}
