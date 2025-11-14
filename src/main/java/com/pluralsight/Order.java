package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private List<SignatureSandwich> sandwiches;
    private int chipsCount;
    private int drinksCount;

    public Order() {
        sandwiches = new ArrayList<>();
        chipsCount = 0;
        drinksCount = 0;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add((SignatureSandwich) sandwich);
    }

    public void addChip() {
        chipsCount++;
        System.out.println("Chips added to order!");
    }

    public void addDrink() {
        drinksCount++;
        System.out.println("Drink added to order!");
    }

    public boolean isEmpty(){
        return sandwiches.isEmpty() && chipsCount == 0 && drinksCount == 0;
    }

    public void displayOrder() {
        System.out.println("🪐 Your Heavenly Order 🪐");

        double total = 0;
        int count = 1;

        for (Sandwich s : sandwiches) {
            System.out.println(count++ + ") " + s.getName());
            System.out.println(s);
            System.out.println("--------------------------");
            total += s.getPrice();
        }

        if (chipsCount > 0) {
            System.out.println("Chips x" + chipsCount + " - $" + (chipsCount * 1.50));
            total += chipsCount * 1.50;
        }

        if (drinksCount > 0) {
            System.out.println("Drinks x" + drinksCount + " - $" + (drinksCount * 2.00));
            total += drinksCount * 2.00;
        }

        System.out.printf("Total: $%.2f%n", total);
    }

    // --- Save receipt to file ---
    public void saveReceipt() {
        if (isEmpty()) {
            System.out.println("Cannot save empty order.");
            return;
        }

        // Create the receipts folder if it doesn’t exist
        File folder = new File("receipts");
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Create the file name (e.g. 20251112-154233.txt)
        String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        File file = new File(folder, timestamp + ".txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("✨ Bria's Heavenly Deli ✨\n");
            writer.write("Where every bite is written in the stars \n");
            writer.write("Receipt Date: " + new Date() + "\n\n");

            double total = 0;
            int count = 1;

            for (Sandwich s : sandwiches) {
                writer.write(count++ + ") " + s.getName() + "\n");
                writer.write(s.toString() + "\n");
                writer.write("--------------------------\n");
                total += s.getPrice();
            }

            if (chipsCount > 0) {
                writer.write("Chips x" + chipsCount + " - $" + (chipsCount * 1.50) + "\n");
                total += chipsCount * 1.50;
            }

            if (drinksCount > 0) {
                writer.write("Drinks x" + drinksCount + " - $" + (drinksCount * 2.00) + "\n");
                total += drinksCount * 2.00;
            }

            writer.write(String.format("Total: $%.2f%n", total));
            writer.write("\nThank you for visiting Bria’s Heavenly Deli!\n");

            System.out.println("\n Receipt saved successfully as: " + file.getName());
        } catch (IOException e) {
            System.out.println(" Error saving receipt: " + e.getMessage());
        }
    }

}

