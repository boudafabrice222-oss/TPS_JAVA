package com.mycompany.tp4.exercice1;

import java.util.ArrayList;

/** TP4 - Exercice 1 / Question 2 : gestionnaire de personnes. */
public class gestionnaire_Personne {
    // Structure dynamique
    private final ArrayList<Personne> personnes = new ArrayList<>();

    public void ajouter(Personne p) {
        personnes.add(p);
    }

    public void afficherListe() {
        if (personnes.isEmpty()) {
            System.out.println("Aucune personne.");
            return;
        }
        for (Personne p : personnes) {
            p.afficher();
        }
    }
}
