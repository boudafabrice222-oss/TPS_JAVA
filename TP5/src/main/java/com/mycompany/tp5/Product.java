package com.mycompany.tp5;

/** Lab 4 - Question 1 : classe de base Product. */
public abstract class Product {
    private String reference;
    private String name;
    private double priceExclTax;
    private int quantity;
    private String description;

    public Product(String reference, String name, double priceExclTax, int quantity, String description) {
        this.reference = reference;
        this.name = name;
        this.priceExclTax = priceExclTax;
        this.quantity = quantity;
        this.description = (description == null || description.isBlank()) ? "No description" : description;
    }

    // Constructeur sans description -> valeur par défaut
    public Product(String reference, String name, double priceExclTax, int quantity) {
        this(reference, name, priceExclTax, quantity, "No description");
    }

    // Méthode abstraite : prix TTC (implémentée par les sous-classes)
    public abstract double priceInclTax();

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPriceExclTax() { return priceExclTax; }
    public void setPriceExclTax(double priceExclTax) { this.priceExclTax = priceExclTax; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = (description == null || description.isBlank()) ? "No description" : description;
    }

    @Override
    public String toString() {
        return String.format("Ref: %s | Name: %s | Price (excl. tax): %.2f | Price (incl. tax): %.2f | Stock: %d | %s",
                reference, name, priceExclTax, priceInclTax(), quantity, description);
    }
}
