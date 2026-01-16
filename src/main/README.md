**Bria's Heavenly Deli**

**Welcome to Bria's Heavenly Deli!**  

A simple console-based Java application that simulates a deli where customers can order signature sandwiches, zodiac-themed sandwiches, and add sides like chips and drinks. 
This project demonstrates object-oriented programming, file I/O, and user interaction in Java.

**Features**

- Zodiac Signature Sandwiches: Customers can order sandwiches themed after zodiac signs.
- Chef Signature Sandwiches: Special signature sandwiches created by Bria's Heavenly Deli.
- Customizable Orders: Add multiple sandwiches, chips and drinks in a single order.
- Order Summary: Display the current order with prices and totals.
- Receippt Saving: Each completed order is saved as a timestamped file in the receipts/folder.
- Beginner-Friendly: Uses core Java features: classes, lists, loops, Scanner and file I/O.

**Classes**

**- Sandwich:** Base class for all sandwiches, it stores the name and price, as well as provides toString() for display and receipt writing.
  Stores the base structure of all sandwiches.
  This class contains fields such as name, price, bread type, toppings list, and size.
  It uses constructors, getters/setters, and a toString() method for clean display on both the console and the receipt.
  It also provides shared behavior (like pricing rules) so that all sandwich types can reuse the same logic.

**-ZodiacSandwich:** Represents a preset zodiac themed sandwich with a fixed price.
A subclass of Sandwich that automatically generates a complete sandwich based on the user’s zodiac choice.
Uses a switch statement to assign preset names, ingredients, and a fixed price.
Demonstrates inheritance by calling super() and overriding/adding behavior to customize the sandwich.

**- SignatureSandwich** : Represents a chef's signature sandwich with a set names and prices.
  Another subclass of Sandwich representing Bria’s chef-designed sandwiches.
  Uses predefined ingredient sets and prices, and shows how multiple types of sandwiches can share a base class but differ in behavior.
  Reinforces inheritance and clean separation of sandwich varieties.

**- Menu:** Holds available zodiac and signature sandwiches, and displays them to the user.
  Stores arrays/lists of available Zodiac and Signature sandwiches.
  Displays clean ASCII-style tables in the console using formatted System.out.println output.
  Encapsulates menu logic separate from ordering logic, showing good separation of concerns.

**- Order:** Stores the current order including sandwiches, chips and drinks as well as calculate total.
  Manages the list of sandwiches, chips, and drinks.
  Provides methods to add items, calculate subtotal/tax/total, and generate a summary string.
  Uses an ArrayList and loops to process all order items, demonstrating collection handling and iteration.

**- Receipt Writer:** Writes the order to a timestamoed text file in the receipts/folder.
  Handles file I/O using FileWriter or PrintWriter.
  Creates a timestamped file name using Java’s date/time classes.
  Writes receipt text into the receipts/ folder showing file handling, exception management, and folder creation.

**- MainApp:**  Console interface that interacts with the user, handles menu navigation, order building and checkout.
  The console-driven UI using Scanner for input.
  Contains loops, input validation, and menu navigation logic.
  Coordinates all classes together — menu display, sandwich creation, order building, and checkout.
  Demonstrates user interaction flow, program control structures, and integration of all components.

How to Use

1. The console displays a main menu with options to view/ order zodiac sandwiches, signature sandwiches, add sides, view order or checkout.
2. When ordering sandwiches, select the number corresponding the sandwich.
3. Multiple sandwiches, chips and drinks can be added before checkout.
4. When you are ready to order, select checkout:
- The order summary is displayed.
- You can confirm the order by typing yes.
- The order is saved as a receipts/folder with the filename format yyyyMMdd-HHmmss.txt. 


