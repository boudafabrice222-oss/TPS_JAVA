package com.mycompany.tp1.devoir;

import java.util.Random;
import java.util.Scanner;

/** TP1 - Homework : jeu de devinette (nombre entre 1 et 100). */
public class JeuDevinette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = new Random().nextInt(100) + 1; // 1..100
        int tentatives = 0;
        int guess;

        System.out.println("Devinez le nombre entre 1 et 100 !");
        do {
            System.out.print("Votre proposition : ");
            guess = sc.nextInt();
            tentatives++;
            if (guess < secret) {
                System.out.println("Trop petit !");
            } else if (guess > secret) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo ! Trouvé en " + tentatives + " tentative(s).");
            }
        } while (guess != secret);
    }
}
