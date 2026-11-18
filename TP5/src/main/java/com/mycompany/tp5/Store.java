package com.mycompany.tp5;

import java.util.ArrayList;

/** Lab 4 - Question 3 : classe Store. */
public class Store {
    private final ArrayList<Product> products = new ArrayList<>();

    // 1. Ajouter un produit (référence unique)
    public boolean addProduct(Product p) {
        if (searchByReference(p.getReference()) != null) {
            return false;
        }
        products.add(p);
        return true;
    }

    // 2. Modifier la quantité en stock
    public boolean modifyQuantity(String reference, int newQuantity) {
        Product p = searchByReference(reference);
        if (p == null || newQuantity < 0) {
            return false;
        }
        p.setQuantity(newQuantity);
        return true;
    }

    // 3. Rechercher par référence (null si introuvable)
    public Product searchByReference(String reference) {
        for (Product p : products) {
            if (p.getReference().equalsIgnoreCase(reference)) {
                return p;
            }
        }
        return null;
    }

    // 4. Afficher la liste des produits
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("The store has no products.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
