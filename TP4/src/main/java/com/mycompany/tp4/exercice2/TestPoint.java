package com.mycompany.tp4.exercice2;

/** TP4 - Exercice 2 : programme de test. */
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println("p1 = (" + p1.getX() + ", " + p1.getY() + ") norme = " + p1.norme());
        System.out.println("p2 = (" + p2.getX() + ", " + p2.getY() + ") norme = " + p2.norme()); // 5.0

        p1.setX(6);
        p1.setY(8);
        System.out.println("p1 modifié = (" + p1.getX() + ", " + p1.getY() + ") norme = " + p1.norme()); // 10.0
    }
}
