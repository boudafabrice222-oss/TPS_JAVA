package com.mycompany.tp4.exercice2;

/** TP4 - Exercice 2 : classe Point. */
public class Point {
    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // Distance entre l'origine et le point courant
    public double norme() {
        return Math.sqrt(x * x + y * y);
    }
}
