package pl.edu.agh.model;

import java.util.List;

public class Hand extends CardSet{

    private static final int MAX_CARDS_IN_HAND = 5;

    private List<Card> cards;

    public Hand() {
        super();
    }

    public Hand(List<Card> cards) {
        super(cards);
    }

}