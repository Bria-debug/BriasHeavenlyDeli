package com.pluralsight;

import javax.swing.*;
import java.util.Scanner;

public class MainApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Order currentOrder = new Order();

    public static void main(String[] args) {
        System.out.println("*** Welcome to Bria's Heavenly Deli ***");
        System.out.println("Where every bite is written in the stars");

        boolean running = true;

        while (running){
            System.out.println("\nMain Menu:");
            System.out.println("1) Build Your Own Sandwich");
            System.out.println("2) Order a Zodiac Signature Sandwich");
            System.out.println("3) Add Chips");
            System.out.println("4) Add Drink");
            System.out.println("5) View Current Order");
            System.out.println("6) Checkout");
            System.out.println("0) Exit");
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Sandwich custom = buildYourOwnSandwich();
                    if (custom != null) {
                        currentOrder.addSandwich(custom);
                        System.out.println("Custom sandwich added to order!");
                    }
                    break;
                case 2:
                    SignatureSandwich zodiac = (SignatureSandwich) selectZodiacSandwich();
                    if (zodiac != null){
                        currentOrder.addSandwich(zodiac);
                        System.out.println(zodiac.getName()+"sandwich added to order!");
                    }
                    break;
                case 3:
                    System.out.println("Enter chip flavor:");
                    String flavor = scanner.nextLine();
                    currentOrder.addChips(new Chips(flavor));
                    System.out.println("Chips added.");
                    break;
                case 4:
                    System.out.println("Enter drink size(small/medium/large);");
                    String size = scanner.nextLine();
                    currentOrder.addDrink(new Drink(size));
                    System.out.println("Drink added!");
                    break;
                case 5:
                    currentOrder.displayOrder();
                    break;
                case 6:
                    checkout();
                    running = false;
                    break;
                case 0:
                    System.out.println("Goodbye! Thanks for visiting!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again\n");
            }
            }
        }
        //BUILDS SANDWICH
        private static Sandwich buildYourOwnSandwich() {
            System.out.println("\n--- Build Your Own Sandwich ---");

            //SANDWICH SIZES
            System.out.println("Choose a size (4, 8, or 12):");
            int size = Integer.parseInt(scanner.nextLine());

            //BREAD TYPE
            System.out.println("Choose bread(white, wheat, rye, wrap):");
            String bread = scanner.nextLine().toLowerCase();

            Sandwich sandwich = new Sandwich(size, bread);

            System.out.println("Toasted? (yes/no)");
            sandwich.setToasted(scanner.nextLine().equalsIgnoreCase("yes"));

            //REGULAR TOPPINGS
            System.out.println("Add a regular topping (or type 'done'):");
            String topping = scanner.nextLine();
            while (!topping.equalsIgnoreCase("done")) {
                sandwich.addTopping(new Topping(topping, false, false));
                System.out.println("Add another regular topping (or type 'done'):");
                topping = scanner.nextLine();
            }

            // Premium toppings
            System.out.println("Add a premium topping (or type 'done'):");
            String premium = scanner.nextLine();
            while (!premium.equalsIgnoreCase("done")) {
                sandwich.addTopping(new Topping(premium, true, false));
                System.out.println("Add another premium topping (or type 'done'):");
                premium = scanner.nextLine();
            }

            return sandwich;
        }




    // ------------------------
    // ZODIAC SIGNATURE SANDWICH
    // ------------------------
    private static SignatureSandwich selectZodiacSandwich() {
        System.out.println("\n------- Zodiac Signature Sandwiches ------");
        System.out.println("1) Aries");
        System.out.println("2) Taurus");
        System.out.println("3) Gemini");
        System.out.println("4) Cancer");
        System.out.println("5) Leo");
        System.out.println("6) Virgo");
        System.out.println("7) Libra");
        System.out.println("8) Scorpio");
        System.out.println("9) Sagittarius");
        System.out.println("10) Capricorn");
        System.out.println("11) Aquarius");
        System.out.println("12) Pisces");

        int selection = scanner.nextInt();
        scanner.nextLine();

        if (selection < 1 || selection > 12) {
            System.out.println("Invalid choice.\n");
            return null;
        }

        return new SignatureSandwich(selection);
    }



    // ------------------------
    // CHECKOUT
    // ------------------------
    private static void checkout() {
        if (currentOrder.isEmpty()) {
            System.out.println("\nYour order is empty.\n");
            return;
        }

        currentOrder.displayOrder();

        System.out.println("Confirm order? (yes/no):");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            currentOrder.saveReceipt();
            System.out.println("Order saved! Thank you!");
        } else {
            System.out.println("Order canceled.");
        }
    }
}

