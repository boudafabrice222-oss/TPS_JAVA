package com.mycompany.tp5;

/** Lab 4 - Question 2 : Oven (TVA 5 %). */
public class Oven extends Product {
    public static final double VAT = 0.05;

    private String brand;
    private int power;        // watts
    private int grillPower;   // watts
    private int maxTemperature;
    private int minTemperature;

    public Oven(String reference, String name, double priceExclTax, int quantity, String description,
                String brand, int power, int grillPower, int maxTemperature, int minTemperature) {
        super(reference, name, priceExclTax, quantity, description);
        this.brand = brand;
        this.power = power;
        this.grillPower = grillPower;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    @Override
    public double priceInclTax() {
        return getPriceExclTax() * (1 + VAT);
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public int getPower() { return power; }
    public void setPower(int power) { this.power = power; }
    public int getGrillPower() { return grillPower; }
    public void setGrillPower(int grillPower) { this.grillPower = grillPower; }
    public int getMaxTemperature() { return maxTemperature; }
    public void setMaxTemperature(int maxTemperature) { this.maxTemperature = maxTemperature; }
    public int getMinTemperature() { return minTemperature; }
    public void setMinTemperature(int minTemperature) { this.minTemperature = minTemperature; }

    @Override
    public String toString() {
        return "[OVEN] " + super.toString() + String.format(
                " | Brand: %s | Power: %d W | Grill: %d W | Temp: %d-%d °C",
                brand, power, grillPower, minTemperature, maxTemperature);
    }
}
