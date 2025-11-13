package com.pluralsight;

import javax.swing.*;
import java.util.Scanner;

public class MainApp {
    private static Scanner scanner = new Scanner(System.in);
    private static Order currentOrder = null;

    public static void main(String[] args) {
        System.out.println("*** Welcome to Bria's Heavenly Deli ***");
        System.out.println("Where every bite is written in the stars");

        currentOrder = new Order();


        boolean running = true;


        while (running){
            System.out.println("Main Menu:");
            System.out.println("1) Zodiac Sandwich Menu");
            System.out.println("2) View Current Order");
            System.out.println("3) Checkout");
            System.out.println("0) Cancel order");
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    SignatureSandwich sandwich = selectZodiacSandwich();
                    if (sandwich != null) {
                        currentOrder.addSandwich(sandwich);
                        System.out.println(sandwich.getName() + " added to order!\n");
                    }
                    break;
                case 2:
                    currentOrder.displayOrder();
                    break;
                case 3:
                    checkout();
                    running = false;
                    break;
                case 0:
                    System.out.println("Order canceled \n");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again\n");
            }
            }
        }
        private static SignatureSandwich selectZodiacSandwich() {
            System.out.println("\n Zodiac Sandwiches");
            System.out.println("111) Aries - The Firestarter");
            System.out.println("222) Taurus - The Comfort Fix");
            System.out.println("333) Gemini - The Two-Step");
            System.out.println("444) Cancer - Mama's Hug");
            System.out.println("555) Leo - The Spotlight");
            System.out.println("669) Virgo - The Purist");
            System.out.println("777) Libra - The Balance Beam");
            System.out.println("888) Scorpio - The Deep End");
            System.out.println("999) Sagittarius - The Wanderlust");
            System.out.println("1010) Capricorn - The Boss");
            System.out.println("1111) Aquarius - The Rebel");
            System.out.println("1212) Pisces - The Dreamboat");
            System.out.println("0) Back to Main Menu");
            System.out.println("Select your sign:");

            int selection = scanner.nextInt();
            scanner.nextLine();

            if (selection == 0) return null;

            String zodiacName = "";
            switch (selection) {
                case 111:
                    zodiacName = "Aries";
                    break;
                case 222:
                    zodiacName = "Taurus";
                    break;
                case 333:
                    zodiacName = "Gemini";
                    break;
                case 444:
                    zodiacName = "Cancer";
                    break;
                case 555:
                    zodiacName = "Leo";
                    break;
                case 669:
                    zodiacName = "Virgo";
                    break;
                case 777:
                    zodiacName = "Libra";
                    break;
                case 888:
                    zodiacName = "Scorpio";
                    break;
                case 999:
                    zodiacName = "Sagittarius";
                    break;
                case 1010:
                    zodiacName = "Capricorn";
                    break;
                case 1111:
                    zodiacName = "Aquarius";
                    break;
                case 1212:
                    zodiacName = "Pisces";
                    break;
                default:
                    System.out.println("Invalid choice.\n");
                    return null;
            }

            return new SignatureSandwich(zodiacName);
        }

        private static void checkout() {
        if (currentOrder == null || currentOrder.isEmpty()) {
            System.out.println("\n Your order is empty.\n");
            return;
        }

        currentOrder.displayOrder();
            System.out.println("Confirm order? (yes/no):");
            String confirm = scanner.nextLine().toLowerCase();

            if (confirm.equals("yes")) {
                System.out.println("Order confirmed");
            }else {
                System.out.println("Order canceled.\n");
            }




        }
    }

