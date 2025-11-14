package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    private static final String RECEIPTS_FOLDER = "receipts";
    private static final DateTimeFormatter FILE_NAME_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

    public static String writeReceipt(Order order) throws IOException {
        if (order == null || order.isEmpty()) {
            throw new IllegalArgumentException("Cannot write an empty order to receipt.");
        }

        // Ensure receipts directory exists
        File folder = new File(RECEIPTS_FOLDER);
        if (!folder.exists()) {
            folder.mkdir(); // simple and sufficient for this project
        }

        // Build filename with timestamp
        String timestamp = LocalDateTime.now().format(FILE_NAME_FORMAT);
        String filename = timestamp + ".txt";
        File out = new File(folder, filename);

        // Write the order string into the file
        try (FileWriter writer = new FileWriter(out)) {
            writer.write("Bria's Heavenly Deli - Receipt\n");
            writer.write("Date: " + LocalDateTime.now().toString() + "\n\n");
            writer.write(order.toString());
            writer.write("\nThank you for ordering from Bria's Heavenly Deli\n");
        }

        // Return the path so MainApp can inform the user where the file is
        return out.getAbsolutePath();
    }
}


