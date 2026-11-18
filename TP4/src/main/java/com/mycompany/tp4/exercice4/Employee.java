package com.mycompany.tp4.exercice4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/** TP4 - Exercice 4 : classe Employee. */
public class Employee {
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private double salary;

    // Constructeur : valeurs saisies par l'utilisateur
    public Employee(Scanner sc) {
        System.out.print("ID : ");
        this.id = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nom : ");
        this.lastName = sc.nextLine();
        System.out.print("Prénom : ");
        this.firstName = sc.nextLine();
        System.out.print("Date de naissance (jj/mm/aaaa) : ");
        this.birthDate = LocalDate.parse(sc.nextLine().trim(), FMT);
        System.out.print("Date d'embauche (jj/mm/aaaa) : ");
        this.hireDate = LocalDate.parse(sc.nextLine().trim(), FMT);
        System.out.print("Salaire : ");
        this.salary = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
    }

    // Propriétés
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public LocalDate getHireDate() { return hireDate; }
    public void setHireDate(LocalDate hireDate) { this.hireDate = hireDate; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // Âge en années
    public int age() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // Ancienneté en années
    public int seniority() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    // Augmentation selon l'ancienneté
    public void increaseSalary() {
        int s = seniority();
        if (s < 5) {
            salary *= 1.02;
        } else if (s < 10) {
            salary *= 1.05;
        } else {
            salary *= 1.10;
        }
    }

    public void displayEmployee() {
        System.out.println("-----------------------------------");
        System.out.println("ID              : " + id);
        System.out.println("Nom             : " + lastName);
        System.out.println("Prénom          : " + firstName);
        System.out.println("Date naissance  : " + birthDate.format(FMT) + " (" + age() + " ans)");
        System.out.println("Date embauche   : " + hireDate.format(FMT) + " (" + seniority() + " ans d'ancienneté)");
        System.out.printf ("Salaire         : %.2f%n", salary);
        System.out.println("-----------------------------------");
    }
}
