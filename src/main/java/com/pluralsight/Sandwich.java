package com.pluralsight;

public class Sandwich {
    private String name;
    private double price;

    // Basic constructor
    public Sandwich(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Default constructor
    public Sandwich() {
        this("Unnamed Sandwich", 0.0);
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return getName() + " - $" + String.format("%.2f", getPrice());
    }
}