package com.mycompany.tp5;

import java.util.Scanner;

/** Lab 4 - Question 4 : classe Main avec menu. */
public class Main {
    private static final Scanner sc = new Scanner(System.in);

    private static int readInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: enter an integer.");
            }
        }
    }

    private static double readDouble(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: enter a number.");
            }
        }
    }

    private static String readString(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }

    private static Product readProduct() {
        int type;
        do {
            type = readInt("Type (1 = Oven, 2 = Microwave): ");
        } while (type != 1 && type != 2);

        String ref = readString("Reference: ");
        String name = readString("Name: ");
        double price = readDouble("Sales price (excl. tax): ");
        int qty = readInt("Quantity in stock: ");
        String desc = readString("Description (leave empty for default): ");
        String brand = readString("Brand: ");

        if (type == 1) {
            int power = readInt("Power (W): ");
            int grill = readInt("Grill power (W): ");
            int tMax = readInt("Maximum temperature: ");
            int tMin = readInt("Minimum temperature: ");
            return new Oven(ref, name, price, qty, desc, brand, power, grill, tMax, tMin);
        } else {
            double tray = readDouble("Tray diameter (cm): ");
            double cap = readDouble("Capacity (L): ");
            int power = readInt("Power (W): ");
            return new Microwave(ref, name, price, qty, desc, brand, tray, cap, power);
        }
    }

    private static void printMenu() {
        System.out.println("\n===== APPLIANCE STORE =====");
        System.out.println("1. Create a store");
        System.out.println("2. Add a product");
        System.out.println("3. Modify the quantity of a product");
        System.out.println("4. Display the list of products");
        System.out.println("5. Search for a product by reference");
        System.out.println("6. Exit the program");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Store store = null;
        int choice;
        do {
            printMenu();
            choice = readInt("Your choice: ");

            if (choice >= 2 && choice <= 5 && store == null) {
                System.out.println("Please create a store first (option 1).");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    store = new Store();
                    System.out.println("Store created.");
                }
                case 2 -> {
                    Product p = readProduct();
                    System.out.println(store.addProduct(p) ? "Product added."
                            : "A product with this reference already exists.");
                }
                case 3 -> {
                    String ref = readString("Reference: ");
                    int qty = readInt("New quantity: ");
                    System.out.println(store.modifyQuantity(ref, qty) ? "Quantity updated."
                            : "Product not found or invalid quantity.");
                }
                case 4 -> store.displayProducts();
                case 5 -> {
                    Product p = store.searchByReference(readString("Reference: "));
                    System.out.println(p != null ? p : "Product not found.");
                }
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
