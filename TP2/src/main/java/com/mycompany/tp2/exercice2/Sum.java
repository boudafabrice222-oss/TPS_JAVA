package com.mycompany.tp2.exercice2;

/** TP2 - Exercice 2 : somme, produit et moyenne d'un tableau. */
public class Sum {

    public static int sum(int[] tab) {
        int s = 0;
        for (int v : tab) {
            s += v;
        }
        return s;
    }

    public static long product(int[] tab) {
        long p = 1;
        for (int v : tab) {
            p *= v;
        }
        return p;
    }

    public static double average(int[] tab) {
        if (tab.length == 0) return 0;
        return (double) sum(tab) / tab.length;
    }

    public static void main(String[] args) {
        int[] tab = {1, 23, 12, -4, 6, 89, 2};
        System.out.println("Somme = " + sum(tab));
        System.out.println("Produit = " + product(tab));
        System.out.println("Moyenne = " + average(tab));
    }
}
