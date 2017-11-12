package com.expedia.code.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deckCards;

    public void initialize() {
        deckCards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            deckCards.addAll(Arrays.asList(new Card(1, "Ace"),
                    new Card(2, "Two"), new Card(3, "Three"),
                    new Card(4, "Four"), new Card(5, "Five"),
                    new Card(6, "Six"), new Card(7, "Seven"),
                    new Card(8, "Eight"), new Card(9, "Nine"),
                    new Card(10, "Ten"), new Card(11, "Jack"),
                    new Card(12, "Queen"), new Card(13, "King")));
        }
    }

    public void shuffle(){
        Collections.shuffle(deckCards);
    }

    public Card withdraw() throws EmptyDeckException {
        if(deckCards !=null  && !deckCards.isEmpty()){
            return deckCards.remove(0);
        }
        throw new EmptyDeckException("Oops, the deck is empty!");
    }
}
