package com.mycompany.tp3.exercice2;

import java.util.Vector;

/** TP3 - Exercice 2 : Vector et méthodes statiques. */
public class ExerciceVector {

    public static double findHighestTemperature(Vector<Double> temps) {
        double max = temps.get(0);
        for (double t : temps) {
            if (t > max) max = t;
        }
        return max;
    }

    public static double findLowestTemperature(Vector<Double> temps) {
        double min = temps.get(0);
        for (double t : temps) {
            if (t < min) min = t;
        }
        return min;
    }

    public static int countAbove24(Vector<Double> temps) {
        int count = 0;
        for (double t : temps) {
            if (t > 24) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Vector<Double> temperatures = new Vector<>();
        temperatures.add(22.5);
        temperatures.add(25.0);
        temperatures.add(19.5);
        temperatures.add(28.0);
        temperatures.add(24.5);

        for (double t : temperatures) {
            System.out.println("Température : " + t);
        }

        System.out.println("Maximum = " + findHighestTemperature(temperatures)); // 28.0
        System.out.println("Minimum = " + findLowestTemperature(temperatures));   // 19.5
        System.out.println("Above 24 = " + countAbove24(temperatures));          // 3
    }
}
