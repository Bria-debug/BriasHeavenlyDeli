package com.pluralsight;

/**
 * SignatureSandwich is a pre-defined sandwich with preset toppings.
 */
public class SignatureSandwich extends Sandwich {

    public SignatureSandwich(String name) {
        super(name, 8.50); // fixed price for all signatures

        setSize(8);
        setBreadType("White");
        setToasted(true);

        // Add toppings based on sandwich name
        switch (name.toLowerCase()) {
            case "aries":
                addMeat("Buffalo chicken");
                addCheese("Pepper jack");
                addTopping("Chipotle mayo");
                break;
            case "taurus":
                addMeat("Roast beef");
                addCheese("Cheddar");
                addTopping("Lettuce");
                addTopping("Tomato");
                break;
            case "leo":
                addMeat("Steak slices");
                addCheese("Havarti");
                addTopping("Truffle aioli");
                break;
            // Add the rest as needed...
            default:
                addTopping("House special sauce");
        }
    }
}