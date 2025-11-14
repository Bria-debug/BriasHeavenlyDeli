package com.pluralsight;

/**
 * ZodiacSandwich sets a sandwich name based on zodiac sign.
 */
public class ZodiacSandwich extends Sandwich {

    public ZodiacSandwich(String zodiacSign) {
        super(getMenuNameForSign(zodiacSign), 8.50); // set name and price

        // Default preparation
        setSize(8);
        setBreadType("White");
        setToasted(true);
    }

    private static String getMenuNameForSign(String sign) {
        if (sign == null) return "Zodiac Special";
        switch (sign.trim().toLowerCase()) {
            case "aries":       return "Aries - The Firestarter";
            case "taurus":      return "Taurus - The Comfort Fix";
            case "gemini":      return "Gemini - The Two-Step";
            case "cancer":      return "Cancer - Mama's Hug";
            case "leo":         return "Leo - The Spotlight";
            case "virgo":       return "Virgo - The Purist";
            case "libra":       return "Libra - The Balance Beam";
            case "scorpio":     return "Scorpio - The Deep End";
            case "sagittarius": return "Sagittarius - The Wanderlust";
            case "capricorn":   return "Capricorn - The Boss";
            case "aquarius":    return "Aquarius - The Rebel";
            case "pisces":      return "Pisces - The Dreamboat";
            default:            return "Zodiac Special (" + sign + ")";
        }
    }
}