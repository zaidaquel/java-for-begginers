package com.expedia.code.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {

    private List<Card> cards = new ArrayList<>();
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public void hit(Card card) {
        cards.add(card);
    }

    public int getTotal() {
        int total = 0;
        for (Card card : cards) {
            total += (card.getValue() > 10 ? 10 : card.getValue());
        }
        return total;
    }

    public String getName(){
        return name;
    }

    public List<Card> cards() {
        return Collections.unmodifiableList(cards);
    }

    @Override
    public String toString() {
        return "Player:" + name + ", Total:" + getTotal();
    }
}
