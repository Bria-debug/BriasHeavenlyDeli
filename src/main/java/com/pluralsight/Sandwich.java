package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a basic sandwich.
 */
public class Sandwich {

    private String name;        // sandwich menu name
    private double basePrice;   // base price
    private int size;           // size in inches
    private String breadType;   // bread selection
    private boolean toasted;    // toasted or not

    // Topping categories
    private List<String> meatToppings;
    private List<String> cheeseToppings;
    private List<String> regularToppings;

    /**
     * Constructor requires name and base price.
     */
    public Sandwich(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.size = 8;
        this.breadType = "White";
        this.toasted = false;

        this.meatToppings = new ArrayList<>();
        this.cheeseToppings = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
    }

    // ---------------------------
    // Getters and Setters
    // ---------------------------
    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }
    public String getBreadType() { return breadType; }
    public void setBreadType(String breadType) { this.breadType = breadType; }
    public boolean isToasted() { return toasted; }
    public void setToasted(boolean toasted) { this.toasted = toasted; }

    // ---------------------------
    // Toppings
    // ---------------------------
    public void addMeat(String meat) { meatToppings.add(meat); }
    public void addCheese(String cheese) { cheeseToppings.add(cheese); }
    public void addTopping(String topping) { regularToppings.add(topping); }

    public List<String> getMeatToppings() { return meatToppings; }
    public List<String> getCheeseToppings() { return cheeseToppings; }
    public List<String> getRegularToppings() { return regularToppings; }

    // ---------------------------
    // Price calculation
    // ---------------------------
    public double getPrice() {
        double meatCost = meatToppings.size() * 1.00;
        double cheeseCost = cheeseToppings.size() * 0.75;
        return basePrice + meatCost + cheeseCost;
    }

    // ---------------------------
    // Display
    // ---------------------------
    @Override
    public String toString() {
        return name + " (" + size + " inch)\n" +
                "Bread: " + breadType + (toasted ? " (toasted)" : "") + "\n" +
                "Meats: " + meatToppings + "\n" +
                "Cheeses: " + cheeseToppings + "\n" +
                "Toppings: " + regularToppings + "\n" +
                String.format("Price: $%.2f", getPrice());
    }
}