package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private String breadType;
    private List <String> meats;
    private List <String> cheeses;
    private List <String> regularToppings;
    private List <String> sauces;
    private double basePrice;

    //Constructor

    public Sandwich() {
        this.breadType = "White";
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.regularToppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.basePrice = 8.50; // default base price for all sandwiches
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<String> getMeats() {
        return meats;
    }

    public void setMeats(List<String> meats) {
        this.meats = meats;
    }

    public List<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<String> cheeses) {
        this.cheeses = cheeses;
    }

    public List<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String toString() {
        return "Bread:" + breadType + "\n" +
                "Meats:" + String.join(",", meats) + "\n" +
                "Cheeses:" + String.join(",", cheeses) + "\n" +
                "Toppings:" + String.join(",", sauces) + "\n" +
                "Sauces:" + String.join(",", sauces) + "\n" +
                String.format("Price: $%.2f%n", getBasePrice());
    }
}
