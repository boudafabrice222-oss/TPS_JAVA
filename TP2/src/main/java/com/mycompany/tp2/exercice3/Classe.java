package com.mycompany.tp2.exercice3;

/** TP2 - Exercice 3 : afficher une chaîne caractère par caractère. */
public class Classe {
    public static void main(String[] args) {
        String s = "ESEN";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
