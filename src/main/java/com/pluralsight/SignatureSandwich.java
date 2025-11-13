package com.pluralsight;

public class SignatureSandwich extends Sandwich {

    private String zodiacName;

    public SignatureSandwich(String zodiacName) {
        super();// calls sandwich constructor
        this.zodiacName = zodiacName;
        setPresetToppings(); //sets default toppings based on zodiac
    }

    private void setPresetToppings() {
        //zodiac names matches to a recipe
        switch (zodiacName.toLowerCase()) {
            case "aries":
                setBreadType("Jalapeño cheddar cornbread loaf");
                getMeats().add("Spicy fried chicken breast");
                getCheeses().add("Pepper jack");
                getRegularToppings().add("Pickled red onions");
                getRegularToppings().add("Shredded romaine");
                getSauces().add("Hot honey remoulade");
                break;

            case "taurus":
                setBreadType("Buttermilk biscuit sandwich");
                getMeats().add("Smoked turkey (brown sugar glaze)");
                getCheeses().add("Sharp cheddar");
                getRegularToppings().add("Collard green slaw");
                getRegularToppings().add("Tomato slice");
                getSauces().add("Garlic herb mayo");
                break;

            case "gemini":
                setBreadType("Half Hawaiian roll + half Texas toast");
                getMeats().add("Half BBQ pulled pork");
                getMeats().add("Half jerk chicken");
                getCheeses().add("Gouda");
                getRegularToppings().add("Pineapple salsa");
                getRegularToppings().add("Pickled okra slices");
                getSauces().add("Mango-chipotle aioli");
                break;

            case "cancer":
                setBreadType("Honey butter brioche bun");
                getMeats().add("Fried catfish filet");
                getCheeses().add("American");
                getRegularToppings().add("Lettuce");
                getRegularToppings().add("Tomato");
                getRegularToppings().add("Bread & butter pickles");
                getSauces().add("Cajun tartar sauce");
                break;

            case "leo":
                setBreadType("Toasted ciabatta roll");
                getMeats().add("Blackened ribeye steak slices");
                getCheeses().add("Havarti");
                getRegularToppings().add("Caramelized onions");
                getRegularToppings().add("Arugula");
                getSauces().add("Truffle garlic aioli");
                break;

            case "virgo":
                setBreadType("Multigrain loaf");
                getMeats().add("Herb-roasted chicken breast");
                getCheeses().add("Swiss");
                getRegularToppings().add("Cucumber ribbons");
                getRegularToppings().add("Spinach");
                getRegularToppings().add("Pickled carrots");
                getSauces().add("Lemon-dill yogurt sauce");
                break;

            case "libra":
                setBreadType("Sweet potato bun");
                getMeats().add("Turkey");
                getMeats().add("Honey ham");
                getCheeses().add("Brie");
                getRegularToppings().add("Spring greens");
                getRegularToppings().add("Sliced apple");
                getSauces().add("Fig mustard glaze");
                break;

            case "scorpio":
                setBreadType("Dark rye");
                getMeats().add("Cajun roast beef");
                getCheeses().add("Smoked gouda");
                getRegularToppings().add("Roasted red peppers");
                getRegularToppings().add("Jalapeños");
                getSauces().add("Black garlic aioli");
                break;

            case "sagittarius":
                setBreadType("Toasted Cuban roll");
                getMeats().add("Mojo pork");
                getCheeses().add("Provolone");
                getRegularToppings().add("Plantain chips");
                getRegularToppings().add("Pickled red onions");
                getSauces().add("Cilantro-lime crema");
                break;

            case "capricorn":
                setBreadType("Classic sourdough");
                getMeats().add("Country ham or brisket");
                getCheeses().add("White cheddar");
                getRegularToppings().add("Kale slaw");
                getRegularToppings().add("Tomato");
                getSauces().add("Horseradish mayo");
                break;

            case "aquarius":
                setBreadType("Spinach wrap");
                getMeats().add("Grilled jerk jackfruit or shrimp");
                getCheeses().add("Pepper feta crumble");
                getRegularToppings().add("Avocado");
                getRegularToppings().add("Shredded cabbage");
                getSauces().add("Citrus tahini dressing");
                break;

            case "pisces":
                setBreadType("Sweet honey croissant");
                getMeats().add("Lemon-butter salmon");
                getCheeses().add("Cream cheese spread");
                getRegularToppings().add("Cucumber");
                getRegularToppings().add("Dill");
                getRegularToppings().add("Arugula");
                getSauces().add("Honey-lemon glaze");
                break;

            default:
                setBreadType("White");
                getMeats().add("Ham");
                getCheeses().add("American");
                getRegularToppings().add("Lettuce");
                getSauces().add("Mayo");
                break;
        }
    }

    @Override
    public String toString() {
        return "* Zodiac Sandwich -" + zodiacName + "*\n" +
                super.toString();

    }

    public double getPrice() {
        return 5.55;
    }

    public String getName() {
        return zodiacName;
    }
}
