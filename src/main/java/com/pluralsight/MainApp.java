package com.pluralsight;

import java.util.Scanner;

public class MainApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** Welcome to Bria's Heavenly Deli ***");
        System.out.println("Where every bite is written in the stars");

        boolean running = true;

        while (running){
            System.out.println("Main Menu:");
            System.out.println("1) View Zodiac Sandwich Menu");
            System.out.println("0) Exit");
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    showZodiacMenu();
                    break;
                case 0:
                    System.out.println("Thank you for visiting!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, try again. \n");
            }
        }
        private static void showZodiacMenu() {
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

            String zodiacName = "";
            switch (selection){
                case 111: zodiacName = "Aries"; break;
                case 222: zodiacName = "Taurus"; break;
                case 333: zodiacName = "Gemini"; break;
                case 444: zodiacName = "Cancer"; break;
                case 555: zodiacName = "Leo"; break;
                case 669: zodiacName = "Virgo"; break;
                case 777: zodiacName = "Libra"; break;
                case 888: zodiacName = "Scorpio"; break;
                case 999: zodiacName = "Sagittarius"; break;
                case 1010: zodiacName = "Capricorn"; break;
                case 1111: zodiacName = "Aquarius"; break;
                case 1212: zodiacName = "Pisces"; break;
                case 0:
                    System.out.println();
                    return;
                default:
                    System.out.println("Invalid choice.\n");
                    return;
            }

            SignatureSandwich sandwich = new SignatureSandwich(zodiacName);
            System.out.println("\n Here's your celestial creation:\n");
            System.out.println(sandwich);
            System.out.println("-------------------------------------------\n");

        }
    }
}
