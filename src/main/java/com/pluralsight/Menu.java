package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores available Zodiac and Signature sandwiches.
 */
public class Menu {

    private List<Sandwich> zodiacMenu;
    private List<Sandwich> signatureMenu;

    public Menu() {
        zodiacMenu = new ArrayList<>();
        signatureMenu = new ArrayList<>();

        // Preload Zodiac sandwiches
        zodiacMenu.add(new ZodiacSandwich("Aries"));
        zodiacMenu.add(new ZodiacSandwich("Taurus"));
        zodiacMenu.add(new ZodiacSandwich("Gemini"));
        zodiacMenu.add(new ZodiacSandwich("Cancer"));
        zodiacMenu.add(new ZodiacSandwich("Leo"));
        zodiacMenu.add(new ZodiacSandwich("Virgo"));
        zodiacMenu.add(new ZodiacSandwich("Libra"));
        zodiacMenu.add(new ZodiacSandwich("Scorpio"));
        zodiacMenu.add(new ZodiacSandwich("Sagittarius"));
        zodiacMenu.add(new ZodiacSandwich("Capricorn"));
        zodiacMenu.add(new ZodiacSandwich("Aquarius"));
        zodiacMenu.add(new ZodiacSandwich("Pisces"));

        // Preload Signature sandwiches
        signatureMenu.add(new SignatureSandwich("Aries"));
        signatureMenu.add(new SignatureSandwich("Taurus"));
        signatureMenu.add(new SignatureSandwich("Gemini"));
        signatureMenu.add(new SignatureSandwich("Cancer"));
        signatureMenu.add(new SignatureSandwich("Leo"));
        signatureMenu.add(new SignatureSandwich("Virgo"));
        signatureMenu.add(new SignatureSandwich("Libra"));
        signatureMenu.add(new SignatureSandwich("Scorpio"));
        signatureMenu.add(new SignatureSandwich("Sagittarius"));
        signatureMenu.add(new SignatureSandwich("Capricorn"));
        signatureMenu.add(new SignatureSandwich("Aquarius"));
        signatureMenu.add(new SignatureSandwich("Pisces"));
    }

    // ---------------------------
    // Display menus
    // ---------------------------
    public void displayZodiacMenu() {
        System.out.println("Zodiac Sandwich Menu:");
        for (int i = 0; i < zodiacMenu.size(); i++) {
            System.out.println((i + 1) + ") " + zodiacMenu.get(i).getName());
        }
    }

    public void displaySignatureMenu() {
        System.out.println("Signature Sandwich Menu:");
        for (int i = 0; i < signatureMenu.size(); i++) {
            System.out.println((i + 1) + ") " + signatureMenu.get(i).getName());
        }
    }

    // ---------------------------
    // Select a sandwich by number
    // ---------------------------
    public Sandwich getZodiacByIndex(int index) {
        if (index < 1 || index > zodiacMenu.size()) return null;
        return zodiacMenu.get(index - 1);
    }

    public Sandwich getSignatureByIndex(int index) {
        if (index < 1 || index > signatureMenu.size()) return null;
        return signatureMenu.get(index - 1);
    }
}