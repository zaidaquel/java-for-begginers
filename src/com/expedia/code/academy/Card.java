package com.expedia.code.academy;

import java.util.Objects;

public class Card {

    private final int value;
    private final String name;

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    /**
     *
     * returns the card value. Ace=1, Face cards are 10 and any other card is its pip value.
     */
    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return name;
    }
}
