package com.mycompany.tp4.exercice3;

import java.util.Scanner;

/** TP4 - Exercice 3 : classe Book. */
public class Book {
    private String title;
    private String author;   // nom complet
    private double price;

    // Constructeur : initialise les attributs avec des valeurs saisies par l'utilisateur
    public Book(Scanner sc) {
        System.out.print("Titre : ");
        this.title = sc.nextLine();
        System.out.print("Auteur (nom complet) : ");
        this.author = sc.nextLine();
        System.out.print("Prix : ");
        this.price = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
    }

    // Propriétés (getters / setters)
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void display() {
        System.out.println("Titre : " + title + " | Auteur : " + author + " | Prix : " + price);
    }
}
