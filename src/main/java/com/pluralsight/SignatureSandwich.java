package com.pluralsight;

public class SignatureSandwich extends Sandwich {

    public SignatureSandwich(String zodiacName) {
        super();  // uses your default constructor
        setZodiacSandwich(zodiacName);
    }

    public SignatureSandwich(int zodiacNumber) {
        super();
        setZodiacSandwich(getZodiacName(zodiacNumber));
    }

    private String getZodiacName(int num) {
        switch (num) {
            case 1: return "Aries";
            case 2: return "Taurus";
            case 3: return "Gemini";
            case 4: return "Cancer";
            case 5: return "Leo";
            case 6: return "Virgo";
            case 7: return "Libra";
            case 8: return "Scorpio";
            case 9: return "Sagittarius";
            case 10: return "Capricorn";
            case 11: return "Aquarius";
            case 12: return "Pisces";
            default: return "Unknown";
        }
    }

    private void setZodiacSandwich(String sign) {

        // All signature sandwiches are toasted
        setToasted(true);

        switch (sign) {

            case "Aries":
                getMeatToppings().add("Buffalo chicken");
                getCheeseToppings().add("Pepper jack");
                getRegularToppings().add("Chipotle mayo");
                break;

            case "Taurus":
                getMeatToppings().add("Roast beef");
                getCheeseToppings().add("Cheddar");
                getRegularToppings().add("Lettuce");
                getRegularToppings().add("Tomato");
                break;

            case "Gemini":
                getMeatToppings().add("Turkey");
                getMeatToppings().add("Ham");
                getCheeseToppings().add("Swiss");
                break;

            case "Cancer":
                getMeatToppings().add("Chicken salad");
                getRegularToppings().add("Lettuce");
                break;

            case "Leo":
                getMeatToppings().add("Steak slices");
                getCheeseToppings().add("Havarti");
                getRegularToppings().add("Truffle aioli");
                break;

            case "Virgo":
                getMeatToppings().add("Grilled chicken");
                getCheeseToppings().add("Provolone");
                getRegularToppings().add("Cucumber");
                break;

            case "Libra":
                getMeatToppings().add("Salami");
                getCheeseToppings().add("Mozzarella");
                getRegularToppings().add("Basil pesto");
                break;

            case "Scorpio":
                getMeatToppings().add("Spicy capicola");
                getCheeseToppings().add("Smoked gouda");
                getRegularToppings().add("Hot honey");
                break;

            case "Sagittarius":
                getMeatToppings().add("Grilled lamb");
                getCheeseToppings().add("Feta");
                getRegularToppings().add("Tzatziki");
                break;

            case "Capricorn":
                getMeatToppings().add("Turkey");
                getCheeseToppings().add("Sharp cheddar");
                getRegularToppings().add("Mustard");
                break;

            case "Aquarius":
                getMeatToppings().add("Jerk jackfruit");
                getCheeseToppings().add("Feta crumble");
                getRegularToppings().add("Citrus tahini");
                break;

            case "Pisces":
                getMeatToppings().add("Tuna salad");
                getRegularToppings().add("Pickles");
                getRegularToppings().add("Lemon dill sauce");
                break;
        }
    }
}