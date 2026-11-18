package com.mycompany.tp5;

/** Lab 4 - Question 2 : Microwave (TVA 10 %). */
public class Microwave extends Product {
    public static final double VAT = 0.10;

    private String brand;
    private double trayDiameter; // cm
    private double capacity;     // litres
    private int power;           // watts

    public Microwave(String reference, String name, double priceExclTax, int quantity, String description,
                     String brand, double trayDiameter, double capacity, int power) {
        super(reference, name, priceExclTax, quantity, description);
        this.brand = brand;
        this.trayDiameter = trayDiameter;
        this.capacity = capacity;
        this.power = power;
    }

    @Override
    public double priceInclTax() {
        return getPriceExclTax() * (1 + VAT);
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public double getTrayDiameter() { return trayDiameter; }
    public void setTrayDiameter(double trayDiameter) { this.trayDiameter = trayDiameter; }
    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }
    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }

    @Override
    public String toString() {
        return "[MICROWAVE] " + super.toString() + String.format(
                " | Brand: %s | Tray: %.1f cm | Capacity: %.1f L | Power: %d W",
                brand, trayDiameter, capacity, power);
    }
}
