package org.example;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void Deal(Card card) {
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }
}
