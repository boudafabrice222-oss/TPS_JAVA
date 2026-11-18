package com.mycompany.tp3.exercice5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import java.util.Scanner;

/** TP3 - Exercice 5 : gestion d'étudiants (ArrayList + Vector + HashMap). */
public class GestionEtudiants {

    private static final Scanner sc = new Scanner(System.in);

    // ---------- Saisies sécurisées ----------
    private static int lireInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide : entrez un entier.");
            }
        }
    }

    private static double lireDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide : entrez un nombre.");
            }
        }
    }

    // ---------- Méthodes demandées ----------
    public static void addStudent(ArrayList<String> names,
                                  Vector<Integer> ages,
                                  HashMap<String, Double> averages) {
        System.out.print("Nom : ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Le nom ne peut pas être vide.");
            return;
        }
        if (names.contains(name)) {
            System.out.println("Cet étudiant existe déjà.");
            return;
        }
        int age = lireInt("Âge : ");
        double avg = lireDouble("Moyenne : ");

        // Les trois collections restent cohérentes
        names.add(name);
        ages.add(age);
        averages.put(name, avg);
        System.out.println("Étudiant ajouté.");
    }

    public static void displayStudents(ArrayList<String> names,
                                       Vector<Integer> ages,
                                       HashMap<String, Double> averages) {
        if (names.isEmpty()) {
            System.out.println("Aucun étudiant.");
            return;
        }
        System.out.printf("%-20s %-6s %-8s%n", "Nom", "Âge", "Moyenne");
        for (int i = 0; i < names.size(); i++) {
            String n = names.get(i);
            System.out.printf("%-20s %-6d %-8.2f%n", n, ages.get(i), averages.get(n));
        }
    }

    public static double calculateOverallAverage(HashMap<String, Double> averages) {
        if (averages.isEmpty()) {
            return 0; // collection vide
        }
        double total = 0;
        for (double v : averages.values()) {
            total += v;
        }
        return total / averages.size();
    }

    // ---------- Méthodes supplémentaires ----------
    public static void searchStudent(ArrayList<String> names,
                                     Vector<Integer> ages,
                                     HashMap<String, Double> averages) {
        System.out.print("Nom recherché : ");
        String name = sc.nextLine().trim();
        int index = names.indexOf(name);
        if (index == -1) {
            System.out.println("Étudiant introuvable.");
        } else {
            System.out.println("Trouvé : " + name + " | âge " + ages.get(index)
                    + " | moyenne " + averages.get(name));
        }
    }

    public static void updateAverage(ArrayList<String> names,
                                     HashMap<String, Double> averages) {
        System.out.print("Nom de l'étudiant : ");
        String name = sc.nextLine().trim();
        if (!names.contains(name)) {
            System.out.println("Étudiant introuvable.");
            return;
        }
        double avg = lireDouble("Nouvelle moyenne : ");
        averages.put(name, avg);
        System.out.println("Moyenne mise à jour.");
    }

    public static void deleteStudent(ArrayList<String> names,
                                     Vector<Integer> ages,
                                     HashMap<String, Double> averages) {
        System.out.print("Nom à supprimer : ");
        String name = sc.nextLine().trim();
        int index = names.indexOf(name);
        if (index == -1) {
            System.out.println("Étudiant introuvable.");
            return;
        }
        names.remove(index);
        ages.remove(index);       // remove(int) : même index que names
        averages.remove(name);
        System.out.println("Étudiant supprimé.");
    }

    private static void afficherMenu() {
        System.out.println("\n========== STUDENT MANAGEMENT ==========");
        System.out.println("1. Add a student");
        System.out.println("2. Display students");
        System.out.println("3. Search for a student");
        System.out.println("4. Update an average");
        System.out.println("5. Delete a student");
        System.out.println("6. Display overall average");
        System.out.println("0. Exit");
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Vector<Integer> ages = new Vector<>();
        HashMap<String, Double> averages = new HashMap<>();

        int choix;
        do {
            afficherMenu();
            choix = lireInt("Votre choix : ");
            switch (choix) {
                case 1 -> addStudent(names, ages, averages);
                case 2 -> displayStudents(names, ages, averages);
                case 3 -> searchStudent(names, ages, averages);
                case 4 -> updateAverage(names, averages);
                case 5 -> deleteStudent(names, ages, averages);
                case 6 -> {
                    if (averages.isEmpty()) {
                        System.out.println("Aucun étudiant : moyenne générale indisponible.");
                    } else {
                        System.out.printf("Moyenne générale : %.2f%n", calculateOverallAverage(averages));
                    }
                }
                case 0 -> System.out.println("Au revoir !");
                default -> System.out.println("Choix invalide.");
            }
        } while (choix != 0);
    }
}
