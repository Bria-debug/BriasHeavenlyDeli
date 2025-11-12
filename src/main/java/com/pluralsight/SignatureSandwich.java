package com.pluralsight;

public class SignatureSandwich extends Sandwich{

    private String zodiacName;

    public SignatureSandwich(String zodiacName){
        super();// calls sandwich constructor
        this.zodiacName = zodiacName;

        setPresetToppings(); //sets default toppings based on zodiac
    }

    private void setPresetToppings() {
        //zodiac names matches to a recipe
        switch (zodiacName.toLowerCase()){
            case "virgo":
                setSize("8\"");
                setBreadType ("honey butter");
                getMeats().add("turkey");
                getCheeses().add("chipotle gouda");
                getRegularToppings().add("spinach");
                getRegualrToppings().add("jalap")
    }
}
