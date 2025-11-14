package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer order.
 * Contains sandwiches, chips, and drinks.
 */
public class Order {

    private List<Sandwich> sandwiches;
    private int chipsCount;
    private int drinksCount;

    public Order() {
        sandwiches = new ArrayList<>();
        chipsCount = 0;
        drinksCount = 0;
    }

    // ---------------------------
    // Sandwiches
    // ---------------------------
    public void addSandwich(Sandwich s) {
        sandwiches.add(s);
    }

    public List<Sandwich> getItems() {
        return sandwiches;
    }

    public boolean isEmpty() {
        return sandwiches.isEmpty() && chipsCount == 0 && drinksCount == 0;
    }

    // ---------------------------
    // Chips
    // ---------------------------
    public void addChip() {
        chipsCount++;
    }

    public int getChipsCount() {
        return chipsCount;
    }

    // ---------------------------
    // Drinks
    // ---------------------------
    public void addDrink() {
        drinksCount++;
    }

    public int getDrinksCount() {
        return drinksCount;
    }

    // ---------------------------
    // Total price
    // ---------------------------
    public double getTotal() {
        double total = 0;
        for (Sandwich s : sandwiches) total += s.getPrice();
        total += chipsCount * 1.50;  // price per chip
        total += drinksCount * 2.00; // price per drink
        return total;
    }

    // ---------------------------
    // Display order
    // ---------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current Order:\n");
        int i = 1;
        for (Sandwich s : sandwiches) {
            sb.append(i).append(") ").append(s).append("\n------------------\n");
            i++;
        }
        sb.append("Chips: ").append(chipsCount).append("\n");
        sb.append("Drinks: ").append(drinksCount).append("\n");
        sb.append(String.format("Total: $%.2f", getTotal()));
        return sb.toString();
    }
}