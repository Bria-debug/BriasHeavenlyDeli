Bria's Heavenly Deli

Welcome to Bria's Heavenly Deli!  

A simple console-based Java application that simulates a deli where customers can order signature sandwiches, zodiac-themed sandwiches, and add sides like chips and drinks. 
This project demonstrates object-oriented programming, file I/O, and user interaction in Java.

Features

- Zodiac Signature Sandwiches: Customers can order sandwiches themed after zodiac signs.
- Chef Signature Sandwiches: Special signature sandwiches created by Bria's Heavenly Deli.
- Customizable Orders: Add multiple sandwiches, chips and drinks in a single order.
- Order Summary: Display the current order with prices and totals.
- Receippt Saving: Each completed order is saved as a timestamped file in the receipts/folder.
- Beginner-Friendly: Uses core Java features: classes, lists, loops, Scanner and file I/O.

Classes

- Sandwich: Base class for all sandwiches, it stores the name and price, as well as provides toString() for display and receipt writing.
- ZodiacSandwich: Represents a preset zodiac themed sandwich with a fixed price.
- SignatureSandwich : Represents a chef's signature sandwich with a set names and prices.
- Menu: Holds available zodiac and signature sandwiches, and displays them to the user.
- Order: Stores the current order including sandwiches, chips and drinks as well as calculate total.
- Receipt Writer: Writes the order to a timestamoed text file in the receipts/folder.
- MainApp - Console interface that interacts with the user, handles menu navigation, order building and checkout.

How to Use

1. The console displays a main menu with options to view/ order zodiac sandwiches, signature sandwiches, add sides, view order or checkout.
2. When ordering sandwiches, select the number corresponding the sandwich.
3. Multiple sandwiches, chips and drinks can be added before checkout.
4. When you are ready to order, select checkout:
- The order summary is displayed.
- You can confirm the order by typing yes.
- The order is saved as a receipts/folder with the filename format yyyyMMdd-HHmmss.txt. 


