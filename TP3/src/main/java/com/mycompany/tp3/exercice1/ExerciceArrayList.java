package com.mycompany.tp3.exercice1;

import java.util.ArrayList;

/** TP3 - Exercice 1 : ArrayList. */
public class ExerciceArrayList {
    public static void main(String[] args) {
        // 1. Création
        ArrayList<Integer> notes = new ArrayList<>();

        // 2. Ajout
        notes.add(12);
        notes.add(15);
        notes.add(9);
        notes.add(17);
        notes.add(14);

        // 3. Affichage des notes
        System.out.println("Notes : " + notes);

        // 4. Nombre de notes
        System.out.println("Nombre de notes : " + notes.size());

        // 5. Remplacer la 3e note par 11
        notes.set(2, 11);
        System.out.println("Après remplacement : " + notes); // [12, 15, 11, 17, 14]

        // 6. Supprimer la première note
        notes.remove(0);
        System.out.println("Après suppression : " + notes);  // [15, 11, 17, 14]

        // 7. Liste finale
        System.out.println("Liste finale : " + notes);
    }
}
