package com.pluralsight;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class MainApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Order currentOrder = new Order();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();         // holds the available zodiac and signature sandwiches
        Order order = new Order();      // current order

        System.out.println("Welcome to Bria's Heavenly Deli");
        boolean running = true;

        while (running) {
            // Show main choices
            System.out.println();
            System.out.println("Main Menu:");
            System.out.println("1) View Zodiac Menu");
            System.out.println("2) Order a Zodiac Sandwich");
            System.out.println("3) View Signature Menu");
            System.out.println("4) Order a Signature Sandwich");
            System.out.println("5) Add Chips");
            System.out.println("6) Add Drink");
            System.out.println("7) View Current Order");
            System.out.println("8) Checkout and Save Receipt");
            System.out.println("0) Exit");
            System.out.print("Choose an option: ");

            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;
            int choice;
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number (0-8).");
                continue;
            }

            switch (choice) {
                case 1:
                    menu.displayZodiacMenu();
                    break;

                case 2:
                    menu.displayZodiacMenu();
                    System.out.print("Select zodiac number to order (1-12) or 0 to cancel: ");
                    int pickZ = readInt(scanner);
                    if (pickZ == 0) break;
                    Sandwich chosenZ = menu.getZodiacByIndex(pickZ);
                    if (chosenZ != null) {
                        order.addSandwich(chosenZ);
                        System.out.println(chosenZ.getName() + " added to order.");
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;

                case 3:
                    menu.displaySignatureMenu();
                    break;

                case 4:
                    menu.displaySignatureMenu();
                    System.out.print("Select signature number to order or 0 to cancel: ");
                    int pickS = readInt(scanner);
                    if (pickS == 0) break;
                    Sandwich chosenS = menu.getSignatureByIndex(pickS);
                    if (chosenS != null) {
                        order.addSandwich(chosenS);
                        System.out.println(chosenS.getName() + " added to order.");
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;

                case 5:
                    System.out.print("Add how many chips? (enter number): ");
                    int chips = readInt(scanner);
                    for (int i = 0; i < chips; i++) order.addChip();
                    System.out.println("Chips added: " + chips);
                    break;

                case 6:
                    System.out.print("Add how many drinks? (enter number): ");
                    int drinks = readInt(scanner);
                    for (int i = 0; i < drinks; i++) order.addDrink();
                    System.out.println("Drinks added: " + drinks);
                    break;

                case 7:
                    System.out.println(order.toString());
                    break;

                case 8:
                    // Requirement: If order has 0 sandwiches, they must have at least chips or drinks
                    if (order.getItems().isEmpty() && order.getChipsCount() == 0 && order.getDrinksCount() == 0) {
                        System.out.println("Your order has no sandwiches. Please add chips or drinks before checkout.");
                        break;
                    }

                    System.out.println(order.toString());
                    System.out.print("Confirm checkout? (yes/no): ");
                    String confirm = scanner.nextLine().trim().toLowerCase();
                    if (confirm.equals("yes")) {
                        try {
                            String path = Receipt.writeReceipt(order);
                            System.out.println("Order saved to: " + path);
                            // After saving receipt, reset order for a new customer
                            order = new Order();
                        } catch (IOException e) {
                            System.out.println("Error saving receipt: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Checkout canceled.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting. Thank you for using Bria's Heavenly Deli.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 0-8.");
            }
        }

        scanner.close();
    }

    // Helper to read an integer safely from the scanner
    private static int readInt(Scanner scanner) {
        String line = scanner.nextLine().trim();
        if (line.isEmpty()) return 0;
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}