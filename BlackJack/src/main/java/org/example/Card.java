package org.example;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String _suit, String _value) {
        this.suit = _suit;
        this.value = _value;
        this.isFaceUp = false;
    }

    public String getSuit() {
        if(isFaceUp) {
            return suit;
        } else {
            return "Card is face down";
        }
    }

    public String getValue() {
        if(isFaceUp) {
            return value;
        } else {
            return "Card is face down";
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public int getPointValue() {
        if (isFaceUp) {
            return switch (value) {
                case "A" -> 11;
                case "K" -> 10;
                case "Q" -> 10;
                case "J" -> 10;
                case "2" -> 2;
                case "3" -> 3;
                case "4" -> 4;
                case "5" -> 5;
                case "6" -> 6;
                case "7" -> 7;
                case "8" -> 8;
                case "9" -> 9;
                case "10" -> 10;
                default -> 0; // For face cards or invalid values
            };
        } else {
            return 0; // Card is face down, no point value
        }
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }
}
