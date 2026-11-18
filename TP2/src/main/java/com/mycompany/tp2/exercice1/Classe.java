package com.mycompany.tp2.exercice1;

/**
 * TP2 - Exercice 1.
 * Rôle : afficher un polynôme à partir du tableau de coefficients.
 * Pour tab = {1, 7, 0, 4}, le programme affiche :
 *     1 + 7* x^1 + 4* x^3
 * (les termes de coefficient nul, sauf le dernier, sont ignorés).
 */
public class Classe {
    public static void main(String[] args) {
        int[] tab = {1, 7, 0, 4};
        int i;
        System.out.print(tab[0] + " + ");

        for (i = 1; i < tab.length - 1; ++i) {
            if (tab[i] != 0)
                System.out.print(tab[i] + "* x^" + i + " + ");
        }
        System.out.print(tab[i] + "* x^" + i);
    }
}
