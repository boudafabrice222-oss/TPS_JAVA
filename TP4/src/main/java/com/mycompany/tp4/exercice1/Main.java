package com.mycompany.tp4.exercice1;

/** TP4 - Exercice 1 / Question 3 : créer un gestionnaire, ajouter 10 personnes, afficher. */
public class Main {
    public static void main(String[] args) {
        gestionnaire_Personne g = new gestionnaire_Personne();

        for (int i = 1; i <= 10; i++) {
            g.ajouter(new Personne(i, "Nom" + i, "Prenom" + i, 10000000L + i, 100f * i));
        }

        g.afficherListe();
    }
}
