package pl.edu.agh.model;

import java.util.List;

public class CoveredCards extends CardSet {

    public CoveredCards() {
        super();
    }

    public CoveredCards(List<Card> cards) {
        super(cards);
    }

    public Card takeFirst() {
        return getCards().remove(0);
    }
}
