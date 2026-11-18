package com.mycompany.tp4.exercice4;

import java.util.Scanner;

/** TP4 - Exercice 4 : programme de test. */
public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee(sc);

        System.out.println("\nAvant augmentation :");
        e.displayEmployee();

        e.increaseSalary();
        System.out.println("Après augmentation :");
        e.displayEmployee();
    }
}
