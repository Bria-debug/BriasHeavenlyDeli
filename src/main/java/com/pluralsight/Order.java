package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private List<SignatureSandwich> sandwiches;

    public Order() {
        sandwiches = new ArrayList<>();
    }

    public void addSandwich(SignatureSandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void displayOrder() {
        System.out.println("🪐 Your Heavenly Order 🪐");

        if (sandwiches.isEmpty()) {
            System.out.println("No sandwiches in this order yet.\n");
            return;
        }

        double total = 0;
        for (int i = 0; i < sandwiches.size(); i++) {
            SignatureSandwich s = sandwiches.get(i);
            System.out.println((i + 1) + ") " + s.getName());
            System.out.println(s);
            System.out.println("--------------------------");
            total += s.getPrice();
        }

        System.out.printf("Total: $%.2f%n%n", total);
    }

    public double getTotal() {
        double total = 0;
        for (SignatureSandwich s : sandwiches) {
            total += s.getPrice();
        }
        return total;
    }

    public boolean isEmpty() {
        return sandwiches.isEmpty();
    }

    public List<SignatureSandwich> getSandwiches() {
        return sandwiches;
    }

    public void saveReceipt() {
        if (sandwiches.isEmpty()) {
            System.out.println("Cannot save empty order.");
            return;
        }

        try {

            File folder = new File("receipts");
            if (!folder.exists()) {
                folder.mkdir();
            }

            // Create a unique filename using the current date and time
            String fileName = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()) + ".txt";
            File file = new File(folder, fileName);

            // Write the receipt contents
            FileWriter writer = new FileWriter(file);
            writer.write("*** Bria's Heavenly Deli Receipt ***\n");
            writer.write("Where every bite is written in the stars ✨\n\n");

            double total = 0;
            for (int i = 0; i < sandwiches.size(); i++) {
                SignatureSandwich s = sandwiches.get(i);
                writer.write((i + 1) + ") " + s.getName() + "\n");
                writer.write(s.toString() + "\n");
                writer.write("------------------------------\n");
                total += s.getPrice();
            }

            writer.write(String.format("Total: $%.2f%n", total));
            writer.write("Thank you for dining with us 💫\n");
            writer.write("Saved on: " + new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()) + "\n");

            writer.close();

            System.out.println("🧾 Receipt saved to: " + file.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }}
